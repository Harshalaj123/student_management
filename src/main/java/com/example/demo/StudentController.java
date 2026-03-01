package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentRepository repository;

    // १. नवीन विद्यार्थी जोडणे (POST)
    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return repository.save(student);
    }

    // २. सर्व विद्यार्थ्यांची यादी पाहणे (GET)
    @GetMapping
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    // ३. आयडीनुसार विद्यार्थ्याची माहिती पाहणे (GET by ID)
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Integer id) {
        return repository.findById(id).orElse(null);
    }

    // ४. विद्यार्थ्याची माहिती अपडेट करणे (PUT)
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Integer id, @RequestBody Student studentDetails) {
        return repository.findById(id).map(student -> {
            student.setName(studentDetails.getName());
            student.setEmail(studentDetails.getEmail());
            student.setCourse(studentDetails.getCourse());
            return repository.save(student);
        }).orElse(null);
    }

    // ५. विद्यार्थ्याची माहिती डिलीट करणे (DELETE)
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Integer id) {
        repository.deleteById(id);
        return "Student deleted successfully with ID: " + id;
    }
}