package com.example.ESUNBANKBackend.vo;

public class SeatingChartDetail {

    private Long floor_seat_seq;

    private int floor_no;

    private int seat_no;

    private Long emp_id;

    private String name;

    private String email;

    public SeatingChartDetail() {
    }

    public SeatingChartDetail(Long floor_seat_seq, int floor_no, int seat_no, Long emp_id, String name, String email) {
        this.floor_seat_seq = floor_seat_seq;
        this.floor_no = floor_no;
        this.seat_no = seat_no;
        this.emp_id = emp_id;
        this.name = name;
        this.email = email;
    }

    public Long getFloor_seat_seq() {
        return floor_seat_seq;
    }

    public int getFloor_no() {
        return floor_no;
    }

    public int getSeat_no() {
        return seat_no;
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

    
}
