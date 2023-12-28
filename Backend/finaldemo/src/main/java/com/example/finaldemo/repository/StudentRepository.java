package com.example.finaldemo.repository;

import java.util.List;

import com.example.finaldemo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByRegdNumAndDobAndDepartment(String regdNum, String dob, String department);
    List<Student> findByDepartment(String department);
}