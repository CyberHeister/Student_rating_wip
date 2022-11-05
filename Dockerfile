FROM eclipse-temurin:11
RUN mkdir /opt/app
COPY myapp1.jar /opt/app
CMD ["java", "-jar", "/opt/app/myapp1.jar"]