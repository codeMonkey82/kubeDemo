## Spring Boot, Docker, Kubernetes, OpenFeign, Swagger Demo Solution

The purpose of the repository is to demonstrate how to integrate Spring Boot, Swagger, OpenFeign, Docker and Kubernetes. Additionally the API can be driven by either Swagger or Nifi.

What is in the project...

* API project for Alpha Service
* API Project for Beta Service
* Alpha Microservice based on Spring Boot
* Beta Microservice based on Spring Boot
* Scripts required to get it working as docker containers within Kubernetes  pods

### Pre-requirements

* Minikube
* kubectl
* Git
* Maven
* JDK 8

### Deploying

Open a terminal to the root of the repository and run the following command...

* sh deployment-demo.sh

This will deal with building the API, services, packaging and deploying into Minikube

### After Deployment

Open a web browser to...

* http://microservices.info/nifi

Setup processors to drive the service endpoints

### Direct Get Endpoints

* http://alpha-service:9191/alpha/status/alpha
* http://alpha-service:9191/alpha/status/beta
* http://alpha-service:9192/beta/status/alpha
* http://alpha-service:9192/beta/status/beta

#### via NGINX Ingress

* http://microservices.info/alpha/status/alpha
* http://microservices.info/alpha/status/beta
* http://microservices.info/beta/status/alpha
* http://microservices.info/beta/status/beta

### Swagger API

In order to access API documentation after running up the cluster it is possible to query and exercise the service API via swagger ui.

Access the central swagger API documentation on the following address...

* http://microservices.info:30087/swagger-ui.html
