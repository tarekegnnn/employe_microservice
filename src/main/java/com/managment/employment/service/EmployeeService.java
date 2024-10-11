package com.managment.employment.service;

import com.managment.employment.model.Employee;
import com.managment.employment.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);  // Saves the employee to the database
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll(); // Retrieves all employees from the repository
    }

    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id); // Retrieves the employee by ID
    }

    public boolean deleteEmployee(Long id) {
        employeeRepository.deleteById(id); // Deletes the employee by ID
        return false;
    }
}

