FROM openjdk:11
VOLUME /tmp
ADD target/sandbox-service-0.0.1-SNAPSHOT.jar application.jar
ENV JAVA_OPTS="-Xmx128m -Djava.security.egd=file:/dev/./urandom"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar /application.jar" ]
