package com.example.ESUNBANKBackend.vo;

public class CreateOrUpdateSeatingChartReq {

    private Long floor_seat_seq;

    private int floor_no;

    private int seat_no;

    public CreateOrUpdateSeatingChartReq() {
    }

    public CreateOrUpdateSeatingChartReq(Long floor_seat_seq, int floor_no, int seat_no) {
        this.floor_seat_seq = floor_seat_seq;
        this.floor_no = floor_no;
        this.seat_no = seat_no;
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

}
