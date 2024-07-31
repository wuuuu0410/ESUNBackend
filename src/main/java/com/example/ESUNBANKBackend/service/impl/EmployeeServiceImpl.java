package com.example.ESUNBANKBackend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.example.ESUNBANKBackend.constants.ResMessage;
import com.example.ESUNBANKBackend.entity.Employee;
import com.example.ESUNBANKBackend.repository.EmployeeDao;
import com.example.ESUNBANKBackend.service.ifs.EmployeeService;
import com.example.ESUNBANKBackend.vo.BasicRes;
import com.example.ESUNBANKBackend.vo.CreateOrUpdateEmployeeReq;
import com.example.ESUNBANKBackend.vo.DeleteEmployeeReq;
import com.example.ESUNBANKBackend.vo.SearchEmployeeReq;
import com.example.ESUNBANKBackend.vo.SearchEmployeeRes;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public BasicRes createOrUpdateEmployee(CreateOrUpdateEmployeeReq req) {
        //檢查信箱是否已存在
        boolean mail = employeeDao.existsByEmail(req.getEmail());
        //如果沒有輸入id表示新增員工
        if(req.getEmp_id() == null){
            //如果信箱已存在return
            if(mail){
                return new BasicRes(ResMessage.EMAIL_EXISTS.getCode(),ResMessage.EMAIL_EXISTS.getMessage());
            }
            //沒有重複信箱則新增
            employeeDao.save(new Employee(req.getName(),req.getEmail(),req.getFloor_seat_seq()));
            return new BasicRes(ResMessage.SUCCESS.getCode(),ResMessage.SUCCESS.getMessage());
        }
        //檢查是否有員工編號
        boolean boo = employeeDao.existsById(req.getEmp_id());
        //查無此員工
        if(!boo){
            return new BasicRes(ResMessage.EMP_ID_NOT_FOUND.getCode(),ResMessage.EMP_ID_NOT_FOUND.getMessage());
        }
        //編輯員工資料
        employeeDao.save(new Employee(req.getEmp_id(),req.getName(),req.getEmail(),req.getFloor_seat_seq()));
        return new BasicRes(ResMessage.UPDATE_SUCCESS.getCode(),ResMessage.UPDATE_SUCCESS.getMessage());
    }

    @Override
    public SearchEmployeeRes searchEmployee(SearchEmployeeReq req) {
        //如果查詢結果是空回傳，沒有找到
        if(employeeDao.findEmployee(req.getEmp_id(),req.getName()).isEmpty()){
            return new SearchEmployeeRes(ResMessage.NOT_FOUND.getCode(),ResMessage.NOT_FOUND.getMessage());
        }
        //回傳查詢成功和結果
        return new SearchEmployeeRes(ResMessage.SUCCESS.getCode(),ResMessage.SUCCESS.getMessage(),//
        employeeDao.findEmployee(req.getEmp_id(),req.getName()));

    }

    @Override
    public BasicRes deleteEmployee(DeleteEmployeeReq req) {
        if(!CollectionUtils.isEmpty(req.getIdList())){
            try{
                employeeDao.deleteAllById(req.getIdList());
            }catch(Exception e){

            }
        }
        return new BasicRes(ResMessage.SUCCESS.getCode(),ResMessage.SUCCESS.getMessage());
    }
}
