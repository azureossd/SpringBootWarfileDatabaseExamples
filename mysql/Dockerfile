FROM tomcat:9-jre8-alpine

RUN rm -rf ${CATALINA_HOME}/webapps/ROOT
COPY target/springbootwarfile-0.0.1-SNAPSHOT.war ${CATALINA_HOME}/webapps/ROOT.war
COPY sshd_config /etc/ssh/
COPY init_container.sh /opt/init_container.sh

RUN apk add openssh \
    && echo "root:Docker!" | chpasswd \
    && chmod +x /opt/init_container.sh \
    && ssh-keygen -A

EXPOSE 8080 2222

ENTRYPOINT [ "/opt/init_container.sh" ]