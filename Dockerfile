FROM openjdk:17-jdk-slim AS build

COPY pom.xml mvnw ./
COPY src src

FROM openjdk:17-jdk-slim
WORKDIR askida-kitap
COPY --from=build target/*.jar kitap-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "kitap-0.0.1-SNAPSHOT.jar"]