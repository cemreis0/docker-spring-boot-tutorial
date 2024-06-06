# Use a base image with OpenJDK installed
FROM openjdk:22

# Set the working directory in the container
WORKDIR /app

# Copy the executable JAR file from the target directory into the container
COPY target/docker-spring-boot-demo-v1-0.0.1-SNAPSHOT.jar /app/docker-spring-boot-demo-v1.jar

# Specify the command to run the application when the container starts
CMD ["java", "-jar", "docker-spring-boot-demo-v1.jar"]
