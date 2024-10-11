package com.managment.employment.service;

import com.managment.employment.model.Employee;
import com.managment.employment.repository.EmployeeRepository;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;


@AllArgsConstructor
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public boolean deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
        return true;
    }
}

