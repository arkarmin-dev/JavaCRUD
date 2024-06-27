package com.cgm.system.storage.demoStorage.config;

import com.cgm.system.storage.demoStorage.web.controller.ProductController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoggerConfig {

    @Bean
    public Logger logger() {
        return LoggerFactory.getLogger(ProductController.class);
    }
}
