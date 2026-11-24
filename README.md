# foodie-pin-app
A personal food map app - save places you want to try or have visited, attach social media reels that recommended them, and add your own notes and photos! Built with Spring Boot, PostgreSQL and React.


## Project Structure

```text
foodie-pin/
├── server/              Spring Boot backend (Java 21, Maven)
│   ├── src/main/java/   Application code (com.masq.foodiepin)
│   ├── src/main/resources/   Configuration and database migrations
│   ├── src/test/        Tests
│   └── pom.xml          Dependencies and build settings
├── docs/
│   ├── tech-stack.md    Technologies used and why
│   └── decisions.md     Key design decisions and trade-offs
├── client/              React frontend (planned)
├── docker-compose.yml   Local database and services (planned)
└── README.md
```

Run backend commands from `server/`, for example `.\mvnw.cmd test`.