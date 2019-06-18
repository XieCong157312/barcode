package com.sbs.barcode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sbs.barcode.pojo.TicketMain;
import com.sbs.barcode.service.TicketMainService;
import com.sbs.barcode.service.TicketTypeService;

@Controller
public class AddTicketController {
	@Autowired
	private TicketMainService ticketMainService;
	
	@Autowired
	private TicketTypeService ticketTypeService;
	
	//创建一张标准票
	@RequestMapping(value="/add/standardTicket",method = RequestMethod.POST)
	@ResponseBody
	public TicketMain createStandardTicket(@RequestParam("userName") String userName , @RequestParam("operator_id") String operator_id ){
		int price =ticketTypeService.getPriceById("001");
		TicketMain result = ticketMainService.createStandardTicket(userName, operator_id, price);
		return result;
	}
	
	//创建一张儿童票
	@RequestMapping(value="/add/childTicket",method = RequestMethod.POST)
	@ResponseBody
	public TicketMain createChildTicket(@RequestParam("userName") String userName , @RequestParam("operator_id") String operator_id ){
		int price =ticketTypeService.getPriceById("002");
		TicketMain result = ticketMainService.createChildrenTicket(userName, operator_id, price);
		return result;
	}
	
	//创建一张学生票
	@RequestMapping(value="/add/studentTicket",method = RequestMethod.POST)
	@ResponseBody
	public TicketMain createStudentTicket(@RequestParam("userName") String userName , @RequestParam("operator_id") String operator_id ,@RequestParam("school") String school ){
		int price =ticketTypeService.getPriceById("003");
		TicketMain result = ticketMainService.createStudentTicket(userName, operator_id, school, price);
		return result;
	}
	
	//创建一张优惠票
	@RequestMapping(value="/add/discountTicket",method = RequestMethod.POST)
	@ResponseBody
	public TicketMain createDiscountTicket(@RequestParam("userName") String userName , @RequestParam("operator_id") String operator_id ,@RequestParam("cause") String cause,@RequestParam("type") String type){
		int price =ticketTypeService.getPriceById("005");
		TicketMain result = ticketMainService.createDiscountTicket(userName, operator_id, cause, type, price);
		return result;
	}
	
	//创建一张车辆进出票
	@RequestMapping(value="/add/carTicket",method = RequestMethod.POST)
	@ResponseBody
	public TicketMain createCarTicket(@RequestParam("userName") String userName , @RequestParam("operator_id") String operator_id,@RequestParam("carCode") String carCode ){
		int price =ticketTypeService.getPriceById("007");
		TicketMain result = ticketMainService.createCarTicket(userName, operator_id, carCode, price);
		return result;
	}
	//创建多张旅游团体票
	@RequestMapping(value="/add/touristTicket",method = RequestMethod.POST)
	@ResponseBody
	public List<TicketMain> createtouristTicket(@RequestParam("touristName") String touristName , 
										@RequestParam("guideName") String guideName ,
										@RequestParam("operator_id") String operator_id,
										@RequestParam("count") String count ){
		int touristAmount =Integer.parseInt(count);
		int price =ticketTypeService.getPriceById("004");
		List<TicketMain> result = ticketMainService.createTourismTicket(touristName, guideName, touristAmount, operator_id, price);
		return result;
	}
	
	//创建多张赠票
	@RequestMapping(value="/add/complimentaryTicket",method = RequestMethod.POST)
	@ResponseBody
	public List<TicketMain> createComplimentaryTicket(
			@RequestParam("complimentaryAuthorizer") String complimentaryAuthorizer,
			@RequestParam("complimentaryPerson") String complimentaryPerson,
			@RequestParam("operator_id") String operator_id, @RequestParam("count") String count) {
		int touristAmount = Integer.parseInt(count);
		int price = ticketTypeService.getPriceById("006");
		List<TicketMain> result = ticketMainService.createComplimentaryTicket(complimentaryAuthorizer, complimentaryPerson, touristAmount, operator_id, price);
		return result;
	}
}
