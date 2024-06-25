package com.itview.Office_management_sys.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Calendar;
import java.util.Date;

@Configuration
public class CustomConfig {


    @Bean
    public Date beanForDate()
    {
        return new Date();
    }

    @Bean
    public Date beanForBackedDate() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -7);
        return cal.getTime();
    }




}
