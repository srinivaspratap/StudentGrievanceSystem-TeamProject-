// package com.example.studentfeedback.model;

// public class Complaint {
    
// }
package com.example.finaldemo.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Complaints")
public class Complaint {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long complaintId;
	
	private Date complaintRegisteredDate;
	private String department;
	private String category;
	private String details;
	private String desiredOutcome;
	private String status;
	private String role;
	

	//getters and setters

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public long getComplaintId() {
		return complaintId;
	}

	public void setComplaintId(long complaintId) {
		this.complaintId = complaintId;
	}

	public Date getComplaintRegisteredDate() {
		return complaintRegisteredDate;
	}

	public void setComplaintRegisteredDate(Date complaintRegisteredDate) {
		this.complaintRegisteredDate = complaintRegisteredDate;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCategory() {
		return category;
	}
	

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getDesiredOutcome() {
		return desiredOutcome;
	}

	public void setDesiredOutcome(String desiredOutcome) {
		this.desiredOutcome = desiredOutcome;
	}
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	//constructors
	public Complaint(long complaintId, Date complaintRegisteredDate,String role, String department, String category, String details,
			String desiredOutcome, String status) {
		super();
		this.complaintId = complaintId;
		this.complaintRegisteredDate = complaintRegisteredDate;
		this.department = department;
		this.category = category;
		this.details = details;
		this.desiredOutcome = desiredOutcome;
		this.status = status;
		this.role = role;
	}

	public Complaint() {
		super();
		this.status = "Received";
	}
	
}