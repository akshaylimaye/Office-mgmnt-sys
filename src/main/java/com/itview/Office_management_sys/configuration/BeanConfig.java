package com.itview.Office_management_sys.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class BeanConfig {


    @Bean
    public Date beanForDate() {
        return new Date();
    }


}
