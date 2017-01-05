package com.example;

import org.apache.camel.cdi.ContextName;
import org.apache.camel.impl.DefaultCamelContext;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;

/**
 * Created by tdonohue on 03/01/2017.
 */
@ApplicationScoped
@Default
@ContextName("ocp-amq-camel-context")
public class CustomCamelContext extends DefaultCamelContext {

    @PostConstruct
    void customize() {
        getShutdownStrategy().setTimeout(5000L);
    }

}
