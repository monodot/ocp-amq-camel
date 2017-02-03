package com.example;

import io.fabric8.annotations.Configuration;
import org.apache.activemq.camel.component.ActiveMQComponent;

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
    ActiveMQComponent activemq(@Configuration ActiveMQConfiguration conf) {
        ActiveMQComponent component = new ActiveMQComponent();
        //component.setBrokerURL("failover://ssl://pvbroker-amq-tcp-ssl-amq2.127.0.0.1.xip.io:443");
//        component.setBrokerURL("failover://ssl://broker-amq-tcp.amq2.svc.cluster.local:61617");

        component.setBrokerURL(conf.getUrl());
        component.setUserName(conf.getUserName());
        component.setPassword(conf.getPassword());

        //component.setBrokerURL("tcp://172.17.0.3:61616");
//        component.setUserName("userFoV");
//        component.setPassword("xe1xBlqU");

        return component;
    }



}
