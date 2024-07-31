package com.example.ESUNBANKBackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ESUNBANKBackend.service.ifs.SeatingChartService;
import com.example.ESUNBANKBackend.vo.BasicRes;
import com.example.ESUNBANKBackend.vo.CreateOrUpdateSeatingChartReq;
import com.example.ESUNBANKBackend.vo.DeleteSeatingChartReq;
import com.example.ESUNBANKBackend.vo.SearchSeatingChartReq;
import com.example.ESUNBANKBackend.vo.SearchSeatingChartRes;

import jakarta.validation.Valid;

@CrossOrigin
@RestController
public class SeatingChartController {

    @Autowired
    private SeatingChartService seatingChartService;

    //座位新增和修改
    @PostMapping(value = "seatingChart/createOrUpdate")
    public BasicRes createOrUpdateSeatingChart(@Valid@RequestBody CreateOrUpdateSeatingChartReq req) {
        return seatingChartService.createOrUpdateSeatingChart(req);
    }

    //座位搜尋
    @PostMapping(value = "seatingChart/search")
    public SearchSeatingChartRes searchSeatingChart(@RequestBody
    SearchSeatingChartReq req){
    return seatingChartService.searchSeatingChart(req);
    }
    //座位刪除
    @PostMapping(value = "seatingChart/delete")
    public BasicRes deleteSeatingChart(@RequestBody DeleteSeatingChartReq req){
        return seatingChartService.deleteSeatingChart(req);
    }

}
