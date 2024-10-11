package com.managment.employment.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "gender")
    private String gender;

    @Column(name = "duty_station")
    private String dutyStation;

    @Column(name = "passport")
    private String passport;

    @Column(name = "department_id")
    private Integer departmentId;

    @Column(name = "salary")
    private String salary;

    @Column(name = "hired_date")
    private LocalDate hiredDate;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "fk_emp_id", referencedColumnName = "emp_id")
    private List<Address> addresses;

}
