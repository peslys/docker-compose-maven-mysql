# docker-compose-maven-mysql
A Docker application which consists of multiple containers(sample-maven-app and MySQL). It uses docker-compose capabilities to bring up or down both the container together and setup a network to allow the containers communicate with each other. A maven application running on one container will connect to MySQL database running on another container.

## sample-maven-app
It is maven project which consist of an App Java class. It tries to connect to MySQL database.

Dockerfile description:
* Uses Ubuntu 18.04 as a base image.
* Installs Java 11 and sets environment path
* Installs maven
* Builds project and generate an executable jar file with the help of maven assembly plugin
* Then it executes java -jar command to run jar sample-maven-app jar file

## docker-compose.yml
Docker compose file defines MySQL and sample-maven-app services. Following are the commands to use docker-compose:
* `docker-compose build` builds/rebuilds images for mysql and sample-maven-app
* `docker-compose up` to bring up application. Docker compose creates a network which can be used by containers to communicate with each other.
* `docker-compose down` to bring down the app
