#!/bin/bash

# https://support.sonatype.com/hc/en-us/articles/213465818-How-can-I-programmatically-upload-an-artifact-into-Nexus-2-

##################################################################
# r - repository
# hasPom - if we are supplying pom, or should one be generated
# e - extension
# g - group id
# a - artifact id
# v - version
# p - packaging
# file - file(s) to be uploaded
# u - user credentials
##################################################################

echo $@

curl -v \
-F r=$1 \
-F hasPom=false \
-F e=zip \
-F g=$2 \
-F a=test-project \
-F v=0.0.0.${BUILD_NUMBER} \
-F p=zip \
-F file=@test.zip \
-u admin:admin123 \
http://nexus-container:8081/nexus/service/local/artifact/maven/content # docker container connection
# http://loaclhost:8081/nexus/service/local/artifact/maven/content #TODO: SSL connection