package com.example.ESUNBANKBackend.service.ifs;

import com.example.ESUNBANKBackend.vo.BasicRes;
import com.example.ESUNBANKBackend.vo.CreateOrUpdateSeatingChartReq;
import com.example.ESUNBANKBackend.vo.DeleteSeatingChartReq;
import com.example.ESUNBANKBackend.vo.SearchSeatingChartReq;
import com.example.ESUNBANKBackend.vo.SearchSeatingChartRes;

public interface SeatingChartService {

    public BasicRes createOrUpdateSeatingChart(CreateOrUpdateSeatingChartReq req);
    
    public SearchSeatingChartRes searchSeatingChart(SearchSeatingChartReq req);

    public BasicRes deleteSeatingChart(DeleteSeatingChartReq req);
}
