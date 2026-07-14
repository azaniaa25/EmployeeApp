package com.example.employeeApp.service;

import com.example.employeeApp.model.entity.Employee;
import java.util.List;

public interface EmployeeService {

        Employee create(Employee employee);
        Employee getById(Long id);
        List<Employee> getAll();
        void delete(Long id);
}


