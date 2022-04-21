FROM openjdk:13-alpine

ADD target/*.jar /app.jar

ENTRYPOINT exec java $JAVA_OPTS -jar /app.jar