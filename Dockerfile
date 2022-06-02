FROM openjdk:11
COPY ./ ./
RUN pwd
WORKDIR src/main/java/in/cognitron/lms/
RUN javac -cp "../../../../../../lib/*" Server.java
EXPOSE 8080
CMD java -cp "../../../../../../lib/*" in.cognitron.lms.Server
