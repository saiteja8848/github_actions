From openjdk:12-alpine

COPY target/github_actions-*.jar  /github_actions.jar

CMD ["java","-jar","/github_actions.jar"]
