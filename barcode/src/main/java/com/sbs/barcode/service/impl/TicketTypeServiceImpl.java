package com.sbs.barcode.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbs.barcode.mapper.TicketTypeMapper;
import com.sbs.barcode.pojo.TicketType;
import com.sbs.barcode.pojo.TicketTypeExample;
import com.sbs.barcode.pojo.TicketTypeExample.Criteria;
import com.sbs.barcode.service.TicketTypeService;
@Service
public class TicketTypeServiceImpl implements TicketTypeService {
	@Autowired
	private TicketTypeMapper ticketTypeMapper;
	
	public int getPriceById(String id) {
		int price =0;
		TicketTypeExample example = new TicketTypeExample();
		Criteria criteria =example.createCriteria();
		criteria.andTicketTypeIdEqualTo(id);
		List<TicketType> list =ticketTypeMapper.selectByExample(example);
		for(TicketType ticketType :list){
			price=ticketType.getTicketPrice();
		}
		return price;
	}

	@Override
	public List<TicketType> selectAll() {
		TicketTypeExample example = new TicketTypeExample();
		Criteria criteria =example.createCriteria();
		criteria.andTicketPriceIsNotNull();
		List<TicketType> list =ticketTypeMapper.selectByExample(example);
		return list;
	}

}
