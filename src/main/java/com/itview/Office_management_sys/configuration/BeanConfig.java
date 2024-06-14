package com.itview.Office_management_sys.configuration;

import com.itview.Office_management_sys.utils.Doctor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Date;

@Configuration
public class BeanConfig {


    @Bean
    public Date beanForDate()
    {
        return new Date();
    }

    @Bean
    @Scope("prototype")
    public Doctor doctorBean() {
        return new Doctor();
    }




}
