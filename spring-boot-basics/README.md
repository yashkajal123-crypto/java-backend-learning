# Spring Boot Basics

A small REST app with a controller and service layer (Spring Boot 4.1.x, Java 21).

| Endpoint | Description |
|---|---|
| `GET /api/greeting?name=Yash` | Returns a greeting (defaults to `Guest`) |
| `GET /api/time` | Returns server time as `dd-MM-yyyy HH:mm:ss` |

## Run
```bash
cd SpringbootMavenApp
./mvnw spring-boot:run
```
Then open `http://localhost:8080/api/greeting`.
