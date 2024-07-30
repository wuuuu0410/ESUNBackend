package com.example.ESUNBANKBackend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ESUNBANKBackend.constants.ResMessage;
import com.example.ESUNBANKBackend.entity.Employee;
import com.example.ESUNBANKBackend.repository.EmployeeDao;
import com.example.ESUNBANKBackend.service.ifs.EmployeeService;
import com.example.ESUNBANKBackend.vo.BasicRes;
import com.example.ESUNBANKBackend.vo.CreateOrUpdateEmployeeReq;
import com.example.ESUNBANKBackend.vo.SearchEmployeeReq;
import com.example.ESUNBANKBackend.vo.SearchEmployeeRes;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public BasicRes createOrUpdateEmployee(CreateOrUpdateEmployeeReq req) {
        if(req.getEmp_id() == null){
            employeeDao.save(new Employee(req.getName(),req.getEmail(),req.getFloor_seat_seq()));
            return new BasicRes(ResMessage.SUCCESS.getCode(),ResMessage.SUCCESS.getMessage());
        }
        boolean boo = employeeDao.existsById(req.getEmp_id());
        if(!boo){
            return new BasicRes(ResMessage.EMP_ID_NOT_FOUND.getCode(),ResMessage.EMP_ID_NOT_FOUND.getMessage());
        }
        employeeDao.save(new Employee(req.getEmp_id(),req.getName(),req.getEmail(),req.getFloor_seat_seq()));
        return new BasicRes(ResMessage.UPDATE_SUCCESS.getCode(),ResMessage.UPDATE_SUCCESS.getMessage());
    }

    @Override
    public SearchEmployeeRes searchEmployee(SearchEmployeeReq req) {
        if(employeeDao.findEmployee(req.getEmp_id(),req.getName()).isEmpty()){
            return new SearchEmployeeRes(ResMessage.NOT_FOUND.getCode(),ResMessage.NOT_FOUND.getMessage());
        }
        return new SearchEmployeeRes(ResMessage.SUCCESS.getCode(),ResMessage.SUCCESS.getMessage(),//
        employeeDao.findEmployee(req.getEmp_id(),req.getName()));

    }
}
