package com.sbs.barcode.service.impl;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbs.barcode.mapper.TicketMainMapper;
import com.sbs.barcode.pojo.TicketMain;
import com.sbs.barcode.pojo.TicketMainExample;
import com.sbs.barcode.pojo.TicketMainExample.Criteria;

@Service
public class SellTicketsStatisticsService {
	
	@Autowired
	TicketMainMapper ticketMainMapper;
	
	public int[] statisticsByMonth(Integer year) throws ParseException {

		Date startTime = new Date();
		Date endTime = new Date();
		
		// 每月票数
		int January = 0;
		int February = 0;
		int March = 0;
		int April = 0;
		int May = 0; 
		int June = 0; 
		int July = 0; 
		int August = 0; 
		int September = 0; 
		int October = 0; 
		int November = 0; 
		int December = 0;
		
		// 获取选取开始和结束的年份
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		if (year == 2018) {
			startTime = (Date) format.parse("2018-01-01 00:00:00");
			endTime = (Date) format.parse("2018-12-31 23:59:59");
		}else if (year == 2017){
			startTime = (Date) format.parse("2017-01-01 00:00:00");
			endTime = (Date) format.parse("2017-12-31 23:59:59");
		}else if (year == 2016){
			startTime = (Date) format.parse("2016-01-01 00:00:00");
			endTime = (Date) format.parse("2016-12-31 23:59:59");
		}else if (year == 2015){
			startTime = (Date) format.parse("2015-01-01 00:00:00");
			endTime = (Date) format.parse("2015-12-31 23:59:59");
		}else {
			return null;
		}
		
				
		// example
		TicketMainExample example = new TicketMainExample();
		Criteria criteria = example.createCriteria();	
		criteria.andBuyTimeBetween(startTime, endTime);
		
		// 获取example查询的list		
		List<TicketMain> list = ticketMainMapper.selectByExample(example);
		for( int i = 0 ; i < list.size() ; i++) {//内部不锁定，效率最高，但在多线程要考虑并发操作的问题。
			int month = list.get(i).getBuyTime().getMonth() + 1;
			switch (month) {
		    case 1:January += 1;break;
		    case 2:February += 1;break;
		    case 3:March += 1;break;
		    case 4:April += 1;break;
		    case 5:May += 1;break;
		    case 6:June += 1;break;
		    case 7:July += 1;break;
		    case 8:August += 1;break;
		    case 9:September += 1;break;
		    case 10:October += 1;break;
		    case 11:November += 1;break;
		    case 12:December += 1;break;
			}
		}
		
		int[] monthStatistic = {January,February,March,April,May,June,July,August,September,October,November,December};
		//int ticketAdministratorNumber = list.size();
		return monthStatistic;

	}
	
}
