package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;


import java.util.List;


@RestController
@RequestMapping(path = "/api/v1/student")
public class StudentController {

    private StudentRepository studentRepository;

    @Autowired
    StudentController(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @GetMapping("/all")
    Iterable<StudentModel> all (){
        return studentRepository.findAll();
    }

    @GetMapping("/{id}")
    StudentModel studentById(@PathVariable long id) {
        return studentRepository.findById(id).orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    StudentModel saveStudent(@RequestBody StudentModel student) {
        return studentRepository.save(student);
    }

}
