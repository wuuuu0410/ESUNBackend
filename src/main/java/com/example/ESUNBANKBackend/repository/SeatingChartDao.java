package com.example.ESUNBANKBackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.ESUNBANKBackend.entity.SeatingChart;

public interface SeatingChartDao extends JpaRepository<SeatingChart,Long>{

    //檢查是否有重複座位
    public boolean existsByFloorNoAndSeatNo(int floor_no , int seat_no);

    //搜尋座位
    @Query("SELECT r FROM SeatingChart r WHERE "
    + "(:floorSeatSeq IS NULL OR r.floorSeatSeq = :floorSeatSeq) AND"
    + "(:floorNo IS NULL OR r.floorNo = :floorNo) AND"
    + "(:seatNo IS NULL OR r.seatNo  = :seatNo )")
    public List<SeatingChart> findSeatingChart(
        @Param("floorSeatSeq") Long floor_seat_seq,
        @Param("floorNo") Integer floor_no,
        @Param("seatNo") Integer seat_no
        );

}
