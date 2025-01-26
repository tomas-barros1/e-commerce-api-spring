FROM maven:3.8.6-openjdk-17 AS build

WORKDIR /app

COPY pom.xml .

RUN mvn dependency:go-offline -B

COPY src ./src

RUN mvn package -DskipTests

FROM openjdk:17-jre-slim

WORKDIR /app

COPY --from=build /app/target/api-0.0.1-SNAPSHOT.jar ./api.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "api.jar"]