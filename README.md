# Movie Booking Microservices

Microservices based Movie Booking Backend - Spring Boot + Eureka + Gateway

### Services
- **eureka-server (8761)** - Service Registry
- **api-gateway (8083)** - Routing & Load Balancing
- **movies-api (8081)** - Movies, Shows
- **users-api (8082)** - Users & Bookings

### Tech Stack
Java 21, Spring Boot, Spring Cloud (Eureka, Gateway, OpenFeign), Resilience4j Circuit Breaker, Maven, MySQL

### Key Features
- Service Discovery with Eureka
- API Gateway routing: /api/users/** -> users-api (8082)
- Inter-service communication using OpenFeign
- Circuit Breaker with Fallback: When movies-api is DOWN, users-api returns fallback message "Movies service is DOWN - Fallback response" instead of 500 error

### How to Run
1. Run eureka-server first - http://localhost:8761
2. Then run movies-api (8081)
3. Then run users-api (8082)
4. Then run api-gateway (8083)
5. Test: http://localhost:8083/api/users/1 -> routes via Gateway

cd eureka-server
./mvnw spring-boot:run

### Author
 rishabhjaiswal-dev8
