package com.example.spring_jdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.spring_jdbc.domain.Employee;
import com.example.spring_jdbc.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public Employee load(Integer id) {
        return repository.load(id);
    }

    public List<Employee> findAll() {
        return repository.findAll();

    }

    public Employee save(Employee employee) {
        return repository.save(employee);
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
