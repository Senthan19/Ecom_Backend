# Use Java 17 JDK
FROM eclipse-temurin:17-jdk

# Working directory
WORKDIR /app

# Copy everything to container
COPY . .

# Build project
RUN ./mvnw clean package -DskipTests

# Run the jar
CMD ["java", "-jar", "target/E-Commerce-0.0.1-SNAPSHOT.jar"]
