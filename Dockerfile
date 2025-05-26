FROM amazoncorretto:17

WORKDIR /app

COPY target/Bank_REST-0.1-RELEASE.jar ./Bank_REST.jar

ENTRYPOINT ["java", "-jar", "/app/Bank_REST.jar"]
