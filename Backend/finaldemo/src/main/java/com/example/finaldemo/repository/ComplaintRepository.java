package com.example.finaldemo.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.finaldemo.model.Complaint;



public interface ComplaintRepository extends JpaRepository<Complaint,Serializable> {

	public List<Complaint> findByDepartment(String department);
	
	

}