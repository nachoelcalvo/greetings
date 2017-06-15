package com.personal.cloud.config;

import com.personal.cloud.infra.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by josgar on 15/06/2017.
 */
@Configuration
@Profile("dev")
public class DatabaseDevConfiguration {

    private DatabaseProperties databaseProperties;

    @Autowired
    public DatabaseDevConfiguration(DatabaseProperties databaseProperties){
        this.databaseProperties = databaseProperties;
    }

    @Bean
    Database database(){
        return new Database(databaseProperties.getHost(),
                databaseProperties.getPort(),
                databaseProperties.isEnabled());
    }
}
