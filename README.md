# Spring Boot Fundamentals – Group 4  
This repository contains the Group 4 assignment demonstrating the fundamentals of Spring Boot.  
It includes a complete project setup, Maven configuration steps, folder structure explanation, and a basic REST API implementation.  

---

# 📑 Table of Contents  
1. [Introduction](#1-introduction)  
2. [Overview of Spring Boot](#2-overview-of-spring-boot)  
3. [Installation and Configuration Steps (Maven + VS Code)](#3-installation-and-configuration-steps-maven--vs-code)
4. [Project Folder Structure](#4-project-folder-structure)
5. [Important Files Explained](#5-important-files-explained)
6. [Dependency Management](#6-dependency-management) 
7. [common Annnotation](#7-common-annotation) 
8. [Hello World REST API](#8-hello-world-rest-api)  
9. [Running the Application](#9-running-the-application)  
10. [Conclusion](#10-conclusion)  
11. [References](#11-references)

---
## 1. Introduction  
This documentation provides a structured explanation of Spring Boot fundamentals as part of the Group 4 assignment.  
The purpose is to demonstrate:  
- What Spring Boot is  
- How to configure a Spring Boot project using Maven  
- How to generate the project using Spring Initializr  
- How to create a simple REST API  
- How to run the application  
---

## 2. Overview of Spring Boot  
Spring Boot is a framework built on top of Spring, designed to simplify enterprise Java application development.  
It eliminates boilerplate configurations, provides an embedded server, and uses convention-over-configuration principles to accelerate development.

---
# 3. ⚙️ Installation and Configuration Steps (Maven + VS Code)

### Step 1: Verify Maven  
Run the following command to ensure Maven is installed and accessible:

---
### Step 2: Create a Spring Boot Project (Spring Initializr)

#### Option A: Online Initializr  
1. Open: https://start.spring.io  
2. Select:
   - Project: Maven  
   - Language: Java  
   - Spring Boot Version: Latest stable  
3. Project Metadata:  
   - Group: com.example  
   - Artifact: demo  
   - Packaging: Jar  
   - Java: 17  
4. Add Dependencies: Spring Web, Spring Data JPA, H2 Database  
5. Click **Generate**, download and extract the project  
6. Open VS Code → File → Open Folder → select the extracted folder  
---
#### Option B: Directly from VS Code  
1. Open VS Code  
2. Press `Ctrl + Shift + P`  
3. Search for **Spring Initializr: Generate a Maven Project**  
4. Follow the prompts to select:  
   - Maven  
   - Java  
   - Spring Boot version  
   - Group/Artifact  
   - Dependencies  
5. VS Code generates and opens the project automatically  


---
### Step 3: Basic Configuration  
Open:
src/main/resources/application.properties
Add:
spring.application.name=springboot-fundamentals
server.port=8080
---

## 4. Project Folder Structure  
```
project/
│
├── src/
│ ├── main/java/com/example/demo/
│ │ ├── DemoApplication.java
│ │ ├── controller/ → handles incoming HTTP requests
│ │ ├── service/ → contains business logic
│ │ ├── repository/ → database access layer (JPA)
│ │ └── model/ → entity classes for database tables
│ │
│ ├── main/resources/
│ │ ├── application.properties → project configurations
│ │ ├── static/ → static assets (css/js/images)
│ │ └── templates/ → HTML templates (Thymeleaf)
│ │
│ └── test/ → unit and integration tests
│
├── pom.xml → Maven dependencies & build config
└── README.md
```
---

# 5. Important Files Explained  

| File/Folder | Purpose |
|------------|---------|
| `DemoApplication.java` | Entry point of the Spring Boot application |
| `controller/` | Defines REST endpoints |
| `service/` | Implements application logic |
| `repository/` | Interacts with the database |
| `model/` | Holds entity classes |
| `application.properties` | Project-level configuration |
| `pom.xml` | Dependency and build management |

---
# 6. Dependency Management 
Below are the most commonly used Spring Boot dependencies required for fundamental backend development.

### Spring Boot Starter (Core Starter)

Provides essential Spring Boot auto-configuration and basic dependencies.

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter</artifactId>
</dependency>

### Spring Configuration Processor

Provides metadata and auto-completion for application.properties and custom configs.

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-configuration-processor</artifactId>
    <optional>true</optional>
</dependency>

### Spring Web

Provides support for building REST APIs and web applications.

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>

### Spring Data JPA
Enables database access using the Java Persistence API (JPA).
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</depend
### MySQL Database Driver

Allows Spring Boot to connect to MySQL databases.

<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <scope>runtime</scope>
</dependency>


### Lombok
Generates boilerplate code such as getters, setters, and constructors.
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
</dependency>

# 7. Common Annotation
Below are the most commonly used Spring Boot annotations presented in a clean table format.

| Annotation | Purpose |
|-----------|---------|
| `@SpringBootApplication` | Marks the main class of a Spring Boot application and enables auto-configuration. |
| `@RestController` | Creates REST controllers that return JSON/text responses. |
| `@RequestMapping` | Defines the base URL path for a controller or method. |
| `@GetMapping` / `@PostMapping` / `@PutMapping` / `@DeleteMapping` | Maps HTTP requests (GET, POST, PUT, DELETE) to controller methods. |
| `@Service` | Marks a class as part of the service layer containing business logic. |
| `@Repository` | Marks a class/interface as a data access layer component. |
| `@Entity` | Indicates that a class is a JPA entity mapped to a database table. |
| `@Id` | Identifies the primary key field in a JPA entity. |
| `@Autowired` | Performs automatic dependency injection. |
| `@Bean` | Declares a method that returns a Spring-managed bean. |
| `@Data` (Lombok) | Generates getters, setters, equals, hashCode, and toString automatically. |

# 8. Hello World REST API

The following example demonstrates a simple REST endpoint using Spring Boot.

```java
package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Spring Boot!";
    }
}

```
---
# 9. Running the Application (Windows)

Follow the steps below to run the Spring Boot application on Windows:

### **Step 1: Open Terminal in VS Code**
- Go to **Terminal → New Terminal**
- Ensure you are inside the project root folder

### **Step 2: Run the Spring Boot Application**
Use the Maven Wrapper command:
mvnw spring-boot:run
### **Step 3: Confirm Application Startup**
Tomcat started on port(s): 8080
### **Step 4: Test the REST API**
Open a browser and enter:
http://localhost:8080/hello
---
Hello, Spring Boot!

# 10. Conclusion <a id="10-conclusion"></a>

This documentation presented the fundamental concepts of Spring Boot, including project creation using Spring Initializr, Maven-based configuration, folder structure understanding, dependency usage, and creation of a basic REST API.  
These foundations enable beginners to confidently build scalable Java applications using Spring Boot's simplified development model.

---

# 11. References <a id="11-references"></a>

1. Spring Boot Official Documentation – https://spring.io/projects/spring-boot  
2. Maven Build Tool Documentation – https://maven.apache.org  
3. Mosh Hamedani – Spring Boot Tutorial for Beginners  
   https://www.youtube.com/watch?v=vtPkZShrvXQ 
