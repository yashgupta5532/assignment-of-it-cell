package com.codewithyash.springrest.payload;

import java.sql.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class AspirantDto {
    

    private Integer id;

    private int formNo;

    private int addmissionNo;

    private int temp_admissionNo;

    private String title;

    private String name;

    private Date birthDay;

    private String sex;

    private String religion;

    private String martial_status;

    private String email;

    private int phone;

    private String nationality;

    private String password;

    private String adhar_card_no;

    private Date date_of_admission;

    private int admission_year;

    private String blood_group;

    private String physical_challenge;
}
