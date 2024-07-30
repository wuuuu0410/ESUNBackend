package com.example.ESUNBANKBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ESUNBANKBackend.entity.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee,Long>{

}
