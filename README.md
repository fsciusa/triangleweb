# triangleweb is a web project that provides triangle classification service. 

To deploy
git clone https://github.com/FourColorsSuffice/triangleweb.git
cd triangleweb
mvn tomcat:run
mvn package

To deploy using Docker
1) create a Dockerfile
FROM tomcat:8.0.20-jre8 
COPY triangleweb.war /usr/local/tomcat/webapps/triangleweb.war

2) build 
docker build -t triangleweb . 

3) stop tomcat if needed.
sudo service tomcat7 stop

4) stop all other containers
docker kill $(docker ps -q)

to remove all containers, docker rm $(docker ps -a -q)
to remove all docker images, docker rmi $(docker images -q)

5) run docker
docker run -it --rm -p 8080:8080 triangleweb

6) access web
http://x.x.x.x:8080/triangleweb/

enjoy.
