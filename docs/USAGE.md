# Usage

Examples for running and interacting with the application locally.

Starting the application
- Development (Spring Boot example):
```bash
mvn spring-boot:run
# or
./gradlew bootRun
```
- Packaged JAR:
```bash
java -jar target/your-app.jar
# or
java -jar build/libs/your-app.jar
```

Health check (common path)
```bash
curl http://localhost:8080/actuator/health
```

Example endpoints (replace with actual endpoints from the repo)
- GET list:
```bash
curl -X GET "http://localhost:8080/api/example" -H "Accept: application/json"
```
- POST create:
```bash
curl -X POST "http://localhost:8080/api/example" \
  -H "Content-Type: application/json" \
  -d '{"name":"sample","value":42}'
```

Logging
- Default logging typically goes to the console. Configure levels in `application.properties` or `logback.xml`.

Database migrations
- Flyway migrations: `src/main/resources/db/migration`
- Liquibase changelogs: `src/main/resources/db/changelog`.