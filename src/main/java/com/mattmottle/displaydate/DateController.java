package com.mattmottle.displaydate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class DateController {
	
	@RequestMapping("/")
	public String dashboard() {
		return "dashboard.jsp";
	}
	
	@RequestMapping("/date") 
	public String date(Model model) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, MMM d yyyy");
		String dateNow = simpleDateFormat.format(new Date());
		model.addAttribute("dateNow", dateNow);
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
		String time = simpleDateFormat.format(new Date());
		model.addAttribute("time", time);
		return "time.jsp";
	}
}
