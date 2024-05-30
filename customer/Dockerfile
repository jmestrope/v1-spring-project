#Start with a base image containing Java runtime
FROM openjdk:17-jdk-slim

MAINTAINER samplemaintainer.com

COPY target/customer-0.0.1-SNAPSHOT.jar customer-0.0.1-SNAPSHOT.jar

# execute the application
ENTRYPOINT ["java", "-jar", "customer-0.0.1-SNAPSHOT.jar"]