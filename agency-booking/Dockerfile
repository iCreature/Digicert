
# Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
# Click nbfs://nbhost/SystemFileSystem/Templates/Other/Dockerfile to edit this template

FROM adoptopenjdk/openjdk17:alpine-jre

WORKDIR /app

COPY target/demo-0.0.1-SNAPSHOT.jar /app/demo.jar

EXPOSE 8080

CMD ["java", "-jar", "agency-booking.jar"]
