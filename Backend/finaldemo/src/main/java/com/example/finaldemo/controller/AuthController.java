package com.example.finaldemo.controller;

import com.example.finaldemo.model.auth.AuthRequest;
import com.example.finaldemo.model.Student;
import com.example.finaldemo.model.Staff;
import com.example.finaldemo.model.HOD;
import com.example.finaldemo.model.Management;
import com.example.finaldemo.repository.StudentRepository;
import com.example.finaldemo.repository.StaffRepository;
import com.example.finaldemo.repository.HODRepository;
import com.example.finaldemo.repository.ManagementRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")

@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StaffRepository staffRepository;

    @Autowired
    private HODRepository hodRepository;

    @Autowired
    private ManagementRepository managementRepository;

    @PostMapping("/student")
    public ResponseEntity<String> authenticateStudent(@RequestBody AuthRequest authRequest) {
        // Assuming StudentRepository has the appropriate method for authentication
        Student student = studentRepository.findByRegdNumAndDobAndDepartment(
                authRequest.getRegdNum(),
                authRequest.getDob(),
                authRequest.getDepartment()
        );

        if (student != null) {
            // Successful authentication
            return new ResponseEntity<>("Student authentication successful", HttpStatus.OK);
        } else {
            // Failed authentication
            return new ResponseEntity<>("Student authentication failed", HttpStatus.UNAUTHORIZED);
        }
    }

    @PostMapping("/staff")
    public ResponseEntity<String> authenticateStaff(@RequestBody AuthRequest authRequest) {
        // Assuming StaffRepository has the appropriate method for authentication
        Staff staff = staffRepository.findByNameAndPasswordAndDepartment(
                authRequest.getName(),
                authRequest.getPassword(),
                authRequest.getDepartment()
        );

        if (staff != null) {
            // Successful authentication
            return new ResponseEntity<>("Staff authentication successful", HttpStatus.OK);
        } else {
            // Failed authentication
            return new ResponseEntity<>("Staff authentication failed", HttpStatus.UNAUTHORIZED);
        }
    }

    @PostMapping("/hod")
    public ResponseEntity<String> authenticateHOD(@RequestBody AuthRequest authRequest) {
        // Assuming HODRepository has the appropriate method for authentication
        HOD hod = hodRepository.findByNameAndPasswordAndDepartment(
                authRequest.getName(),
                authRequest.getPassword(),
                authRequest.getDepartment()
        );

        if (hod != null) {
            // Successful authentication
            return new ResponseEntity<>("HOD authentication successful", HttpStatus.OK);
        } else {
            // Failed authentication
            return new ResponseEntity<>("HOD authentication failed", HttpStatus.UNAUTHORIZED);
        }
    }

    @PostMapping("/management")
    public ResponseEntity<String> authenticateManagement(@RequestBody AuthRequest authRequest) {
        // Assuming ManagementRepository has the appropriate method for authentication
        Management management = managementRepository.findByNameAndPasswordAndPosition(
                authRequest.getName(),
                authRequest.getPassword(),
                authRequest.getPosition()
        );

        if (management != null) {
            // Successful authentication
            return new ResponseEntity<>("Management authentication successful", HttpStatus.OK);
        } else {
            // Failed authentication
            return new ResponseEntity<>("Management authentication failed", HttpStatus.UNAUTHORIZED);
        }
    }

    // Similar methods for HOD and Management authentication...
}