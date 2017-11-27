# triangleweb is a web project that provides triangle classification service. 

To deploy
<p>
git clone https://github.com/FourColorsSuffice/triangleweb.git
<p>
cd triangleweb
<p>
mvn tomcat:run
<p>
mvn package

<p>To deploy using Docker
  
<p>1) create a Dockerfile
<p>FROM tomcat:8.0.20-jre8
<p>COPY triangleweb.war /usr/local/tomcat/webapps/triangleweb.war
<p>2) build
<p>docker build -t triangleweb .
<p>3) stop tomcat if needed
<p>sudo service tomcat7 stop
<p>4) stop all other containers
<p>docker kill $(docker ps -q)
<p>to remove all containers, docker rm $(docker ps -a -q)
<p>to remove all docker images, docker rmi $(docker images -q)
<p>5) run docker
<p>docker run -it --rm -p 8080:8080 triangleweb
<p>6) access web
<p>http://x.x.x.x:8080/triangleweb/
<p>enjoy.
