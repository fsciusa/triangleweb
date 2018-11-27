FROM tomcat:8.0.20-jre8

RUN mvn package -Dmaven.test.skip=true 

COPY target/triangleweb.war /usr/local/tomcat/webapps/triangleweb.war
