package com.mystudy.mock;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/")
public class MockController {
	@Autowired
	private MockService mockService;
	
	@GetMapping("/index")
	public String index(Model model){
		model.addAttribute("test", "testValue");
		return "index";
	}
	@GetMapping("/insertMock")
	public String insertMock(@RequestParam(name = "insertCount") Integer param){
		mockService.insertMock(param);
		
		return "redirect:/index";
	}
	
	@GetMapping("/mock")
	@ResponseBody
	public  List<Map<String, Object>> getMock(){
		return mockService.getMock();
	}
	
}
