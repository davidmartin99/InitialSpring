# InitialSpring

Proyecto de ejemplo con **Spring Boot** que implementa un controlador REST básico, un servicio y un repositorio para la gestión de usuarios.

---

## 🛠 Tecnologías utilizadas

- Java 17
- Spring Boot 3
- Maven
- H2 Database (en memoria)
- Spring Data JPA
- Git y GitHub

---

## 📁 Estructura del proyecto

src/main/java/org/example/InitialSpring

 -  controller
     - UserController.java
 - service
    - UserService.java
 - repository
   - UserRepository.java
 - model
    - User.java
- HelloController.java

---

## 🚀 Funcionalidad principal

- **UserController**: expone endpoints REST para la gestión de usuarios.
- **UserService**: lógica de negocio de usuarios.
- **UserRepository**: acceso a datos utilizando Spring Data JPA.
- **HelloController**: endpoint de prueba `GET /hello`.

---

## ⚡ Endpoints de ejemplo

- `GET /hello` → Retorna un mensaje de prueba.
- `GET /users` → Lista todos los usuarios.
- `POST /users` → Crea un nuevo usuario.

> Puedes probar los endpoints usando **Postman** o cualquier cliente REST.

---

## 📦 Cómo ejecutar el proyecto

1. Clonar el repositorio:
git clone https://github.com/davidmartin99/InitialSpring.git
cd InitialSpring


2. Construir el proyecto:

mvn clean install


3. Ejecutar:

mvn spring-boot:run


Accede a http://localhost:8080.

📝 Notas

Base de datos H2 en memoria (los datos se pierden al reiniciar).

CRUD básico de usuarios.

Configuración preparada para IntelliJ IDEA.

👤 Autor

David Martin - GitHub
