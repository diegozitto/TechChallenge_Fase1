#<<<<<<< build/docker
FROM maven:3.9.11-amazoncorretto-17-alpine as builder

WORKDIR /app

# Copia o pom.xml primeiro para aproveitar o cache das dependências
COPY pom.xml .
COPY .mvn .mvn
COPY mvnw .
COPY mvnw.cmd .

# Download das dependências
RUN mvn dependency:go-offline

# Agora copia o código fonte
COPY src src

# Compila o projeto
RUN mvn clean package -DskipTests

FROM amazoncorretto:17.0.16-alpine

WORKDIR /app

COPY --from=builder /app/target/*.jar app.jar

EXPOSE 8080

RUN addgroup -S app_group && adduser -S app_user -G app_group \
    && chown -R app_user:app_group /app \
    && chmod 500 app.jar

USER app_user

CMD [ "java", "-jar", "app.jar" ]
#=======
# Dockerfile para aplicação Spring Boot com Java 17 (imagem leve e compatível)
#FROM openjdk:17-jdk-slim

#WORKDIR /app

#COPY target/*.jar app.jar

#EXPOSE 8080

#ENTRYPOINT ["java", "-jar", "app.jar"]
#>>>>>>> master
