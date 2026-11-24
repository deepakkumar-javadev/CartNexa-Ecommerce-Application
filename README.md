# CartNexa – E-Commerce Microservices Application

## About the Project

CartNexa is a microservices-based e-commerce application developed using Java and Spring Boot.

The project is designed to demonstrate how an online shopping platform can be developed using multiple independent microservices.

Each service handles a specific business functionality, such as user management, product management, inventory, cart, orders, payments, and notifications.

The application is containerized using Docker and managed through Docker Compose.

## Key Features

- User Registration and Login
- Product Management
- Product Search
- Inventory Management
- Shopping Cart Management
- Order Placement
- Payment Management
- Cash on Delivery Support
- Order Status Management
- Notification Management
- Microservices Architecture
- Docker Containerization

## Microservices

| Service | Responsibility |
|---|---|
| API Gateway | Handles client requests and routes them to appropriate services |
| User Service | Manages user-related operations |
| Product Service | Manages product information |
| Inventory Service | Manages product stock |
| Cart Service | Manages shopping cart operations |
| Order Service | Handles order creation and management |
| Payment Service | Handles payment operations |
| Notification Service | Handles notifications |
| Frontend Service | Provides the user interface |
| Eureka Service | Handles service registration and discovery |

## Technology Stack

- **Language:** Java
- **Framework:** Spring Boot
- **Architecture:** Microservices
- **API:** REST APIs
- **ORM:** Hibernate / Spring Data JPA
- **Database:** MySQL
- **API Gateway:** Spring Cloud Gateway
- **Service Discovery:** Netflix Eureka
- **Containerization:** Docker
- **Container Management:** Docker Compose
- **Build Tool:** Maven
- **Version Control:** Git and GitHub

## Project Structure

```text
CartNexa-Microservices/
│
├── 01_Ecom-Api-Gateway/
├── 02_Ecom_UserService/
├── 03_Ecom_Product_Service/
├── 04_Ecom_Inventory_Service/
├── 05_Ecom_Cart_Service/
├── 06_Ecom_Order_Service/
├── 07_Ecom_payment_Service/
├── 08_Ecom_Notification_service/
├── 09_Ecom_FrontEnd_service/
├── 10_Ecom_Eureka_service/
│
├── docker-compose.yml
├── docker-compose.test.yml
├── .env.example
├── .gitignore
└── README.md
```

## Application Architecture

The application follows a microservices architecture where each service is responsible for a separate business functionality.

The API Gateway acts as the entry point for client requests and routes them to the appropriate microservices.

Eureka Server provides service discovery for registered microservices.

Services communicate through the configured APIs and integrations.

## How to Run the Project Using Docker

### Prerequisites

Make sure you have installed:

- Git
- Docker Desktop
- Docker Compose

### Step 1: Clone the Repository


git clone https://github.com/deepakkumar-javadev/CartNexa-Ecommerce-Application.git

### Step 2: Navigate to Project Directory

cd CartNexa-Ecommerce-Application


### Step 3: Configure Environment Variables

Create your local environment file:


cp .env.example .env


Update the environment variables according to your configuration.

### Step 4: Build and Start All Services


docker compose up --build -d


### Step 5: Check Running Containers

docker compose ps

### Step 6: View Application Logs


docker compose logs -f

### Step 7: Stop All Services

docker compose down

## Docker Compose Files

- `docker-compose.yml` – Main Docker Compose configuration.
- `docker-compose.test.yml` – Separate Docker Compose configuration for testing.

## Learning Outcomes

Through this project, I gained practical experience in:

- Developing REST APIs using Spring Boot.
- Implementing microservices architecture.
- Working with MySQL and Spring Data JPA.
- Implementing API Gateway and Service Discovery.
- Managing multiple independent services.
- Containerizing applications using Docker.
- Running multiple containers using Docker Compose.
- Managing code using Git and GitHub.

## Future Enhancements

- Kubernetes Deployment
- CI/CD Pipeline using Jenkins
- Centralized Logging
- Distributed Tracing
- Redis Caching
- Automated Testing
- Monitoring and Observability

## Author

**Deepak Kumar**

Java Backend Developer

Skills: Java | Spring Boot | Microservices | REST APIs | MySQL | Docker

GitHub: https://github.com/deepakkumar-javadev

---

**CartNexa – E-Commerce Application Built with Microservices Architecture**

If you find this project useful, please give it a star on GitHub.
