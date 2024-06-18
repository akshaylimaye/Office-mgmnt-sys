package com.itview.Office_management_sys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OfficeManagementSysApplication {

	public static void main(String[] args) {
		SpringApplication.run(OfficeManagementSysApplication.class, args);
	}

	/*@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");

//			String[] beanNames = ctx.getBeanDefinitionNames();
//			Arrays.sort(beanNames);
//			for (String beanName : beanNames) {
//				System.out.println(beanName);
//			}

			Doctor doctor = ctx.getBean(Doctor.class);

			doctor.setDoctorName("Akshay");
			System.out.println(doctor.getDoctorName());

			Doctor doctor1 = ctx.getBean(Doctor.class);
			System.out.println(doctor1.getDoctorName());

		};

	}*/
}
