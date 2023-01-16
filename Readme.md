## Spring Boot Kotlin Rest Api Example

This is a simple example of a REST API written in Kotlin using Spring Boot.

### Requirements
- Kotlin 1.3.11
- Gradle 4.10.2
- PostgreSQL

### Setup
- Clone the repository and open it in your favorite IDE
- Create a database in PostgreSQL
- Create a file called `application.properties` in `src/main/resources` and add the following properties:
```
spring.datasource.url=jdbc:postgresql://localhost:5432/<database_name>
spring.datasource.username=<username>
spring.datasource.password=<password>
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```
- Run the application
- Open Postman and import the collection `SpringBootKotlinRestFullExample.postman_collection.json` in the root directory of the project
- Run the requests in Postman
- Enjoy!