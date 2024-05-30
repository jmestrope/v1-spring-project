#Start with a base image containing Java runtime
FROM openjdk:17-jdk-slim

MAINTAINER samplemaintainer.com

COPY target/configserver-0.0.1-SNAPSHOT.jar configserver-0.0.1-SNAPSHOT.jar

# execute the application
ENTRYPOINT ["java", "-jar", "configserver-0.0.1-SNAPSHOT.jar"]