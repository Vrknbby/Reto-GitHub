# RetoGit

## Integrantes

- Barrantes Caceres, Nicolas
- Huaman Salvatierra, Andy
- Huamani Cambillo, Andre
- Medina Galan, Cristian
- Tocto Rado, Rodrigo

## Descripción

**RetoGit** es un proyecto de aplicación web desarrollado con Spring Boot, que proporciona una API REST para gestionar información sobre alumnos. El objetivo principal es facilitar el aprendizaje y la práctica de desarrollo de aplicaciones con Java y Spring, integrando una base de datos MySQL para el almacenamiento persistente de datos.

## Tecnologías Utilizadas

- **Spring Boot**: Framework para el desarrollo de aplicaciones Java.
- **Spring Data JPA**: Para la interacción con bases de datos.
- **Spring Web**: Para la creación de servicios REST.
- **MySQL**: Base de datos relacional utilizada para almacenar la información de los alumnos.
- **Java 17**: Lenguaje de programación utilizado.

## Requisitos

Antes de ejecutar el proyecto, asegúrate de tener instalado lo siguiente:

- [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)
- [MySQL](https://www.mysql.com/downloads/)

## Configuración

1. **Clonar el Repositorio**

   ```bash
   git clone https://github.com/tu_usuario/RetoGit.git
   cd RetoGit

## Aplocation Properties

- Debe crear la base de datos en MySQL con el nombre **reto-github**
 ```bash
   spring.application.name=RetoGit
   spring.datasource.url=jdbc:mysql://localhost:3306/reto-github
   spring.datasource.username=root (Remplaze por su username)
   spring.datasource.password=123456 (Remplaze por su contraseña)
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql:true