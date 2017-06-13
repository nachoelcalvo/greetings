package com.personal.cloud.indicator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

/**
 * Created by josgar on 13/06/2017.
 */
@Component
public class CustomHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {
        return (System.currentTimeMillis() / 1000 % 2 == 0) ? Health.up().build() : Health.down().build();
    }
}
