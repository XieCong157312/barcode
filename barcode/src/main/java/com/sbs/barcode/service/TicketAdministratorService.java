package com.sbs.barcode.service;

import java.util.List;

import com.sbs.barcode.pojo.TicketAdministrator;


public interface TicketAdministratorService {
	
	//根据身份查询所有姓名
	public List<String> getNameByRole(String role);
	
	//根据用户名查询operatorId
	public TicketAdministrator selectByName(String name);
	
	//根据Account查询
	public TicketAdministrator selectByAccount(String account);
}
