package com.example.finaldemo.repository;

import java.util.List;
import com.example.finaldemo.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff, Long> {
    Staff findByNameAndPasswordAndDepartment(String name, String password, String department);
    List<Staff> findByDepartment(String department);
}