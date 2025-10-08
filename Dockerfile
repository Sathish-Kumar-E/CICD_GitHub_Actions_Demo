FROM openjdk:17-jdk-slim
EXPOSE 8080
ADD target/cicd-github-actions-demo.jar cicd-github-actions-demo.jar
ENTRYPOINT ["java" , "-jar" , "/cicd-github-actions-demo.jar"]
