FROM java:8

ARG java_file=target/spring-quickstart-0.0.1-SNAPSHOT.jar

WORKDIR /opt/app
EXPOSE 5050

COPY ${java_file} app.jar
ENTRYPOINT [ "java","-jar", "app.jar" ]