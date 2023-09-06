FROM openjdk:17.0.1-jdk-slim
COPY target/classes/ /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "org.raj.nola.AddTwoNumbers","5","15"]