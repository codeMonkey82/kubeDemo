### set docker env
eval $(minikube docker-env)

### build and package
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

### Configs
# kubectl create -f client-service/client-config.yaml
# kubectl create -f client-service/client-service-deployment.yaml
 
# Check that the pods are running
kubectl get pods
