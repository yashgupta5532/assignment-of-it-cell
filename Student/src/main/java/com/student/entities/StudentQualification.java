package com.student.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="stu_qualification")
@NoArgsConstructor
@Getter
@Setter
public class StudentQualification {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private int qualificationId;

    private String qualificationName;
}
