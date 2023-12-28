package com.example.finaldemo.repository;
import java.util.List;
import com.example.finaldemo.model.HOD;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HODRepository extends JpaRepository<HOD, Long> {
    HOD findByNameAndPasswordAndDepartment(String name, String password, String department);
    List<HOD> findByDepartment(String department);
}