# Getting Started

This document explains how to prepare your environment, build the project, and run the application locally.

Note: The repository is Java-based. Adjust commands below if the project uses a specific build tool version, custom profiles, or extra configuration.

Prerequisites
- Java JDK 11+ installed and JAVA_HOME configured.
- Maven (pom.xml) or Gradle (build.gradle / build.gradle.kts) — check the repo to see which is used.
- Git to clone the repository.

Clone the repository
```bash
git clone https://github.com/GangadharaRamegowda/SampleWebApplication.git
cd SampleWebApplication
```

Build
- If the project uses Maven:
```bash
mvn -B clean package
# artifact typically at: target/*.jar
```
- If the project uses Gradle:
```bash
./gradlew clean build
# artifact typically at: build/libs/*.jar
```

Run
- If the project produces a runnable jar:
```bash
java -jar target/your-app.jar
# or
java -jar build/libs/your-app.jar
```
- For Spring Boot projects during development:
```bash
mvn spring-boot:run
# or
./gradlew bootRun
```

Configuration
- Check `src/main/resources/application.properties` or `application.yml`.
- Use environment variables or profiles for secrets and environment-specific settings.

Running tests
- Maven:
```bash
mvn test
```
- Gradle:
```bash
./gradlew test
```

Common issues
- "Unsupported major.minor version": ensure JAVA_HOME points to the correct JDK.
- Port conflicts: change server.port in application properties or stop the conflicting process.