FROM openjdk:8-jdk-alpine
WORKDIR /var/www/app/
COPY ./target/poc-kafka-ms-0.0.1.jar .
ENTRYPOINT ["java", "-jar", "poc-kafka-ms-0.0.1.jar"]
EXPOSE 8082