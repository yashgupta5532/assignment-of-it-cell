package com.codewithyash.springrest.entities;

import java.sql.Date;

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
@Table(name="aspirant")
@NoArgsConstructor
@Getter
@Setter
public class Aspirant {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name="form_no" ,length = 30)
    private int formNo;

    @Column(name="addmission_no",length = 30)
    private int addmissionNo;

    @Column(name="temp_admissioin_no",length = 30)
    private int temp_admissionNo;

    @Column(name="title",length = 80)
    private String title;

    @Column(name="name",length = 80)
    private String name;

    @Column(name="birth_day")
    private Date birthDay;

    private String sex;

    private String religion;

    @Column(name="martial_status",length = 15)
    private String martial_status;

    private String email;

    @Column(name="phone_no",length=255)
    private int phone;

    @Column(length=50)
    private String nationality;

    @Column(length=255)
    private String password;

    @Column(length=15)
    private String adhar_card_no;

    private Date date_of_admission;

    private int admission_year;

    private String blood_group;

    private String physical_challenge;
}
