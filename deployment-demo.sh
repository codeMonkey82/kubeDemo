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

### service account
kubectl create clusterrolebinding admin --clusterrole=cluster-admin --serviceaccount=default:default

### alpha-service
kubectl delete configmap alpha-service
kubectl delete -f alpha-microservice/alpha-service/alpha-service-deployment.yml
kubectl create -f alpha-microservice/alpha-service/alpha-service.yml
kubectl create -f alpha-microservice/alpha-service/alpha-service-deployment.yml

### beta-service
kubectl delete configmap beta-service
kubectl delete -f beta-microservice/beta-service/beta-service-deployment.yml
kubectl create -f beta-microservice/beta-service/beta-service.yml
kubectl create -f beta-microservice/beta-service/beta-service-deployment.yml

### nifi
kubectl delete -f nifi-deployment.yml
kubectl create -f nifi-deployment.yml

### ingress
kubectl apply -f ingress.yml

# Check that the pods are running
kubectl get pods
