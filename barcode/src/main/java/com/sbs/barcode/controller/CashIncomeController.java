package com.sbs.barcode.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sbs.barcode.pojo.TicketAdministrator;
import com.sbs.barcode.pojo.TicketMain;
import com.sbs.barcode.pojo.TicketType;
import com.sbs.barcode.service.TicketAdministratorService;
import com.sbs.barcode.service.TicketMainService;
import com.sbs.barcode.service.TicketTypeService;

@Controller
public class CashIncomeController {
	
	@Autowired
	private TicketAdministratorService ticketAdministratorService;
	@Autowired
	private TicketMainService ticketMainService;
	//获取售票员信息
	@RequestMapping("/sdfs")
	@ResponseBody
	public List<String> getName(){
		List<String> list = new ArrayList<String>();
		list = ticketAdministratorService.getNameByRole("售票员");
		return list;
	}
	
	//现金收入查询
	@RequestMapping("/asdasd")
	@ResponseBody
	public Map<String, Integer> cashSelect(@RequestParam("userName") String userName, @RequestParam("startDate") String startDate,@RequestParam("endDate") String endDate){
		TicketAdministrator t = ticketAdministratorService.selectByName(userName);
		String operatorId = t.getUserCode();
		int count001 = 0,count002 = 0,count003 = 0,count004 = 0,count005 = 0,count006 = 0,count007 = 0;
		//查询某个销售员的符合时间的全部记录
		List<TicketMain> ticketMainList = ticketMainService.selectCashIncome(operatorId, startDate, endDate);
		for(TicketMain x :ticketMainList){
			String OperatorId= x.getOperatorId();
			if(OperatorId.equals("001")){
				count001 = count001 + x.getTicketPrice();
			}else if(OperatorId.equals("002")){
				count002 = count002 + x.getTicketPrice();
			}else if(OperatorId.equals("003")){
				count003 = count003 + x.getTicketPrice();
			}else if(OperatorId.equals("004")){
				count004= count004 + x.getTicketPrice();
			}else if(OperatorId.equals("005")){
				count005 = count005 + x.getTicketPrice();
			}else if(OperatorId.equals("006")){
				count006 = count006 + x.getTicketPrice();
			}else{
				count007 = count007 + x.getTicketPrice();
			}
		}
		
		return null;
	}
}
