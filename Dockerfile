# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine

# Add Maintainer Info
LABEL maintainer="rumen.papukchiev.@kaufland.com"

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8080 available to the world outside this container
EXPOSE 8080

# The application's jar file
ARG WAR_FILE=target/TodoListManagerJPA_Docker.war

# Add the application's jar to the container
ADD ${WAR_FILE} TodoListManagerJPA_Docker.war

# Run the jar file
ENTRYPOINT ["java","-jar","/TodoListManagerJPA_Docker.war"]