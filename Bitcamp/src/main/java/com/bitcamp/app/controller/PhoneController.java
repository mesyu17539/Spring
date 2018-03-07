package com.bitcamp.app.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bitcamp.app.command.Command;
import com.bitcamp.app.domain.MemberDTO;
import com.bitcamp.app.domain.MobileDTO;
import com.bitcamp.app.factory.ShiftFactory;
import com.bitcamp.app.service.MobileService;

@SessionAttributes("user")
@Controller
public class PhoneController {
	private static final Logger logger = LoggerFactory.getLogger(PhoneController.class);
	@Autowired MobileService mservice;
	@Autowired Command cmd;
	@Autowired ShiftFactory shift;
	@Autowired MobileDTO phone;
	@RequestMapping("/mobile/shop")
	public String shop(Model model) {
		List<MobileDTO> phones=mservice.phones();
		model.addAttribute("phones",phones);
		logger.info("PhoneController shop {}.", phones);
		return shift.create("sktelecom", "main");
	}
	@RequestMapping("/phone")
	public String phone(Model model) {
		logger.info("PhoneController openPhone {}.", "");
		return "public:sktelecom/main.tiles";
	}
	@RequestMapping("/openPhone/{telecom}/{modele}")
	public String openPhone(Model model,
			@PathVariable("telecom")String telecom,
			@PathVariable("modele")String modele) {
		logger.info("PhoneController openPhone {}.", telecom);
		logger.info("PhoneController openPhone {}.", modele);
		mservice.openPhone(cmd);
		return "public:user/mypage.tiles";
	}
}
