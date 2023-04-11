FROM eclipse-temurin:17-jdk
ARG JAR_FILE=target/spring-techreads*.jar
COPY ${JAR_FILE} /opt/app/spring-techreads.jar

CMD ["java","-jar","/opt/app/spring-techreads.jar"]