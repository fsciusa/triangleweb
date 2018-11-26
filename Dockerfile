FROM tomcat:8.0.20-jre8

COPY triangleweb.war /usr/local/tomcat/webapps/triangleweb.war
