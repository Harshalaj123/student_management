package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    // JpaRepository मुळे आपल्याला Save, Find, Delete या मेथड्स आपोआप मिळतात.
}