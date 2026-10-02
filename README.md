# 🌍 AshaMesh — Real-Time Disaster Response Network

[![Spring Boot](https://shields.io)](https://spring.io)
[![Java](https://shields.io)](https://oracle.com)
[![Apache Kafka](https://shields.io)](https://apache.org)
[![Docker](https://shields.io)](https://docker.com)

> A hyper-scalable, decentralized emergency routing engine designed to connect distress victims with rescue volunteers and NGOs in real-time under high-throughput situations.

---

## 🏛️ System Architecture Blueprint

```text
               [ Distress Victims / Postman Load Simulators ]
                                     │
                                     ▼
                [ Spring Cloud API Gateway (Port: 8080) ]
                                     │
           ┌─────────────────────────┴─────────────────────────┐
           ▼ (Dynamic Service Discovery via Eureka Server)    ▼
 [ Eureka Server (8761) ]                            [ SOS-Ingestion-Service (8081) ]
                                                               │
                                                               ▼
                                                    [ PostgreSQL (ashamesh_db) ]
                                                               │
                                                               ▼
                                                    [ 🐳 Docker Kafka (9092) ]
                                                    (Topic: disaster-sos-topic)
```

---

## 🚀 Microservices Breakdown

* **📡 Eureka Registry (Port 8761):** The central phonebook server handling real-time microservice instances dynamic registry.
* **🛡️ API Gateway (Port 8080):** The system entry gate handling absolute client request routing and path abstraction.
* **🚨 SOS Ingestion Service (Port 8081):** Captures high-velocity distress calls, persists payload into PostgreSQL database, and streams asynchronous events instantly.

---

## 🛠️ The Tech Stack Grid

| Layer | Technology | Status |
| :--- | :--- | :--- |
| **Core Framework** | Java 25, Spring Boot 3.x, Spring Data JPA | ✅ Implemented |
| **Service Mesh** | Spring Cloud Gateway, Netflix Eureka | ✅ Implemented |
| **Message Broker** | Apache Kafka (Event-Driven Stream via Docker) | ✅ Implemented |
| **Database** | PostgreSQL Server | ✅ Implemented |
| **Testing Suite** | Postman Advanced Multi-Environment Runner | ✅ Implemented |

---

## ⚙️ Local Infrastructure Quickstart

Follow these sequential steps to boot up the complete grid on your local machine:

### 1. Fire up the Kafka Backbone (Docker)
```bash
docker run -d --name kafka -p 9092:9092 apache/kafka:4.1.1
```

### 2. Boot Order (IntelliJ IDEA)
Launch the microservices in the exact chronological order:
1. `EurekaServerApplication` (Registry Layer) ➔ Wait for Dashboard at `http://localhost:8761`
2. `ApiGatewayApplication` (Routing Edge)
3. `SosServiceApplication` (Core Ingestion Engine)

### 3. Automated Postman Testing Pipeline
- Set up a Postman Environment Variable `{{gatewayurl}}` pointing to `http://localhost:8080`.
- Trigger real-time SOS calls using the orchestrated edge routing path:
```http
POST {{gatewayurl}}/sos-service/api/sos/trigger
```

---
*Developed with ❤️ by Priyanshu Sharma as an Enterprise Architecture Showcase.*
