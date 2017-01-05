# OpenShift/A-MQ demo

Demonstrates connecting to an ActiveMQ instance running in OpenShift.

1. Follow [A-MQ deployment instructions][1].

2. Configure ActiveMQ connection string in `ActiveMQConfigurer.java`

3. Run locally using:

        mvn clean install exec:java -Djavax.net.ssl.trustStore=path/to/trustStore.ts -Djavax.net.ssl.trustStorePassword=yourpass

[1]: https://access.redhat.com/documentation/en/red-hat-jboss-middleware-for-openshift/3/single/red-hat-jboss-a-mq-for-openshift/#preparing_a_mq_deployment
