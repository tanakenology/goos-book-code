FROM openjdk:11

RUN apt-get update && \
    apt-get install -y \
        curl

# Download and install Openfire
RUN cd /usr/local && \
    curl -L https://github.com/igniterealtime/Openfire/releases/download/v3.6.4/openfire_3_6_4.zip -o openfire_3_6_4.zip && \
    unzip -d /opt openfire_3_6_4.zip && \
    rm openfire_3_6_4.zip

# Move openfire_mysql.sql for initializing mysql db
RUN mkdir /opt/initdb.d && \
    mv /opt/openfire/resources/database/openfire_mysql.sql /opt/initdb.d/

WORKDIR /opt/openfire/lib

ENTRYPOINT ["java", "-jar", "startup.jar"]
