FROM openjdk:11

#Copy JAR file to contianer 
COPY metadev-jar.jar metadev-jar.jar

#EXPOSE port 8080 to access app through localhost
#from host machine
EXPOSE 8080

#Command to run JAR File
CMD ["java","-jar","metadev-jar.jar"]