### set docker env
eval $(minikube docker-env)

### build and package
cd api-alpha-service
mvn clean install
cd ..

cd api-beta-service
mvn clean install
cd ..

cd alpha-microservice
mvn clean install
cd ..

cd beta-microservice
mvn clean install
mvn package
cd ..

cd alpha-microservice
mvn clean install
mvn package
cd ..

cd swagger-proxy-service
mvn clean install
mvn package
cd ..

### service account
kubectl create clusterrolebinding admin --clusterrole=cluster-admin --serviceaccount=default:default

### nifi
kubectl delete -f nifi-deployment.yml
kubectl create -f nifi-deployment.yml

### alpha-service
kubectl delete configmap myalpha
kubectl delete -f alpha-microservice/alpha-service/myalpha-deployment.yml
kubectl create -f alpha-microservice/alpha-service/myalpha.yml
kubectl create -f alpha-microservice/alpha-service/myalpha-deployment.yml

### beta-service
kubectl delete configmap mybeta
kubectl delete -f beta-microservice/beta-service/mybeta-deployment.yml
kubectl create -f beta-microservice/beta-service/mybeta.yml
kubectl create -f beta-microservice/beta-service/mybeta-deployment.yml

### swagger-proxy-service
kubectl delete configmap swagger-proxy-service
kubectl delete -f swagger-proxy-service/swagger-proxy-service-deployment.yml
kubectl create -f swagger-proxy-service/swagger-proxy-service.yml
kubectl create -f swagger-proxy-service/swagger-proxy-service-deployment.yml

### ingress
kubectl apply -f https://raw.githubusercontent.com/kubernetes/ingress-nginx/master/deploy/static/mandatory.yaml
kubectl apply -f ingress.yml

# Check that the pods are running
kubectl get pods
