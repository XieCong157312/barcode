package com.sbs.barcode.service.impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbs.barcode.mapper.TicketMainMapper;
import com.sbs.barcode.pojo.TicketMain;
import com.sbs.barcode.pojo.TicketMainExample;
import com.sbs.barcode.pojo.TicketMainExample.Criteria;
import com.sbs.barcode.service.TicketMainService;
import com.sbs.barcode.utils.BarcodeCreateUtils;
@Service
public class TicketMainServiceImpl implements TicketMainService {
	@Autowired
	private TicketMainMapper ticketMainMapper;
	
	//标准票
	public TicketMain createStandardTicket(String name, String operator_id,int price) {
		Date date = new Date();
		BarcodeCreateUtils barcodeUtils = new BarcodeCreateUtils();
		String barcode = barcodeUtils.setBacode(0,date);
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			date = dateFormat.parse(dateFormat.format(date));
		} catch (ParseException e) {
		}
		TicketMain ticketMain = new TicketMain();
		ticketMain.setBarcode(barcode);
		ticketMain.setBuyTime(date);
		ticketMain.setOperatorId(operator_id);
		ticketMain.setUser(name);
		ticketMain.setTicketType("001");
		ticketMain.setTicketPrice(price);
		ticketMain.setFlag("1");
		ticketMainMapper.insert(ticketMain);
		return ticketMain;
	}
	//儿童票
	public TicketMain createChildrenTicket(String name, String operator_id,int price) {
		Date date = new Date();
		BarcodeCreateUtils barcodeUtils = new BarcodeCreateUtils();
		String barcode = barcodeUtils.setBacode(0,date);
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			date = dateFormat.parse(dateFormat.format(date));
		} catch (ParseException e) {
		}
		TicketMain ticketMain = new TicketMain();
		ticketMain.setBarcode(barcode);
		ticketMain.setBuyTime(date);
		ticketMain.setOperatorId(operator_id);
		ticketMain.setUser(name);
		ticketMain.setTicketType("002");
		ticketMain.setTicketPrice(price);
		ticketMain.setFlag("1");
		ticketMainMapper.insert(ticketMain);
		return ticketMain;
	}
	//学生票
	public TicketMain createStudentTicket(String name, String operator_id, String school,int price) {
		Date date = new Date();
		BarcodeCreateUtils barcodeUtils = new BarcodeCreateUtils();
		String barcode = barcodeUtils.setBacode(0,date);
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			date = dateFormat.parse(dateFormat.format(date));
		} catch (ParseException e) {
		}
		TicketMain ticketMain = new TicketMain();
		ticketMain.setBarcode(barcode);
		ticketMain.setBuyTime(date);
		ticketMain.setOperatorId(operator_id);
		ticketMain.setUser(name);
		ticketMain.setTicketType("003");
		ticketMain.setTicketPrice(price);
		ticketMain.setSchoolName(school);
		ticketMain.setFlag("1");
		ticketMainMapper.insert(ticketMain);
		return ticketMain;
	}
	//优惠票
	public TicketMain createDiscountTicket(String name, String operator_id, String cause, String type,int price) {
		Date date = new Date();
		BarcodeCreateUtils barcodeUtils = new BarcodeCreateUtils();
		String barcode = barcodeUtils.setBacode(0,date);
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			date = dateFormat.parse(dateFormat.format(date));
		} catch (ParseException e) {
		}
		TicketMain ticketMain = new TicketMain();
		ticketMain.setBarcode(barcode);
		ticketMain.setBuyTime(date);
		ticketMain.setOperatorId(operator_id);
		ticketMain.setUser(name);
		ticketMain.setDiscountReason(cause);
		ticketMain.setDiscountType(type);
		ticketMain.setTicketType("005");
		ticketMain.setTicketPrice(price);
		ticketMain.setFlag("1");
		ticketMainMapper.insert(ticketMain);
		return ticketMain;
		

	}
	//车辆进出票
	public TicketMain createCarTicket(String name, String operator_id, String carCode,int price) {
		Date date = new Date();
		BarcodeCreateUtils barcodeUtils = new BarcodeCreateUtils();
		String barcode = barcodeUtils.setBacode(0,date);
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			date = dateFormat.parse(dateFormat.format(date));
		} catch (ParseException e) {
		}
		TicketMain ticketMain = new TicketMain();
		ticketMain.setBarcode(barcode);
		ticketMain.setBuyTime(date);
		ticketMain.setOperatorId(operator_id);
		ticketMain.setUser(name);
		ticketMain.setTicketType("007");
		ticketMain.setPlateNumber(carCode);
		ticketMain.setTicketPrice(price);
		ticketMain.setFlag("1");
		ticketMainMapper.insert(ticketMain);
		return ticketMain;
	}
	
	//旅游团体票
	public List<TicketMain> createTourismTicket(String touristName,String guideName ,int touristAmount,String operator_id,int price){
		List<TicketMain> list = new ArrayList<TicketMain>();
		Date date = new Date();
		BarcodeCreateUtils barcodeUtils = new BarcodeCreateUtils();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			date = dateFormat.parse(dateFormat.format(date));
		} catch (ParseException e) {
		}
		for(int i=0;i<touristAmount;i++){
			String barcode = barcodeUtils.setBacode(i,date);
			TicketMain ticketMain = new TicketMain();
			ticketMain.setBarcode(barcode);
			ticketMain.setBuyTime(date);
			ticketMain.setOperatorId(operator_id);
			ticketMain.setTicketType("004");
			ticketMain.setTicketPrice(price);
			ticketMain.setGuideName(guideName);
			ticketMain.setTouristAmount(touristAmount);
			ticketMain.setTouristName(touristName);
			ticketMain.setFlag("1");
			ticketMainMapper.insert(ticketMain);
			list.add(ticketMain);
		}
		return list;
	}
	public List<TicketMain> createComplimentaryTicket(String complimentaryAuthorizer, String complimentaryPerson, int count,
			String operator_id, int price) {
		List<TicketMain> list = new ArrayList<TicketMain>();
		Date date = new Date();
		BarcodeCreateUtils barcodeUtils = new BarcodeCreateUtils();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			date = dateFormat.parse(dateFormat.format(date));
		} catch (ParseException e) {
		}
		for(int i=0;i<count;i++){
			String barcode = barcodeUtils.setBacode(i,date);
			TicketMain ticketMain = new TicketMain();
			ticketMain.setBarcode(barcode);
			ticketMain.setBuyTime(date);
			ticketMain.setOperatorId(operator_id);
			ticketMain.setTicketType("006");
			ticketMain.setTicketPrice(price);
			ticketMain.setComplimentaryPerson(complimentaryPerson);
			ticketMain.setComplimentaryAuthorizer(complimentaryAuthorizer);
			ticketMain.setComplimentaryDate(date);
			ticketMain.setFlag("1");
			ticketMainMapper.insert(ticketMain);
			list.add(ticketMain);
		}
		return list;
	}
	@Override
	public List<TicketMain> selectCashIncome(String operatorId, String startDate, String endDate) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		try {
			Date time1 = simpleDateFormat.parse("");
			Date time2 = simpleDateFormat.parse("");
			TicketMainExample example = new TicketMainExample();
			Criteria criteria = example.createCriteria();
			criteria.andBuyTimeBetween(time1, time2);
			List<TicketMain> list = ticketMainMapper.selectByExample(example);
			List<TicketMain> result = new ArrayList<TicketMain>();
			for(TicketMain ticketMain : list){
				if(ticketMain.getOperatorId().equals(operatorId))
					result.add(ticketMain);
			}
			return result;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
