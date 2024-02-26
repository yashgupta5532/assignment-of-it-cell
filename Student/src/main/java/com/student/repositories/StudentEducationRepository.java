package com.student.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.entities.StudentEducation;

@Repository
public interface StudentEducationRepository extends JpaRepository<StudentEducation, Long> {
    // Add custom query methods if needed
}
