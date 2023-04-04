package com.bdjsc.hrdb.service;

import com.bdjsc.hrdb.repository.EmployeeRepository;
import com.bdjsc.hrdb.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
