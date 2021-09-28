FROM tomcat:9

RUN rm -rf ${CATALINA_HOME}/webapps/ROOT
COPY target/springbootwarfile-0.0.1-SNAPSHOT.war ${CATALINA_HOME}/webapps/

COPY sshd_config /etc/ssh/
COPY init_container.sh /opt/init_container.sh

ENV SSH_PASSWD "root:Docker!"
RUN apt-get update \
    && apt-get install -y --no-install-recommends dialog \
    && apt-get update \
    && apt-get install -y --no-install-recommends openssh-server \
    && echo "$SSH_PASSWD" | chpasswd \
    && chmod u+x /opt/init_container.sh

EXPOSE 8080 2222

ENTRYPOINT [ "/opt/init_container.sh" ]