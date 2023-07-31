## Running the application in dev mode
### Requirements

* linux/mac
    * [Sdk man](https://sdkman.io/install)
    * [Java 17 "Graalvm"](https://sdkman.io/jdks#grl)
        * ````shell
      sdk install java 22.0.0.2.r17-grl
      ````
    * [Maven](https://sdkman.io/sdks#maven)
        * ````shell
      sdk install maven
      ````
    * [Docker](https://docs.docker.com/get-docker/)

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.4/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.5.4/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.5.4/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)


### Run in full docker

* [Baixei o repositorio devtolls e execute o script lincado ](https://github.com/PicPay/devtools/blob/master/sandbox/scripts/docker-login.sh)
* [na raiz do projeto execute o comando abaixo para buildar e subir a imagem para chip intell]()  
  ``` make build```
* [na raiz do projeto execute o comando abaixo para buildar e subir a imagem para chip m1]()  
  ``` make build-m1```
### Run in dev mode
#### requirements local
* java 17
*  maven  3.8.3 ou superior


* [Baixei o repositorio devtolls e execute o script lincado ](https://github.com/PicPay/devtools/blob/master/sandbox/scripts/docker-login.sh)
* [na raiz do projeto execute o comando abaixo para instalar as dependencias]()  
  ``` make install```
* [Execute o comando abaixo para subir o container para processador m1]()  
  ``` make up-m1```
* [Execute o comando abaixo para subir o container para processador intel]()  
  ``` make up ```
