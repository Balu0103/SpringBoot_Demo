package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student Balu = new Student(
                    "Balu",
                    "balu@gmail.com",
                    LocalDate.of(2000, Month.APRIL, 1)
            );
            Student pune = new Student(
                    "pune",
                    "pune@gmail.com",
                    LocalDate.of(2001, Month.AUGUST, 2)
            );
            Student john = new Student(
                    "john",
                    "pune@gmail.com",
                    LocalDate.of(2001, Month.AUGUST, 2)
            );
            repository.saveAll(List.of(Balu, pune, john));
        };
    }
}
