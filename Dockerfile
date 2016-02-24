FROM java:8
EXPOSE 8080
ADD ./target/spring-session-example.jar /var/spring-session-example.jar
CMD java -jar /var/spring-session-example.jar