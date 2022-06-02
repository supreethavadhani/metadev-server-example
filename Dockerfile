FROM openjdk:11
#Copy project to docker container
COPY ./ ./
#Change directory to main directory
WORKDIR src/main/java/in/cognitron/lms/
#Compile java code 
RUN javac -cp "../../../../../../lib/*" Server.java
#Expose port
EXPOSE 8080
#Run application
CMD java -cp "../../../../../../lib/*" in.cognitron.lms.Server
