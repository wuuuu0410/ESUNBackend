package com.example.ESUNBANKBackend.vo;

import java.util.List;

public class DeleteSeatingChartReq {

    private List<Long> idList;

    public DeleteSeatingChartReq() {
    }

    public DeleteSeatingChartReq(List<Long> idList) {
        this.idList = idList;
    }

    public List<Long> getIdList() {
        return idList;
    }
    
}
