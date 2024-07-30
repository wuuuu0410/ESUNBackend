package com.example.ESUNBANKBackend.vo;

import java.util.List;

import com.example.ESUNBANKBackend.entity.Employee;

public class SearchEmployeeRes extends BasicRes {

    private List<Employee> employeeList;

    public SearchEmployeeRes() {
    }

    public SearchEmployeeRes(int statusCode, String message) {
        super(statusCode, message);
    }

    public SearchEmployeeRes(int statusCode, String message, List<Employee> employeeList) {
        super(statusCode, message);
        this.employeeList = employeeList;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }
    

}
