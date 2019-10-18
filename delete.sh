eval $(minikube docker-env)

kubectl delete configmap myalpha
kubectl delete -f alpha-microservice/alpha-service/myalpha-deployment.yml
kubectl delete configmap mybeta
kubectl delete -f beta-microservice/beta-service/mybeta-deployment.yml
kubectl delete -f nifi-deployment.yml

