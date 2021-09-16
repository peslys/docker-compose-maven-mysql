# Set ubuntu 20.04 as base image
FROM ubuntu:20.04

# Install updates
RUN apt-get update && apt-get -y install software-properties-common

# Install wget, curl, vim
RUN apt-get -y install wget curl vim

# Install Java 11
RUN apt-get -y install openjdk-11-jdk

# Install Maven
RUN apt-get -y install maven

# Copy sample-maven-app to user directory
COPY . /usr/local/sample-maven-app/

# Maven install and assemble sample app
RUN cd /usr/local/sample-maven-app && mvn clean install assembly:single

# Execute app
CMD [ "java", "-jar", "/usr/local/sample-maven-app/target/sample-maven-app-1.0-jar-with-dependencies.jar" ] 

