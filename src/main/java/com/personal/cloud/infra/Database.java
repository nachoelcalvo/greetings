package com.personal.cloud.infra;

import org.springframework.stereotype.Component;

/**
 * Created by josgar on 15/06/2017.
 */
public class Database {

    private String host;
    private int port;
    private boolean enabled;

    public Database(String host, int port, boolean enabled) {
        this.host = host;
        this.port = port;
        this.enabled = enabled;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
