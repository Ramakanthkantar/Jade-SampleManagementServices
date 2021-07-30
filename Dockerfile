FROM adoptopenjdk/openjdk11:alpine-jre
#ARG JAR_FILE=target/samplemanagementservices-0.0.1-SNAPSHOT.jar
#VOLUME /tmp
COPY target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]
