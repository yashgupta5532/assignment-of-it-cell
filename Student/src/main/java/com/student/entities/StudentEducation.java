package com.student.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "student_education")
public class StudentEducation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "student_id")
    private Long studentId;

    @Column(name = "qualification_id")
    private int qualificationId;

    @Column(name = "institute")
    private String institute;

    @Column(name = "board_university")
    private String boardUniversity;

    @Column(name = "status")
    private String status;

    @Column(name = "pass_year")
    private int passYear;

    @Column(name = "pass_percentage")
    private String passPercentage;

    @Column(name = "score_type")
    private String scoreType;

}