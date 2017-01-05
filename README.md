# OpenShift/A-MQ demo

Demonstrates connecting to an ActiveMQ instance running in OpenShift.

Run locally using:

    mvn clean install exec:java -Djavax.net.ssl.trustStore=path/to/trustStore.ts -Djavax.net.ssl.trustStorePassword=yourpass

