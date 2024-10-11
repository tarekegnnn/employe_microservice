package com.managment.employment.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "addresses")
@Data
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "house_number")
    private String houseNumber;

    @Column(name = "car_model")
    private String carModel;

    @Column(name = "hired_date")
    private LocalDate hiredDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "marital_status")
    private String maritalStatus;

    @Column(name = "pension_number")
    private String pensionNumber;

    @Column(name = "dob")
    private LocalDate dob;

    @Column(name = "age")
    private Integer age;

    @Column(name = "nationality")
    private String nationality;

    @Column(name = "tin_number")
    private String tinNumber;




}
