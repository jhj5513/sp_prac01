package emp.mybatis.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import emp.dto.MyEmpDTO;
import emp.service.MyEmpService;

@Controller
public class ReadMybatisController {

	@Autowired
	MyEmpService service;
		
	@RequestMapping (value = "/mybatisread.do", method = RequestMethod.GET)
	public ModelAndView runRead(HttpServletRequest req, MyEmpDTO user, String id){
		ModelAndView mav = new ModelAndView();
		mav.addObject("user", service.read(id));
		mav.setViewName("emp/detail");
		return mav;

	}
	@RequestMapping(value="/mybatisread.do", method=RequestMethod.POST)
	public ModelAndView runUdateRead(HttpServletRequest req, MyEmpDTO user){
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("user", user);
		mav.setViewName("emp/update");
		return mav;
	}
}
