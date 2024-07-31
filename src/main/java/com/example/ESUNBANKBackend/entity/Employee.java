package com.example.ESUNBANKBackend.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "employee")
public class Employee {
    
    //員工編號pk自動生成
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long emp_id;

    private String name;

    private String email;

    @Column(name="floor_seat_seq")
    private Long floorSeatSeq;

    public Employee() {
    }

    public Employee(String name, String email, Long floor_seat_seq) {
        this.name = name;
        this.email = email;
        this.floorSeatSeq = floor_seat_seq;
    }

    public Employee(Long emp_id, String name, String email, Long floor_seat_seq) {
        this.emp_id = emp_id;
        this.name = name;
        this.email = email;
        this.floorSeatSeq = floor_seat_seq;
    }

    public Long getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(Long emp_id) {
        this.emp_id = emp_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getFloor_seat_seq() {
        return floorSeatSeq;
    }

    public void setFloor_seat_seq(Long floor_seat_seq) {
        this.floorSeatSeq = floor_seat_seq;
    }

    
}
