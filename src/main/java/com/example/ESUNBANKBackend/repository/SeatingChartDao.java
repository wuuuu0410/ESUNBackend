package com.example.ESUNBANKBackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.ESUNBANKBackend.entity.SeatingChart;

public interface SeatingChartDao extends JpaRepository<SeatingChart,Long>{

    public boolean existsByFloorNoAndSeatNo(int floor_no , int seat_no);

    @Query("SELECT r FROM SeatingChart r WHERE "
    + "(:floorSeatSeq IS null OR r.floorSeatSeq = :floorSeatSeq) AND"
    + "(:floorNo IS null OR r.floorNo = :floorNo) AND"
    + "(:seatNo IS null OR r.seatNo  = :seatNo )")
    public List<SeatingChart> findSeatingChart(
        @Param("floorSeatSeq") Long floor_seat_seq,
        @Param("floorNo") int floor_no,
        @Param("seatNo") int seat_no
        );
}
