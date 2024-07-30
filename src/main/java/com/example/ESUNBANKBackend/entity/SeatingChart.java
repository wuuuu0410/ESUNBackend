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
    @Column(name="floor_seat_seq")
    private Long floorSeatSeq;

    @Column(name="floor_no")
    private int floorNo;

    @Column(name="seat_no")
    private int seatNo;

    public SeatingChart() {
    }

    public SeatingChart(Long floor_seat_seq, int floor_no, int seat_no) {
        this.floorSeatSeq = floor_seat_seq;
        this.floorNo = floor_no;
        this.seatNo = seat_no;
    }

    public SeatingChart(int floor_no, int seat_no) {
        this.floorNo = floor_no;
        this.seatNo = seat_no;
    }

    public Long getFloor_seat_seq() {
        return floorSeatSeq;
    }

    public void setFloor_seat_seq(Long floor_seat_seq) {
        this.floorSeatSeq = floor_seat_seq;
    }

    public int getFloor_no() {
        return floorNo;
    }

    public void setFloor_no(int floor_no) {
        this.floorNo = floor_no;
    }

    public int getSeat_no() {
        return seatNo;
    }

    public void setSeat_no(int seat_no) {
        this.seatNo = seat_no;
    }
}
