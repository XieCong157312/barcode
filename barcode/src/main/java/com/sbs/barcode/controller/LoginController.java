package com.sbs.barcode.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sbs.barcode.pojo.TicketAdministrator;
import com.sbs.barcode.service.impl.TicketAdministratorService;

@Controller
public class LoginController {

	@Autowired
	TicketAdministratorService ticketAdministratorService;
	@Autowired
	private com.sbs.barcode.service.TicketAdministratorService tickService;
	
	@RequestMapping("/submitLoginForm")
	public String ticketAdministrator(TicketAdministrator ticketAdministrator,HttpServletRequest request) {
		if (ticketAdministrator.getAccount() == null || ticketAdministrator.getPassword() == null) {
			return "redirect:/login";
		}
		
		boolean loginType = ticketAdministratorService.login(ticketAdministrator.getAccount(),ticketAdministrator.getPassword(), request);
		if (loginType) {
			String account = ticketAdministrator.getAccount();
			TicketAdministrator i =tickService.selectByAccount(account);
			if(i.getRole().equals("管理员")){
				return "admin";
			}else if(i.getRole().equals("统计员")){
				return "index";
			}else{
				return "salepersonal";
			}
		}else {
			return "redirect:/login";
		}
	}
	
}
