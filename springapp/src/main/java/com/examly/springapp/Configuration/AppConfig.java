package com.examly.springapp.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import your.package.com.examly.springapp.model.Student;

@Configuration
public class AppConfig {

    @Bean
    public Student student() {
        Student student = new Student();
        student.setStudentId(1);
        student.setFirstName("John");
        student.setLastName("Doe");
        return student;
    }
}
