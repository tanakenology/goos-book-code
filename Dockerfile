FROM openjdk:11

# Download and install Gradle
RUN cd /usr/local && \
    curl -L https://services.gradle.org/distributions/gradle-7.2-bin.zip -o gradle-7.2-bin.zip && \
    mkdir /opt/gradle && \
    unzip -d /opt/gradle gradle-7.2-bin.zip && \
    rm gradle-7.2-bin.zip

# Configure PATH environment variable
ENV PATH $PATH:/opt/gradle/gradle-7.2/bin

# Configure CLASSPATH environment variable
ENV CLASSPATH $CLASSPATH:/usr/src/mysql-connector-java-5.1.34-bin.jar

WORKDIR /usr/src
