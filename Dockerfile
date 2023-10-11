FROM openjdk:18
VOLUME /tmp
EXPOSE 8000
ADD ./target/api-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]