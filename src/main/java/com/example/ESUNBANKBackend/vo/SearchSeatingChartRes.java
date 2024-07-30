package com.example.ESUNBANKBackend.vo;

import java.util.List;

public class SearchSeatingChartRes extends BasicRes{

    List<SeatingChartDetail> seatingChartList;

    public SearchSeatingChartRes() {
    }

    public SearchSeatingChartRes(int statusCode, String message, List<SeatingChartDetail> seatingChartList) {
        super(statusCode, message);
        this.seatingChartList = seatingChartList;
    }

    public SearchSeatingChartRes(int statusCode, String message) {
        super(statusCode, message);
    }

    public SearchSeatingChartRes(List<SeatingChartDetail> seatingChartList) {
        this.seatingChartList = seatingChartList;
    }

    public List<SeatingChartDetail> getSeatingChartList() {
        return seatingChartList;
    }

    
}
