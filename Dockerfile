FROM maven:3.8.5-openjdk-19.0.2 AS build
COPY . .
RUN mvn clean package -DskipTests
FROM openjdk:19.0.2-jdk-slim
COPY --from=build /target/FuturizeDeploy-0.0.1-SNAPSHOT.jar FuturizeDeploy-0.0.1-SNAPSHOT.jar
EXPOSE 8080

EntryPOINT ["java", "-jar", "FuturizeDeploy-0.0.1-SNAPSHOT.jar"]