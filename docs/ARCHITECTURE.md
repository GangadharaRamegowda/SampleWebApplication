# Architecture

High-level overview of the project's architecture and package layout to help contributors navigate the codebase.

High-level layers
- Presentation (web layer): REST controllers and DTOs.
- Service layer: business logic and orchestration.
- Persistence layer: repositories/DAOs and entity mappings.
- Configuration: externalized configuration and profiles.
- Tests: unit and integration tests.

Typical package layout (example)
- com.example.app.controller — HTTP controllers / REST endpoints
- com.example.app.service — business logic
- com.example.app.repository — data access (JPA repositories, DAOs)
- com.example.app.model — entities and DTOs
- com.example.app.config — configuration classes
- com.example.app.util — utility helpers

Data flow
1. Client → Controller
2. Controller → Service (DTO mapping)
3. Service ↔ Repository (persistence)
4. Service → DTO → Controller → Client

Guidelines
- Keep controllers thin; prefer to place logic in services.
- Keep repositories focused on data access.
- Add unit tests for services and controllers; add integration tests for persistence and end-to-end flows.