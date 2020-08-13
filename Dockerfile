FROM openjdk:8-jre-slim

WORKDIR /usr/share/suman

ADD /target/container-test-tests.jar container-test.jar
ADD  /target/libs libs

ADD pom.xml pom.xml
ENV BROWSER = chrome
ENV POMM  = AutomationPipeline
ENV SELENIUM_HUB = http://192.168.3.12:4444/wd/hub

ENTRYPOINT java -cp container-test.jar:libs/* -DseleniumHubHost=$SELENIUM_HUB -Dbrowser=$BROWSER cucumber.api.cli.Main --glue "StepDefinitions" classpath:Features /usr/share/suman/
