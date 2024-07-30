package com.example.ESUNBANKBackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ESUNBANKBackend.service.ifs.SeatingChartService;
import com.example.ESUNBANKBackend.vo.BasicRes;
import com.example.ESUNBANKBackend.vo.CreateOrUpdateSeatingChartReq;
import com.example.ESUNBANKBackend.vo.SearchSeatingChartReq;
import com.example.ESUNBANKBackend.vo.SearchSeatingChartRes;

@CrossOrigin
@RestController
public class SeatingChartController {

    @Autowired
    private SeatingChartService seatingChartService;

    @PostMapping(value = "seatingChart/createOrUpdate")
    public BasicRes createOrUpdateSeatingChart(@RequestBody CreateOrUpdateSeatingChartReq req) {
        return seatingChartService.createOrUpdateSeatingChart(req);
    }

    @PostMapping(value = "seatingChart/search")
    public SearchSeatingChartRes searchSeatingChart(@RequestBody
    SearchSeatingChartReq req){
    return seatingChartService.searchSeatingChart(req);
    }

}
