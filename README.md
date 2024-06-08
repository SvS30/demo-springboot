## Demo Spring Boot 3
API RESTful utilizando Spring Boot 3.0.0 para gestionar usuarios y los cursos a los que tienen acceso.

### Funcionalidades
<details>
    <summary>User</summary>
<br>
- Obtener todos los usuarios. <br>
- Obtener un usuario por su ID. <br>
- Crear un nuevo usuario. <br>
- Actualizar un usuario existente. <br>
- Eliminar un usuario. <br>
</details>

<details>
    <summary>Course</summary><br>
    - Obtener todos los cursos. <br>
    - Obtener un curso por su ID. <br>
    - Crear un nuevo curso. <br>
    - Actualizar un curso existente. <br>
    - Eliminar un curso. <br>
    - Obtener todos los cursos a los que tiene acceso un usuario específico. <br>
    - Asignar un curso a un usuario. <br>
    - Eliminar la asignación de un curso a un usuario. <br>
</details>

### Tecnologías utilizadas:
- Spring security
- Spring Boot
- Spring Data JPA
- MySQL Driver
- Lombok
- Swagger (Documentación de la API)

### Instalación
1. Clona o descarga el repositorio
    ```
    git clone https://github.com/SvS30/demo-springboot.git
    ```

2. Instalar dependencias
    ```
    mvn install
    ```

3. Establecer variables de entorno
    - Duplicar `.env.example` y renombrar a `.env`
    - Establecer variables de entorno
        ```
        APP_DEBUG=true|false
        DB_MODE=update|create|create-drop
        DB_HOST=localhost
        DB_PORT=3306
        DB_DATABASE=database
        DB_USERNAME=root
        DB_PASSWORD=
        ```
### Scripts
En el directorio del proyecto, puede ejecutar:

`mvn clean`: Limpia todas las clases compiladas del proyecto.

`mvn spring-boot:run`: Ejecuta la aplicación.

`mvn package`: Empaqueta el proyecto (si es un proyecto java simple, genera un jar, si es un proyecto web, un war, etc…). Este fase incluye mvn compile y mvn test.

### Contribución
Siéntete libre de contribuir al proyecto. Puedes abrir issues o pull requests para proponer mejoras o solucionar problemas.

### Contacto
Si tienes preguntas o necesitas ayuda, puedes contactarme vía [Mail](mailto:salimvzqz@gmail.com).
