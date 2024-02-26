package com.student.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entities.StudentEducation;
import com.student.repositories.StudentEducationRepository;

@Service
public class StudentEducationService {

    private final StudentEducationRepository studentEducationRepository;

    @Autowired
    public StudentEducationService(StudentEducationRepository studentEducationRepository) {
        this.studentEducationRepository = studentEducationRepository;
    }

    public StudentEducation saveStudentEducation(StudentEducation studentEducation) {
        return studentEducationRepository.save(studentEducation);
    }
}

