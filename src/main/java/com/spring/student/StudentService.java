package com.spring.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(1L, "Mariam", "mariam.jamal@gmail.com", LocalDate.of(1998, Month.MAY, 5), 24)
        );
    }
}
