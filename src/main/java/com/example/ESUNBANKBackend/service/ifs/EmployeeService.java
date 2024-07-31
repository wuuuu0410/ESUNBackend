package com.example.ESUNBANKBackend.service.ifs;

import com.example.ESUNBANKBackend.vo.BasicRes;
import com.example.ESUNBANKBackend.vo.CreateOrUpdateEmployeeReq;
import com.example.ESUNBANKBackend.vo.DeleteEmployeeReq;
import com.example.ESUNBANKBackend.vo.SearchEmployeeReq;
import com.example.ESUNBANKBackend.vo.SearchEmployeeRes;

public interface EmployeeService {

    public BasicRes createOrUpdateEmployee (CreateOrUpdateEmployeeReq req);

    public SearchEmployeeRes searchEmployee(SearchEmployeeReq req);

    public BasicRes deleteEmployee(DeleteEmployeeReq req);
}
