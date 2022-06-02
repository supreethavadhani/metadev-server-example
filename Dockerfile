FROM openjdk:11

#Copy project to docker container
ADD ./ ./

#Setting path to ENV variables
ENV ROOT_DIR=src/main/java/in/cognitron/lms/
ENV LIB_DIR=../../../../../../lib/*

#Change directory to main directory
WORKDIR ${ROOT_DIR}

#Compile java code 
RUN javac -cp "${LIB_DIR}" Server.java

#Expose port
EXPOSE 8080

#Run application
CMD java -cp "${LIB_DIR}" in.cognitron.lms.Server