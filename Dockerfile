FROM openjdk:11-jdk-slim AS build
WORKDIR /app

COPY . .

RUN ./gradlew shadowJar

FROM openjdk:11-jre-slim
WORKDIR /app

COPY --from=build /app/build/libs/*.jar /app/

CMD java -jar /app/*.jar