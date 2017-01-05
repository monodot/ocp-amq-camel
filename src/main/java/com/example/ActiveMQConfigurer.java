package com.example;

import org.apache.activemq.camel.component.ActiveMQComponent;
import org.apache.camel.PropertyInject;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

/**
 * Created by tdonohue on 28/12/2016.
 */
public class ActiveMQConfigurer {

    @Produces
    @Named("activemq")
    @ApplicationScoped
    ActiveMQComponent activemq() {
        ActiveMQComponent component = new ActiveMQComponent();
        component.setBrokerURL("failover://ssl://broker-amq-tcp-ssl-myproject.127.0.0.1.xip.io:443");
        component.setUserName("username");
        component.setPassword("password");
        return component;
    }

}
