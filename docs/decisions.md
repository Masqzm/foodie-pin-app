# Decision Log
What I chose, what else was considered, why, and the trade-off(s).

## 001: Backend: Java + Spring Boot
- **Chose:** Java 21 with Spring Boot
- **Considered:** TODO
- **Why:** I've learned Java, so I can build faster and explain every part.
- **Trade-off:** TODO

## 002: Database: PostgreSQL only, no MongoDB
- **Chose:** PostgreSQL for all data; flexible data (reel info) stored as JSONB
- **Considered:** MySQL; MongoDB for document-shaped data
- **Why:** I've used MySQL and wanted to learn another database. My data is relational, and JSONB covers the flexible parts.
- **Trade-off:** TODO

## 003: Caching: Redis
- **Chose:** Redis, behind Spring's cache annotations
- **Considered:** In-memory cache (Caffeine)
- **Why:** Cache place-search and embed lookups to cut repeat API calls.
- **Trade-off:** TODO (hint: what extra service do you now run?)

## 004: Containers: Docker, not Kubernetes
- **Chose:** Docker with Docker Compose
- **Considered:** Kubernetes
- **Why:** I'm more familiar with Docker, and one small app doesn't need Kubernetes.
- **Trade-off:** TODO

## 005: Auth: my own JWT login (to be decided when built)
- **Chose:** TODO
- **Considered:** OAuth2 login (e.g. Google)
- **Why:** TODO
- **Trade-off:** TODO

## 006: Place search provider (to be decided when built)
- **Chose:** TODO
- **Considered:** OpenStreetMap, Google Places
- **Why:** TODO (hint: cost, and what each one lets me store)
- **Trade-off:** TODO