# 🌍 AshaMesh — Real-Time Disaster Response Network

<p align="center">
  <img src="https://vercel.app" alt="Header Animation" />
</p>

### ⚡ "Decentralized Crisis Management Engine Connecting Victims to First Responders under High Throughput"

---

## 🧭 Project Blueprint & Core Framework Topics

Is repository mein software engineering aur enterprise-grade backend development ke yeh **5 main pillars** cover kiye gaye hain:
1. **Service Mesh Infrastructure:** Inbuilt dynamic service discovery and edge routing protocol pipelines.
2. **High-Velocity Ingestion Architecture:** Multi-threaded async processing endpoints to capture massive distress payloads.
3. **Event-Driven Streaming Fabric:** Standalone decoupled transaction queuing to manage heavy platform load spikes.
4. **DevOps & Container Orchestration:** Production-ready containerized ecosystems ready to scale on Kubernetes clusters.
5. **Automated Integration Pipelines:** Strict dynamic testing assertions isolating system logic from local ports.

---

## 🏛️ System Architecture Blueprint

```text
               [ Distress Victims / Postman Automated Simulators ]
                                      │
                                      ▼
                [ 🛡️ Spring Cloud API Gateway (Port: 8080) ]
                                      │
           ┌─────────────────────────┴─────────────────────────┐
           ▼ (Dynamic Service Discovery via Eureka Server)    ▼
 [ 📡 Eureka Server (8761) ]                         [ 🚨 SOS-Ingestion-Service (8081) ]
                                                               │
                                                               ▼
                                                    [ 💾 PostgreSQL Database ]
                                                               │
                                                               ▼
                                                    [ 🐳 Docker Kafka (9092) ]
                                                    (Topic: disaster-sos-topic)
```

---

## 🚀 Microservices System Map

*   **📡 Eureka Registry (Port 8761):** The centralized phonebook infrastructure tracking operational state of all node networks.
*   **🛡️ API Gateway (Port 8080):** The strict perimeter gateway proxy masking downstream ports and executing prefix mutations.
*   **🚨 SOS Ingestion Service (Port 8081):** Captures geolocation coordinates, executes ACID compliant persistence, and pushes parallel payloads to streams.

---

## 🛠️ The Tech Grid

```text
⚙️ CORE ENGINE  : Java 25 / Spring Boot 3.x / Spring Data JPA
📡 ROUTING FABRIC: Spring Cloud Gateway / Netflix Eureka Service Mesh
🐳 DATA STREAM   : Apache Kafka Event Engine running inside Docker Core
💾 STORAGE NODES : PostgreSQL Relational Ledger Instance
🧪 TESTING PIPES : Postman Automation Runner / Environment Injector
```

---

## ⚙️ Local Infrastructure Quickstart

Follow these strict chronological steps to initialize the node clusters on your machine:

### 1. Fire up the Kafka Backbone (Docker Client)
Ensure Docker Desktop is active on your host computer, then fire this automated command:
```bash
docker run -d --name kafka -p 9092:9092 apache/kafka:4.1.1
```

### 2. Microservice Deployment Order
Launch the application nodes in this sequence using IntelliJ IDEA configuration runner:
1. **`EurekaServerApplication`** ➔ Verify active address index portal at `http://localhost:8761`
2. **`ApiGatewayApplication`** ➔ Wait for perimeter handshake configuration logs to clear
3. **`SosServiceApplication`** ➔ Establish fresh physical database connections

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
<p align="center">
  <img src="https://vercel.app" alt="Footer Banner" />
</p>

*Designed and engineered with strict software architectural principles by Priyanshu Sharma.*
