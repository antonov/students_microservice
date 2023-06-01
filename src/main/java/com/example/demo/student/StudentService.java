package com.example.demo.student;


import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        Student student = new Student(1L, "Artem", "artem@antonov.es", LocalDate.of(1988, Month.SEPTEMBER, 1), 34 );
        return List.of(student, student);
    }
}
