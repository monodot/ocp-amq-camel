package com.example;

import org.apache.deltaspike.core.api.config.ConfigProperty;
import javax.inject.Inject;

/**
 * Created by tdonohue on 03/02/2017.
 */
public class ActiveMQConfiguration {

    @Inject
    @ConfigProperty(name = "USERNAME", defaultValue = "admin")
    private String userName;

    @Inject
    @ConfigProperty(name = "PASSWORD", defaultValue = "admin")
    private String password;

    @Inject
    @ConfigProperty(name = "URL", defaultValue = "failover://tcp://broker-amq-tcp:61616")
    private String url;

    public String getUserName() {
        return userName;
    }
    public String getPassword() {
        return password;
    }
    public String getUrl() {
        return url;
    }

}
