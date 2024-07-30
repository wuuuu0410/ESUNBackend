package com.example.ESUNBANKBackend.vo;

public class CreateOrUpdateEmployeeReq {

    private Long emp_id;

    private String name;

    private String email;

    private Long floor_seat_seq;

    public CreateOrUpdateEmployeeReq() {
    }

    public CreateOrUpdateEmployeeReq(Long emp_id, String name, String email, Long floor_seat_seq) {
        this.emp_id = emp_id;
        this.name = name;
        this.email = email;
        this.floor_seat_seq = floor_seat_seq;
    }

    public Long getEmp_id() {
        return emp_id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Long getFloor_seat_seq() {
        return floor_seat_seq;
    }

    
}
