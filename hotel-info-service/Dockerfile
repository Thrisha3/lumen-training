FROM java:8

ARG java_file=target/hotel-service.jar

WORKDIR /opt/app

COPY ${java_file} app.jar
ENTRYPOINT [ "java","-jar", "app.jar" ]


EXPOSE 2020