package com.example.ESUNBANKBackend.vo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

public class CreateOrUpdateEmployeeReq {

    private Long emp_id;

    @NotBlank
    private String name;

    @NotEmpty(message = "Email empty")
    @Email(message = "Email Incorrect format")
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
