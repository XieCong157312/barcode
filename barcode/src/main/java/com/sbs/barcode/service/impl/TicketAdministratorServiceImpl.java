package com.sbs.barcode.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbs.barcode.mapper.TicketAdministratorMapper;
import com.sbs.barcode.pojo.TicketAdministrator;
import com.sbs.barcode.pojo.TicketAdministratorExample;
import com.sbs.barcode.pojo.TicketAdministratorExample.Criteria;
import com.sbs.barcode.pojo.TicketMain;
import com.sbs.barcode.service.TicketAdministratorService;

@Service
public class TicketAdministratorServiceImpl implements TicketAdministratorService {
	
	@Autowired
	private TicketAdministratorMapper ticketAdministratorMapper;
	
	@Override
	public List<String> getNameByRole(String role) {
		List<String> result = new ArrayList<String>();
		TicketAdministratorExample example = new TicketAdministratorExample();
		Criteria criteria =example.createCriteria();
		criteria.andRoleEqualTo(role);
		List<TicketAdministrator> list = ticketAdministratorMapper.selectByExample(example);
		for(TicketAdministrator r :list){
			result.add(r.getUserName());
		}
		return result;
	}

	@Override
	public TicketAdministrator selectByName(String name) {
		TicketAdministratorExample example = new TicketAdministratorExample();
		Criteria criteria =example.createCriteria();
		criteria.andUserNameEqualTo(name);
		List<TicketAdministrator> list = ticketAdministratorMapper.selectByExample(example);
		return list.get(0);
	}

	@Override
	public TicketAdministrator selectByAccount(String account) {
		TicketAdministratorExample example = new TicketAdministratorExample();
		Criteria criteria =example.createCriteria();
		criteria.andAccountEqualTo(account);
		List<TicketAdministrator> list = ticketAdministratorMapper.selectByExample(example);
		return list.get(0);
	}

}
