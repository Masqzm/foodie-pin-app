# Tech Stack
Last updated: 24/11/2026

## Backend
| Technology | Version | Purpose | Why chosen | Alternatives considered |
|---|---|---|---|---|
| Java (Temurin JDK) | 21.0.13 | Main language | I've learned Java (see decisions.md #001). TODO: why 21 specifically | TODO |
| Spring Boot | 4.x (exact version: TODO) | REST API framework | TODO | TODO |
| Maven | (bundled with project) | Build tool | TODO | Gradle |
| Spring Data JPA | (managed by Boot) | Database access | TODO | TODO |
| Bean Validation | (managed by Boot) | Request validation | TODO | TODO |

## Database and Caching
| Technology | Version | Purpose | Why chosen | Alternatives considered |
|---|---|---|---|---|
| PostgreSQL | TODO | Main relational database | I've used MySQL and wanted to learn another database (decisions.md #003) | MySQL |
| Flyway | (managed by Boot) | Database migrations | TODO | TODO |
| Redis | TODO | Cache | Cache place-search and embed lookups to cut repeat API calls | In-memory cache (Caffeine) |

## Security
| Technology | Version | Purpose | Why chosen | Alternatives considered |
|---|---|---|---|---|
| Spring Security + JWT | TODO | Login and roles | TODO | OAuth2 login (e.g. Google) |

## Testing
| Technology | Version | Purpose | Why chosen | Alternatives considered |
|---|---|---|---|---|
| JUnit 5 + Mockito | (managed by Boot) | Unit tests | TODO | TODO |
| Testcontainers | (managed by Boot) | Integration tests against a real Postgres | TODO | H2 in-memory database |

## DevOps
| Technology | Version | Purpose | Why chosen | Alternatives considered |
|---|---|---|---|---|
| Docker + Docker Compose | TODO | Run the app and database locally, later deploy | I'm more familiar with it (decisions.md #002) | Kubernetes |
| GitHub Actions | n/a | CI: build and run tests on every push | TODO | TODO |
| Git + GitHub | TODO | Version control | TODO | n/a |

## Frontend (planned, not started)
| Technology | Version | Purpose | Why chosen | Alternatives considered |
|---|---|---|---|---|
| React + TypeScript | TBD | UI | TBD | Angular |

## External Services
- Place search: TBD (OpenStreetMap or Google Places)
- Reel info: TikTok and Instagram oEmbed (to be tested)

## Dev Tools
IntelliJ IDEA, VS Code (for the frontend later), DBeaver (optional database viewer)

## Not using (and why)
- **MongoDB:** my data is relational, and Postgres JSONB covers the flexible parts. TODO: rewrite this in your own words.
- **Kubernetes:** one small app doesn't need it (see decisions.md #002).
- **Thymeleaf:** the frontend is React, so the server doesn't render HTML.
- **OAuth2 client:** TODO.