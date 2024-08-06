package com.techeazy_Student_Project.Student_Subject_Project_Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class StudentSubjectProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentSubjectProjectApplication.class, args);
		System.out.println("hello  Arun  what are u doing  ");
	}

}
