package com.sbs.barcode.service;

import java.util.List;

import com.sbs.barcode.pojo.TicketType;

public interface TicketTypeService {
	//根据票种类的id查询票价格
	public int getPriceById(String id);
	
	//查询所有的票信息
	public List<TicketType> selectAll();
}
