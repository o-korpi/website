FROM gradle:latest AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build

FROM amazoncorretto:21-alpine-jdk
EXPOSE 8080
COPY --from=build /home/gradle/src/build/libs/portfolio-0.0.1.jar /app/
RUN ls app
ENTRYPOINT ["java", "-XX:+UnlockExperimentalVMOptions", "-Djava.security.egd=file:/dev/./urandom","-jar","/app/portfolio-0.0.1.jar"]
