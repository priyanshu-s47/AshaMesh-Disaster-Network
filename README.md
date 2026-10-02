# ⚡ ASHAMESH — REAL-TIME DISASTER RESPONSE NETWORK

```text
========================================================================
   ___          _        __  __           _      
  / _ \   ___  | |__    |  \/  |  ___ ___| |__   
 / /_\ \ / __| | '_ \   | |\/| | / _ \ __| '_ \  
/ / _ \ \\__ \ | | | |  | |  | ||  __/__ \ | | | 
\/_/   \_\___/ |_| |_|  |_|  |_| \___|___/_| |_| 
                                                 
 >> CRITICAL CRISIS CORE ENGINE | BY PRIYANSHU SHARMA <<
========================================================================
```

> **🚨 HIGH-ALERT SYSTEMS ARCHITECTURE:** A hyper-scalable, decentralized emergency routing mesh engineered to connect distress victims with rescue volunteers instantly under heavy traffic spikes.

---

## 🧭 PROJECT BLUEPRINT & PILLARS

Is system mein core software engineering ke yeh **5 main systems architectural pillars** cover kiye gaye hain:

*   **🎛️ Distributed Service Mesh:** Centralized internal node routing and phonebook service registration.
*   **⚡ High-Velocity Ingestion:** Non-blocking async endpoints engineered to capture massive distress payloads.
*   **🐳 Event-Driven Fabric:** Decoupled transaction queuing using containerized brokers to manage platform load.
*   **💾 Spatial Data Routing:** Highly optimized location coordinate query filtering at the database layer.
*   **🧪 Pipeline Automation:** Dynamic testing environments using custom script variables isolating system logic from local hardcoded ports.

---

## 🏛️ SYSTEM ARCHITECTURE BLUEPRINT

```text
                 +---------------------------------------------+

                 |  Distress Victims / Automated Test Suites   |
                 +---------------------------------------------+
                                        |
                                        ▼
                 +---------------------------------------------+

                 |  🛡️ SPRING CLOUD API GATEWAY (Port: 8080)   |
                 +---------------------------------------------+
                                        |
             +--------------------------┴--------------------------+

             | (Dynamic Discovery via Eureka Discovery Registry)    |
             ▼                                                     ▼
+--------------------------+                         +--------------------------+

| 📡 EUREKA SERVER (8761)  |                         | 🚨 SOS-SERVICE (8081)    |
+--------------------------+                         +--------------------------+
                                                                   |
                                                                   ▼
                                                     +--------------------------+

                                                     | 💾 POSTGRESQL DATABASE   |
                                                     +--------------------------+
                                                                   |
                                                                   ▼
                                                     +--------------------------+

                                                     | 🐳 DOCKER KAFKA (9092)   |
                                                     | Topic: disaster-sos-topic|
                                                     +--------------------------+
```

---

## 🚀 MICROSERVICES SYSTEM MAP

*   **📡 Eureka Registry (`port: 8761`):** The central runtime phonebook infrastructure tracking operational state of all microservice nodes.
*   **🛡️ API Gateway (`port: 8080`):** The strict perimeter gateway handling dynamic path abstraction, service load balancing, and secure edge handshakes.
*   **🚨 SOS Ingestion Service (`port: 8081`):** Captures geolocation coordinates, executes ACID compliant persistence into PostgreSQL, and fires binary payload events to streams.

---

## 🛠️ THE INFRASTRUCTURE GRID

```text
[⚙️ CORE DRIVER]   : Java 25 / Spring Boot 3.x / Spring Data JPA
[📡 GATEWAY MESH]  : Spring Cloud Gateway / Netflix Eureka Client
[🐳 EVENT FABRIC]  : Apache Kafka Ecosystem running inside Docker Core
[💾 STORAGE NODE]  : PostgreSQL Enterprise Relational Engine
[🧪 TESTING PIPES] : Postman Automation Runner / Environment Injector
```

---

## ⚙️ LOCAL INFRASTRUCTURE QUICKSTART

### 1. Fire up the Kafka Backbone (Docker)
Ensure Docker Desktop is active on your host computer, then fire this terminal command:
```bash
docker run -d --name kafka -p 9092:9092 apache/kafka:4.1.1
```

### 2. Microservice Deployment Order
Launch the application nodes sequentially in IntelliJ IDEA:
1.  **`EurekaServerApplication`** ➔ Verify active registry dashboard index portal at `http://localhost:8761`
2.  **`ApiGatewayApplication`** ➔ Wait for routing mesh perimeter logs to settle
3.  **`SosServiceApplication`** ➔ Establish live physical database connections

### 3. Execution Contracts & API Integration
Assign a generic environment variable named `gatewayurl` inside your Postman workspace pointing to your gateway edge instance (`http://localhost:8080`).

Fire structured live triggers using this unified integration route:
```http
POST {{gatewayurl}}/sos-service/api/sos/trigger
```

**Request Object Contract:**
```json
{
  "victimName": "Priyanshu Sharma",
  "phoneNumber": "9870945257",
  "emergencyType": "FLOOD",
  "latitude": 29.9680,
  "longitude": 77.5460
}
```

---
```text
========================================================================
   STRICT SYSTEM CONGRUENCY MAINTAINED | PRODUCTION-GRADE ARCHITECTURE
========================================================================
```
