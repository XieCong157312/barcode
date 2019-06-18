package com.sbs.barcode.service;

import java.util.List;
import java.util.Map;

import com.sbs.barcode.pojo.TicketMain;

public interface TicketMainService {
	
	//存储一个标准票的记录
	public TicketMain createStandardTicket(String name ,String operator_id,int price);
	//存储一个儿童票的记录
	public TicketMain createChildrenTicket(String name ,String operator_id,int price);
	//存储一个学生票的记录
	public TicketMain createStudentTicket(String name ,String operator_id,String school,int price);
	//存储一个优惠票的记录
	public TicketMain createDiscountTicket(String name ,String operator_id,String cause,String type ,int price);
	//存储一个车辆进出票的记录
	public TicketMain createCarTicket(String name ,String operator_id,String carCode,int price);
	//存储一个旅游团一次旅游的记录
	public List<TicketMain> createTourismTicket(String touristName,String guideName ,int touristAmount,String operator_id,int price);
	//存储一次赠票的记录
	public List<TicketMain> createComplimentaryTicket(String complimentaryAuthorizer,String complimentaryPerson ,int count,String operator_id,int price);
	
	//查询某个售票员的在指定时间内的销售额
	public List<TicketMain> selectCashIncome(String operatorId, String startDate, String endDate);
}
