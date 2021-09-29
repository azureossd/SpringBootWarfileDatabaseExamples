FROM maven:3.8.1 as build
WORKDIR /app
COPY . /app
# Skip Tests is being used since environment variables are inside the application.yml file - this is to prevent the build from failing
RUN mvn -f /app/pom.xml clean package -DskipTests

FROM tomcat:9-jdk11-slim
COPY --from=build /app/target/springbootwarfile-0.0.1-SNAPSHOT.war ${CATALINA_HOME}/webapps/
RUN rm -rf ${CATALINA_HOME}/webapps/ROOT && \
    mv ${CATALINA_HOME}/webapps/springbootwarfile-0.0.1-SNAPSHOT.war ${CATALINA_HOME}/webapps/ROOT.war

COPY sshd_config /etc/ssh/
COPY init_container.sh /opt/init_container.sh

ENV SSH_PASSWD "root:Docker!"
RUN apt-get update \
    && apt-get install -y --no-install-recommends dialog \
    && apt-get update \
    && apt-get install -y --no-install-recommends openssh-server \
    && echo "$SSH_PASSWD" | chpasswd \
    && chmod u+x /opt/init_container.sh \
    && ssh-keygen -A \
    && mkdir -p /run/sshd

EXPOSE 8080 2222

ENTRYPOINT [ "/opt/init_container.sh" ]