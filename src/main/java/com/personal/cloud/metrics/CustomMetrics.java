package com.personal.cloud.metrics;

import org.springframework.boot.actuate.endpoint.PublicMetrics;
import org.springframework.boot.actuate.metrics.Metric;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by josgar on 14/06/2017.
 */
@Component
public class CustomMetrics implements PublicMetrics {

    @Override
    public Collection<Metric<?>> metrics() {
        return Arrays.asList(new Metric<Number>("custom.availableProcs", Runtime.getRuntime().availableProcessors()));
    }
}
