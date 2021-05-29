package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@Autowired
	CardinfoService cardinfoService;
	
	@RequestMapping(value = "/hello")
	private String hello(Model model) {

		// 気象データの取得
		model.addAttribute("title", "Hello World!"); // Hello World!の表示
		List<Cardinfo> cardinforDataList = cardinfoService.findAllCardinfoData();
		String  rtn =  CommonMethod.keisan(cardinforDataList.get(0).getCardid());
		cardinforDataList.get(0).setCardid(rtn);
		model.addAttribute("cardinforDataList", cardinforDataList);
		return "hello";

	}

	@RequestMapping(value = "/hello2")
	private String hello2() {
		return "forward:/hello3";

	}
	
	   @RequestMapping(value = "/hello3")
	   public ModelAndView getTest2(ModelAndView mav){
	       mav.setViewName("hello2");
	       return mav;
	   }
	

}
