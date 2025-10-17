# FAQ

Q: Which Java version is required?
A: The project targets JDK 11+. Check `pom.xml` or `build.gradle` for the configured target.

Q: Where are configuration files?
A: Look in `src/main/resources` for `application.properties`, `application.yml`, or logging config files.

Q: How do I run tests?
A: Use `mvn test` or `./gradlew test` depending on the build tool present.

Q: Where are DB migration scripts?
A: Typical locations:
- Flyway: `src/main/resources/db/migration`
- Liquibase: `src/main/resources/db/changelog`

Q: How to change the server port?
A: Set in `application.properties`:
```
server.port=8081
```