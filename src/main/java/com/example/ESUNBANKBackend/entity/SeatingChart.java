package com.example.ESUNBANKBackend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "seatingchart")
public class SeatingChart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long floor_seat_seq;

    private int floor_no;

    private int seat_no;

    private Boolean status;

    public SeatingChart() {
    }

    public SeatingChart(Long floor_seat_seq, int floor_no, int seat_no, Boolean status) {
        this.floor_seat_seq = floor_seat_seq;
        this.floor_no = floor_no;
        this.seat_no = seat_no;
        this.status = status;
    }

    public Long getFloor_seat_seq() {
        return floor_seat_seq;
    }

    public void setFloor_seat_seq(Long floor_seat_seq) {
        this.floor_seat_seq = floor_seat_seq;
    }

    public int getFloor_no() {
        return floor_no;
    }

    public void setFloor_no(int floor_no) {
        this.floor_no = floor_no;
    }

    public int getSeat_no() {
        return seat_no;
    }

    public void setSeat_no(int seat_no) {
        this.seat_no = seat_no;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }


}
