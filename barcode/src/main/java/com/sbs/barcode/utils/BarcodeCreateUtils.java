package com.sbs.barcode.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BarcodeCreateUtils {
	
	public String setBacode(int i,Date date){
		String result = "";
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss"); 
		String strDate=dateFormat.format(date);
		if(i<10){
			result=strDate+"00"+i;
		}else if(10<=i && i<100){
			result=strDate+"0"+i;
		}else if(i>=100){
			result=strDate+i;
		}
		return result;
	}
	
}
