package com.example.finaldemo.repository;
import java.util.List;
import com.example.finaldemo.model.Management;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagementRepository extends JpaRepository<Management, Long> {
    Management findByNameAndPasswordAndPosition(String name, String password, String position);
    List<Management> findByPosition(String position);
}