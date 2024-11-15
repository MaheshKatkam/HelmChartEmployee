FROM openjdk:24-ea-17-jdk-slim-bullseye

RUN mkdir "app"

COPY target/helmchart-employee.jar /app/helmchart-employee.jar

EXPOSE 8888

WORKDIR /app

ENTRYPOINT ["java", "-jar", "helmchart-employee.jar"]