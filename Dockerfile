# 1. Base image (Java 17 JDK)
FROM eclipse-temurin:17-jdk

# 2. Working directory inside container
WORKDIR /app

# 3. Copy everything from repo into container
COPY . .

# 4. Build the project (skip tests for faster build)
RUN ./mvnw clean package -DskipTests

# 5. Run the built JAR file
CMD ["java", "-jar", "target/*.jar"]
