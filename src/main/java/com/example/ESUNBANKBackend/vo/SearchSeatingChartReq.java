package com.example.ESUNBANKBackend.vo;

public class SearchSeatingChartReq {

    private Long floor_seat_seq;

    private Integer floor_no;

    private Integer seat_no;

    public SearchSeatingChartReq() {
    }

    public SearchSeatingChartReq(Long floor_seat_seq, Integer floor_no, Integer seat_no) {
        this.floor_seat_seq = floor_seat_seq;
        this.floor_no = floor_no;
        this.seat_no = seat_no;
    }

    public Long getFloor_seat_seq() {
        return floor_seat_seq;
    }

    public Integer getFloor_no() {
        return floor_no;
    }

    public Integer getSeat_no() {
        return seat_no;
    }

    
}
