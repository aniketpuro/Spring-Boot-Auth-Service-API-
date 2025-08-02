# DevSecOps Monorepo

This repository contains a collection of microservices built using Java Spring Boot, following DevSecOps principles.

## Structure

- `auth-service`: Handles authentication and authorization.
- `order-service`: Manages order processing.
- `payment-service`: Handles payment gateways and transactions.
- `product-service`: Manages product inventory and catalog.
- `api-gateway`: Central entry point using Spring Cloud Gateway.
- `config-server`: Centralized configuration server using Spring Cloud Config.
- `common-libs`: Shared libraries used across services.
- `scripts`: Utility scripts for DevOps automation (CI/CD, Docker, etc.)
- `docs`: Documentation and architecture diagrams.

## How to Use

Each microservice is an independent Spring Boot application with its own build and dependencies.
    