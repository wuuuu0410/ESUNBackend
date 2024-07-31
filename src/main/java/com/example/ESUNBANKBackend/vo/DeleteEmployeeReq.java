package com.example.ESUNBANKBackend.vo;

import java.util.List;

public class DeleteEmployeeReq {
    
    private List<Long> idList;

    public DeleteEmployeeReq() {
    }

    public DeleteEmployeeReq(List<Long> idList) {
        this.idList = idList;
    }

    public List<Long> getIdList() {
        return idList;
    }

    
}
