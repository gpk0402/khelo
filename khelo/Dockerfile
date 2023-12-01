# Use an official OpenJDK runtime as a base image

FROM openjdk:17-jdk-slim


# Set the working directory in the container
WORKDIR /app

# Copy the packaged JAR file into the container
COPY target/khelo-0.0.1-SNAPSHOT.jar khelo.jar

EXPOSE 8080

# Specify the command to run on container start
CMD ["java", "-jar", "khelo.jar"]
