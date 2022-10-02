package com.spring.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student("Mariam", "mariam.jamal@gmail.com", LocalDate.of(1998, Month.MAY, 5), 24);
            Student alex = new Student("Alex", "alex.angel@gmail.com", LocalDate.of(1997, Month.SEPTEMBER, 24), 25);
            Student elanor = new Student("Elanor", "elanor.january@gmail.com", LocalDate.of(1998, Month.JANUARY, 12), 24);

            repository.saveAll(List.of(mariam, alex, elanor));
        };
    }
}
