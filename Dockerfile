FROM openjdk:18-alpine
WORKDIR /
#ADD user_login/target/user_login-0.0.1-SNAPSHOT.jar //
COPY target/*.jar user_login-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","user_login-0.0.1-SNAPSHOT.jar"]