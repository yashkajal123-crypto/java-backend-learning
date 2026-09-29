# Java Backend Learning

My hands-on practice repository while learning Java and backend fundamentals. Each folder is self-contained and has its own README explaining what it covers and how to run it.

| Folder | What it covers | Tooling |
|---|---|---|
| [`java-core/`](java-core) | Core Java: OOP, collections, streams, lambdas, threads, exceptions, records, sealed classes | VS Code |
| [`maven-basics/`](maven-basics) | Maven project structure, `pom.xml`, dependencies, jar vs war packaging | IntelliJ IDEA |
| [`junit-testing/`](junit-testing) | Unit testing with JUnit 4 and 5, TDD, exception and performance tests | IntelliJ IDEA + Maven |
| [`jdbc-mysql/`](jdbc-mysql) | JDBC workflow with MySQL: driver loading, connection, statements | IntelliJ IDEA |
| [`spring-boot-basics/`](spring-boot-basics) | First Spring Boot REST app with controller and service layers | IntelliJ IDEA + Maven |

## Requirements
- JDK 21
- Maven 3.9+ (or use the included `mvnw` in the Spring Boot project)
- MySQL 8+ (only for `jdbc-mysql/`)

## Note
This is a learning repository, so the code favours clarity and comments over production polish. Build output, IDE settings and credentials are intentionally not committed.
