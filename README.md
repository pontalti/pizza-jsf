# 🍕 Pizza‑JSF — Spring Boot 3 & PrimeFaces 15

Demo application that mixes **Spring Boot 3.5 GA**, **Jakarta Faces 4 / PrimeFaces 15** and **Spring MVC**.  
It serves Facelets pages **and** a small JSON REST API.

> **Default URL after** `java -jar target/pizza-jsf-…​.jar`  
> `http://localhost:8080`

---

## ✨ Features

| Layer              | Technology                                                    |
|--------------------|---------------------------------------------------------------|
| **UI**             | PrimeFaces 15 · Facelets (.xhtml) · PrimeIcons                |
| **Back‑end**       | Spring Boot 3.5 · Spring MVC 6 · CDI/Weld (via JoinFaces 5.5) |
| **Build**          | Maven 3.9 · Java 21 LTS                                       |
| **Dev experience** | Spring DevTools (hot reload) · LiveReload support             |

---

## 🚀 Quick start

```bash
# 1) Full build
mvn clean package

# 2) Run the fat‑JAR
java -jar target/pizza-jsf-0.0.1-SNAPSHOT.jar
# ↳ app starts on http://localhost:8080
```

*(Deploy the generated WAR in any servlet container if you prefer).*

---

## 🔗 Main endpoints

| Method  | URL             | Description                                                             |
|---------|-----------------|-------------------------------------------------------------------------|
| **GET** | `/`             | PrimeFaces landing page (pizza list)                                    |
| **GET** | `/pizza`        | REST API – all pizzas (JSON)                                            |
| **GET** | `/pizza/{name}` | REST API – pizza by name (case‑insensitive)<br/>e.g. `/pizza/Pizza%205` |

```
Test it quickly:

http://localhost:8080/
http://localhost:8080/pizza
http://localhost:8080/pizza/Pizza%205
```

---

## 📂 Project layout

```
src/
 ├─ main/
 │   ├─ java/
 │   │   └─ com/
 │   │       ├─ MainApp.java        » Spring Boot bootstrap
 │   │       ├─ controller/         » JSF & REST controllers
 │   │       └─ model/              » domain entities
 │   ├─ resources/
 │   │   └─ application.yml         » Spring & PrimeFaces config
 │   └─ webapp/
 │       └─ index.xhtml             » main view
 └─ test/
     └─ ...                         » JUnit 5 tests
```

---

## ⚙️ Minimal configuration (`application.yml`)

```yaml
primefaces:
  client-side-validation: true

jakarta:
  faces:
    PROJECT_STAGE: Development   # switch to Production in prod
```

---

## 🛠️ Development tips

* **Hot reload:** save a file → browser refreshes.
* **Verbose logs:**  
  `logging.level.org.springframework.web=DEBUG`
