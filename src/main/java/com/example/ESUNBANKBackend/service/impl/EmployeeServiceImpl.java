package com.example.ESUNBANKBackend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ESUNBANKBackend.repository.EmployeeDao;
import com.example.ESUNBANKBackend.service.ifs.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDao employeeDao;
}
