FROM openjdk
EXPOSE 7092
ADD /target/*.jar consumer.jar
ENTRYPOINT ["java","-jar","consumer.jar"]