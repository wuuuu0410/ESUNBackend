package com.example.ESUNBANKBackend.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ESUNBANKBackend.constants.ResMessage;
import com.example.ESUNBANKBackend.entity.Employee;
import com.example.ESUNBANKBackend.entity.SeatingChart;
import com.example.ESUNBANKBackend.repository.EmployeeDao;
import com.example.ESUNBANKBackend.repository.SeatingChartDao;
import com.example.ESUNBANKBackend.service.ifs.SeatingChartService;
import com.example.ESUNBANKBackend.vo.BasicRes;
import com.example.ESUNBANKBackend.vo.CreateOrUpdateSeatingChartReq;
import com.example.ESUNBANKBackend.vo.SearchSeatingChartReq;
import com.example.ESUNBANKBackend.vo.SearchSeatingChartRes;
import com.example.ESUNBANKBackend.vo.SeatingChartDetail;

@Service
public class SeatingChartServiceImpl implements SeatingChartService{

    @Autowired
    private SeatingChartDao seatingChartDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public BasicRes createOrUpdateSeatingChart(CreateOrUpdateSeatingChartReq req) {
        boolean boo = seatingChartDao.existsByFloorNoAndSeatNo(req.getFloor_no(),req.getSeat_no());
        if(boo){
            return new BasicRes(ResMessage.SEAT_EXISTS.getCode(),ResMessage.SEAT_EXISTS.getMessage());
        }
        if(req.getFloor_seat_seq() == null){
            seatingChartDao.save(new SeatingChart(req.getFloor_no(),req.getSeat_no()));
            return new BasicRes(ResMessage.SUCCESS.getCode(),ResMessage.SUCCESS.getMessage());
        }
        seatingChartDao.save(new SeatingChart(req.getFloor_seat_seq(),req.getFloor_no(),req.getSeat_no()));
        return new BasicRes(ResMessage.SUCCESS.getCode(),ResMessage.SUCCESS.getMessage());
    }

    @Override
    public SearchSeatingChartRes searchSeatingChart(SearchSeatingChartReq req) {
        List<SeatingChart> seatingChartList = seatingChartDao.findSeatingChart(req.getFloor_seat_seq(),req.getFloor_no(),req.getSeat_no());
        List<SeatingChartDetail> SeatingChartDetailList = new ArrayList<>();
        for(SeatingChart item : seatingChartList){
            Optional<Employee> op = employeeDao.findByFloorSeatSeq(item.getFloor_seat_seq());
            if(op.isEmpty()){
                SeatingChartDetail seatingChartDetail = new SeatingChartDetail(item.getFloor_seat_seq(),item.getFloor_no(),item.getSeat_no(),null,null,null);
                SeatingChartDetailList.add(seatingChartDetail);
                continue;
            }
            Employee employee = op.get();
            SeatingChartDetail seatingChartDetail = new SeatingChartDetail(item.getFloor_seat_seq(),item.getFloor_no(),item.getSeat_no(),employee.getEmp_id(),employee.getName(),employee.getEmail());
                SeatingChartDetailList.add(seatingChartDetail);
        }
        if(SeatingChartDetailList.isEmpty()){
            return new SearchSeatingChartRes(ResMessage.NOT_FOUND.getCode(),ResMessage.NOT_FOUND.getMessage());
        }
        return new SearchSeatingChartRes(ResMessage.SUCCESS.getCode(),ResMessage.SUCCESS.getMessage(),SeatingChartDetailList);
    }

    
}
