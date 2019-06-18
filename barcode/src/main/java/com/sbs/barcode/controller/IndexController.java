package com.sbs.barcode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/login")
	public String goToLogin(){
		return "login";
	}
	
	@RequestMapping("/salepersonal")
	public String goToSalepersonal(){
		return "salepersonal";
	}
	
	@RequestMapping("/admincount")
	public String goToadminCount(){
		return "admin_count";
	}
	@RequestMapping("/admindifferent")
	public String goToadminDifferent(){
		return "admin_different";
	}
	
	@RequestMapping("/adminindex")
	public String goToadminIndex(){
		return "admin_index";
	}
	
	@RequestMapping("/adminmoney")
	public String goToadminMoney(){
		return "admin_money";
	}
	
	@RequestMapping("/adminshoupiao")
	public String goToadminShoupiao(){
		return "admin_shoupiao";
	}
	
	@RequestMapping("/admin")
	public String goToadmin(){
		return "admin";
	}
	
	@RequestMapping("/amountofdifferentkind")
	public String goToamountofdifferentkind(){
		return "amountofdifferentkind";
	}
	
	@RequestMapping("/index")
	public String goToIndex(){
		return "index";
	}
	
	@RequestMapping("/money")
	public String goTomoney(){
		return "money";
	}
	
}
