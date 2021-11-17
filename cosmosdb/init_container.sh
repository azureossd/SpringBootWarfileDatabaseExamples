#!/bin/bash

echo "Starting SSH.."
/usr/sbin/sshd

echo "Starting Tomcat.."
/usr/local/tomcat/bin/catalina.sh run