package com.example.ESUNBANKBackend.vo;

public class SearchEmployeeReq {

    private Long emp_id;

    private String name;

    public SearchEmployeeReq() {
    }

    public SearchEmployeeReq(Long emp_id, String name) {
        this.emp_id = emp_id;
        this.name = name;
    }

    public Long getEmp_id() {
        return emp_id;
    }

    public String getName() {
        return name;
    }
}
