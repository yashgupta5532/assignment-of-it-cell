package com.student.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.student.entities.StudentEducation;
import com.student.services.StudentEducationService;

@Controller
public class FormDataController {

    private final StudentEducationService studentEducationService;

    @Autowired
    public FormDataController(StudentEducationService studentEducationService) {
        this.studentEducationService = studentEducationService;
    }

    @PostMapping("/saveFormData")
    @ResponseBody
    public ResponseEntity<StudentEducation> saveFormData(@RequestBody StudentEducation formData) {
        // Call the service to save the form data
        StudentEducation savedUser = studentEducationService.saveStudentEducation(formData);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }
}
