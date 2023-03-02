FROM openjdk
EXPOSE 7091
ADD /target/*.jar producer.jar
ENTRYPOINT ["java","-jar","producer.jar"]