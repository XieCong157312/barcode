package com.sbs.barcode.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbs.barcode.mapper.TicketAdministratorMapper;
import com.sbs.barcode.pojo.TicketAdministrator;
import com.sbs.barcode.pojo.TicketAdministratorExample;
import com.sbs.barcode.pojo.TicketAdministratorExample.Criteria;

@Service
public class TicketAdministratorService {

	@Autowired
	TicketAdministratorMapper ticketAdministratorMapper;
	
	public boolean login(String account,String password,HttpServletRequest request) {
			
		// example
		TicketAdministratorExample example = new TicketAdministratorExample();
		Criteria criteria = example.createCriteria();	
		criteria.andAccountEqualTo(account);
	
		// 获取example查询的list
		List<TicketAdministrator> list = ticketAdministratorMapper.selectByExample(example);
		
		if (list == null || list.size() == 0) {
			return false;
		}
		
		// 判断密码
		TicketAdministrator ticketAdministrator = list.get(0);
		if (ticketAdministrator.getPassword().equals(password)) {
			request.getSession().setAttribute("user_code", ticketAdministrator.getUserCode());
			request.getSession().setAttribute("user_name", ticketAdministrator.getUserName());
			//System.out.println(request.getSession().getAttribute("user_code"));
			//System.out.println(request.getSession().getAttribute("account"));
			return true;
			
		}else {
			return false;
		}

	}
	
}
