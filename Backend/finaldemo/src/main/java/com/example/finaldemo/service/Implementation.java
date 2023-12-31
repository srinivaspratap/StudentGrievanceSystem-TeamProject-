package com.example.finaldemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.finaldemo.model.Complaint;
import com.example.finaldemo.repository.ComplaintRepository;

import jakarta.persistence.EntityNotFoundException;


@Service
public class Implementation implements ComplaintServices {
	
	@Autowired
	private ComplaintRepository complaintRepo;

	@Override
	 public Complaint addComplaint(Complaint complaint) {
		
       return complaintRepo.save(complaint);
    }

	@Override
	public List<Complaint> findAllComplaints() {
		
		return complaintRepo.findAll();
	}

	@Override
	public Complaint updateComplaintStatus(long complaintId, String status) {
		
		Complaint complaint = complaintRepo.findById(complaintId)
                .orElseThrow(() -> new EntityNotFoundException("Complaint not found with id: " + complaintId));
        
        complaint.setStatus(status);
        return complaintRepo.save(complaint);
    }

	@Override
	public List<Complaint> findDepartmentComplaints(String department) {
		
		return complaintRepo.findByDepartment(department);
	}

}