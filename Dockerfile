
# Usa una imagen base de Maven para construir el proyecto
FROM maven:3.8-openjdk-17 AS build

# Establece el directorio de trabajo
WORKDIR /app

# Copia todo el archivo
COPY . /app

# Construye el proyecto
RUN mvn clean package -DskipTests

# Usa una imagen base de OpenJDK para ejecutar el proyecto
FROM openjdk:17-jdk-slim

# Establece el directorio de trabajo
WORKDIR /app

# Copia el archivo JAR generado desde la etapa de construcción
COPY --from=build /app/target/*.jar app.jar

# Expone el puerto que utiliza la aplicación (ajusta el puerto según tu aplicación)
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]
