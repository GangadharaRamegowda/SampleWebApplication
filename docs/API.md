# API Reference (Examples)

How to find and use HTTP API endpoints. Replace the examples below with actual endpoints from the codebase.

Discover endpoints
- Spring Boot + OpenAPI: check `/v3/api-docs` and `/swagger-ui.html` when the app is running.
- Search the code for `@RestController`, `@RequestMapping`, `@GetMapping`, `@PostMapping`.

Common patterns
- GET /api/items — list items
- GET /api/items/{id} — get item
- POST /api/items — create item
- PUT /api/items/{id} — update item
- DELETE /api/items/{id} — delete item

Example: create an item
```bash
curl -X POST "http://localhost:8080/api/items" \
  -H "Content-Type: application/json" \
  -d '{
    "name": "Sample Item",
    "description": "A short description"
  }'
```

Authentication
- If the app uses JWT or OAuth2, look for security configuration classes (e.g., SecurityConfig).
- Example bearer token usage:
```bash
curl -H "Authorization: Bearer <token>" http://localhost:8080/api/secure
```.