package com.sbs.barcode.controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sbs.barcode.service.impl.SellTicketsStatisticsService;

@Controller
public class SellTicketsStatisticsController {
		
	@Autowired
	SellTicketsStatisticsService sellTicketsStatisticsService;
	
	@RequestMapping("/sellTicketsStatistics")
	@ResponseBody
	public int[] sellTicketsStatistics(@RequestParam(value="year")Integer year) throws ParseException{
		return sellTicketsStatisticsService.statisticsByMonth(year);
	}
	
}
