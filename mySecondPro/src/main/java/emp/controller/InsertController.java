package emp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import emp.dto.MyEmpDTO;
import emp.service.MyEmpService;

@Controller
public class InsertController {
	@Autowired
	MyEmpService service;
	
	//get방식으로 요청될 때 실행될 메소드 >  insert page를 response
	@RequestMapping(value="/insert.do", method = RequestMethod.GET)
	public String showPage(){
		return "input/form";
	}
	
	//post방식으로 요청될 떄 실행할 메소드 > 실제 db에 insert를 하기 위한 기능을 수행
	@RequestMapping(value="/insert.do", method = RequestMethod.POST)
	public ModelAndView runInsert(HttpServletRequest req, MyEmpDTO user){
		System.out.println("user");
		service.insert(user);
		
		return new ModelAndView("redirect:/index.do");

	}
}
