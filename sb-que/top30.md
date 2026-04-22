

## 🧠 1. What is Spring Boot?

**Answer:**
Spring Boot is a framework built on top of Spring that helps create **standalone, production-ready applications** with minimal configuration using features like auto-configuration and embedded servers ([GeeksforGeeks][2])

---

## ⚙️ 2. Difference between Spring and Spring Boot?

**Answer:**

* Spring → requires manual configuration
* Spring Boot → auto-configured, faster setup
* Boot uses embedded servers (Tomcat, Jetty)

---

## 🔄 3. What is Auto-Configuration?

**Answer:**
Spring Boot automatically configures beans based on:

* Classpath dependencies
* Properties
* Conditions (`@ConditionalOnClass`, etc.)

👉 It reduces manual setup.

---

## 🧩 4. How does Auto-Configuration work internally?

**Answer:**

* Reads config from `META-INF/...AutoConfiguration.imports`
* Applies conditional annotations
* Creates beans only if conditions match ([springjavalab.com][1])

---

## 🧱 5. What is `@SpringBootApplication`?

**Answer:**
It is a combination of:

* `@Configuration`
* `@EnableAutoConfiguration`
* `@ComponentScan`

---

## 🧬 6. What is Dependency Injection?

**Answer:**
A design pattern where Spring injects required dependencies instead of creating them manually.

---

## 🔁 7. What is Bean Lifecycle?

**Answer:**

1. Bean creation
2. Dependency injection
3. Initialization
4. Destruction

---

## 📦 8. What are Spring Boot Starters?

**Answer:**
Predefined dependency bundles like:

* `spring-boot-starter-web`
* `spring-boot-starter-data-jpa`

---

## 🌐 9. What is `@RestController`?

**Answer:**
Combination of:

* `@Controller`
* `@ResponseBody`
  Used to build REST APIs.

---

## ⚖️ 10. Difference: `@Controller` vs `@RestController`

**Answer:**

* `@Controller` → returns views
* `@RestController` → returns JSON/XML

---

## 🔐 11. What is Spring Security?

**Answer:**
Framework for authentication & authorization using filter chain.

---

## 🔑 12. How does JWT authentication work?

**Answer:**

* User logs in → gets token
* Token sent in header
* Server validates token (stateless)

---

## 🗄️ 13. What is Spring Data JPA?

**Answer:**
Simplifies DB operations using repositories instead of writing SQL.

---

## 🔍 14. Difference: `JpaRepository` vs `CrudRepository`

**Answer:**

* Crud → basic CRUD
* JPA → CRUD + pagination + sorting

---

## 🔄 15. What is `@Transactional`?

**Answer:**
Manages database transactions using proxy:

* Start transaction
* Commit or rollback

---

## ⚠️ 16. What is Transaction Propagation?

**Answer:**
Defines behavior when transaction exists:

* REQUIRED (default)
* REQUIRES_NEW

---

## 🐢 17. What is N+1 Problem?

**Answer:**
Multiple queries for related data → performance issue
👉 Fix:

* JOIN FETCH
* DTO projection

---

## 🧵 18. What is Lazy vs Eager Loading?

**Answer:**

* Lazy → load when needed
* Eager → load immediately

---

## 📡 19. What is Spring Boot Actuator?

**Answer:**
Provides production endpoints:

* `/health`
* `/metrics` ([springjavalab.com][1])

---

## 📊 20. How do you monitor application health?

**Answer:**
Using Actuator + monitoring tools (Prometheus, Grafana)

---

## ⚡ 21. How to improve performance?

**Answer:**

* Caching (`@Cacheable`)
* Pagination
* DB indexing
* Avoid eager loading

---

## 🧪 22. What is `@SpringBootTest`?

**Answer:**
Used for integration testing with full application context.

---

## 🔍 23. Unit vs Integration Testing?

**Answer:**

* Unit → single class
* Integration → multiple components ([springjavalab.com][1])

---

## 🔄 24. What happens during Spring Boot startup?

**Answer:**

* Create ApplicationContext
* Load configs
* Initialize beans
* Start server ([springjavalab.com][1])

---

## 🌍 25. What are Spring Profiles?

**Answer:**
Used for environment-specific configs:

* dev
* test
* prod

---

## 🚀 26. How do you deploy Spring Boot app?

**Answer:**

* Build JAR
* Run using `java -jar`
* Deploy via Docker

---

## 🔗 27. How do microservices communicate?

**Answer:**

* REST APIs
* Feign Client

---

## 🛑 28. What is Circuit Breaker?

**Answer:**
Prevents cascading failures by stopping calls to failing service.

---

## 🧵 29. What is `@Async`?

**Answer:**
Runs method asynchronously using thread pool.

---

## 🧠 30. Scenario Question: Why is your API slow?

**Answer:**
Possible reasons:

* N+1 queries
* No indexing
* Blocking calls
* Large payload

👉 Fix:

* Optimize DB queries
* Add caching
* Use async processing

---

# 🎯 Final Reality (Important)

For **4+ years experience**, interviewers expect:

* Internals (not definitions)
* Real scenarios
* Debugging + performance


[1]: https://www.springjavalab.com/2025/12/spring-boot-interview-questions-for-2-5-years-experience.html?utm_source=chatgpt.com "Top Spring Boot Interview Questions for 2–5 Years Experience (2025)"
[2]: https://www.geeksforgeeks.org/springboot/spring-boot-interview-questions-and-answers/?utm_source=chatgpt.com "Spring Boot Interview Questions and Answers - GeeksforGeeks"
