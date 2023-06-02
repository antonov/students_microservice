FROM openjdk:21-jdk

LABEL authors="artem@antonov.es"
COPY build/libs/demo-0.0.1-SNAPSHOT.jar app-1.0.0.jar

ENTRYPOINT [ "java", "-jar", "app-1.0.0.jar" ]