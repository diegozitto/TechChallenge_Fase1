# Dockerfile para aplicação Spring Boot com Java 17 (imagem leve e compatível)
FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
