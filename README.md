

```
# 🔐 Spring Boot Auth Service API

A **secure**, **scalable**, and **production-ready** Authentication and Authorization REST API built with **Spring Boot**, tailored for modern microservices and DevSecOps environments.

> 🔎 Integrates DevSecOps tools for CI/CD, vulnerability scanning, static code analysis, and container orchestration.

---

## 🚀 Features

- ✅ JWT-based authentication and authorization
- ✅ Role-based access control (RBAC)
- ✅ Secure password hashing with BCrypt
- ✅ Token expiration & refresh mechanism
- ✅ Exception handling and validation
- ✅ Logout with JWT blacklist
- ✅ CI/CD Pipeline: GitHub Actions + Jenkins
- ✅ DevSecOps Integration: Trivy, SonarQube, Docker Scout

---

## 🛠️ Tech Stack

| Layer           | Tools & Technologies                        |
|----------------|----------------------------------------------|
| Language        | Java (Spring Boot)                          |
| Security        | Spring Security, JWT                        |
| CI/CD           | GitHub Actions, Jenkins                     |
| DevSecOps       | Trivy, SonarQube, Docker Scout              |
| Deployment      | Docker, Kubernetes (K8s)                    |
| Monitoring      | Prometheus, Grafana                         |
| Database        | PostgreSQL / MongoDB                        |

---

## 📁 Project Structure

```

auth-service/
├── src/
│   ├── main/java/com/aniket/auth/
│   └── main/resources/
├── Dockerfile
├── Jenkinsfile
├── sonar-project.properties
└── README.md

````

---

## 🔄 DevSecOps Pipeline Overview

```mermaid
graph TD
  A[Code Commit] --> B[GitHub Actions / Jenkins]
  B --> C[SonarQube Scan]
  C --> D[Trivy Image Scan]
  D --> E[Docker Build & Push]
  E --> F[Kubernetes Deployment]
````

---

## 🐳 Run Locally with Docker

```bash
docker build -t auth-service .
docker run -p 8080:8080 auth-service
```

---

## 📢 API Endpoints

| Method | Endpoint           | Description           |
| ------ | ------------------ | --------------------- |
| POST   | `/api/auth/login`  | Authenticate user     |
| POST   | `/api/auth/signup` | Register new user     |
| GET    | `/api/users/me`    | Get current user info |

---

## ✅ Security Best Practices

* 🔒 Secure headers configuration
* 🔁 Token refresh mechanism
* 🔐 JWT blacklist on logout
* 🔍 Static code analysis via **SonarQube**
* 🛡️ Image vulnerability scan via **Trivy**
* 📦 Docker Scout insights for supply chain

---

## 🌍 Deployment

This service can be deployed using Docker and Kubernetes in any cloud or hybrid infrastructure.

* ✅ Helm Charts (coming soon)
* ✅ CI/CD compatible for AWS, GCP, Azure

---

## 📊 Monitoring

* 📡 Metrics collection via Prometheus
* 📈 Real-time dashboards with Grafana

---

## 👨‍💻 Author

**Aniket Purohit**
[🔗 LinkedIn](https://www.linkedin.com/in/aniketpurohit) • [🌐 Portfolio](#) *(optional)*

---

## ⭐ Support & Contribution

If you find this useful, please ⭐ star the repo and consider contributing via PR!

---

## 📜 License

This project is licensed under the **MIT License**.

```
