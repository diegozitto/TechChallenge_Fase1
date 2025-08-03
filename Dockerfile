FROM maven:3.9.11-amazoncorretto-17-alpine as builder

WORKDIR /app

COPY src/ ./

COPY pom.xml

RUN mvn clean package

FROM amazoncorretto:17.0.16-alpine

WORKDIR /app

COPY --from=builder /app/target/*.jar app.jar

EXPOSE 8080

RUN apk add --no-cache shadow && useradd app_user && chmod 700 app.jar && chown app_user:app_user app.jar

CMD [ "java", "-jar", "app.jar" ]
