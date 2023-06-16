# openjdk17
FROM openjdk:17 AS builder

COPY ./cicd-0.0.1-SNAPSHOT.jar /app/server/cicd.jar

# 8080 컨테이너 포트 노출
EXPOSE 8888

# jar 파일 실행
ENTRYPOINT ["java", "-jar", "/app/server/cicd.jar"]