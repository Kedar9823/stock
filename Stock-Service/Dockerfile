FROM openjdk:19
EXPOSE 2222
COPY target/stock-service.jar stock-service.jar
#CMD ["java","-jar","/stock-service.jar"]
CMD ["java","-jar","/stock-service.jar","-web -webAllowOthers -tcp -tcpAllowOthers -browser"]