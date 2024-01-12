
EXPOSE 8080
ADD target/spring-boot-docker-integration.jar spring-boot-docker-integration.jar
ENTRYPOINT ["java", "-jar", "spring-boot-docker-integration.jar"]