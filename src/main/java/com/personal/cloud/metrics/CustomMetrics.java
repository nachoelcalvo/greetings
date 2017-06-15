package com.personal.cloud.metrics;

import com.personal.cloud.config.DatabaseProperties;
import org.springframework.beans.factory.annotation.Autowired;
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

    private DatabaseProperties databaseProperties;

    @Autowired
    public CustomMetrics(DatabaseProperties databaseProperties){
        this.databaseProperties = databaseProperties;
    }

    @Override
    public Collection<Metric<?>> metrics() {
        return Arrays.asList(new Metric<Number>("custom.availableProcs", Runtime.getRuntime().availableProcessors()),
                new Metric<Number>("custom.database.host", databaseProperties.getPort()));
    }
}
