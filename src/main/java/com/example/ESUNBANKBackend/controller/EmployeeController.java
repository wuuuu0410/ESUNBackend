package com.example.ESUNBANKBackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ESUNBANKBackend.service.ifs.EmployeeService;
import com.example.ESUNBANKBackend.vo.BasicRes;
import com.example.ESUNBANKBackend.vo.CreateOrUpdateEmployeeReq;
import com.example.ESUNBANKBackend.vo.DeleteEmployeeReq;
import com.example.ESUNBANKBackend.vo.SearchEmployeeReq;
import com.example.ESUNBANKBackend.vo.SearchEmployeeRes;

import jakarta.validation.Valid;

@CrossOrigin
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    //員工新增和修改
    @PostMapping(value = "employee/createOrUpdate")
    public BasicRes createOrUpdateEmployee(@Valid@RequestBody CreateOrUpdateEmployeeReq req){
        return employeeService.createOrUpdateEmployee(req);
    }
    //員工搜尋
    @PostMapping(value = "employee/search")
    public SearchEmployeeRes searchEmployee(@RequestBody SearchEmployeeReq req){
        return employeeService.searchEmployee(req);
    }
    //員工刪除
    @PostMapping(value = "employee/delete")
    public BasicRes deleteEmployee(@RequestBody DeleteEmployeeReq req){
        return employeeService.deleteEmployee(req);
    }
}
