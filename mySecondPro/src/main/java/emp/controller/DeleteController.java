package emp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import emp.service.MyEmpService;

@Controller
public class DeleteController {
	@Autowired
	MyEmpService service;


	@RequestMapping(value="/delete.do", method = RequestMethod.GET)
	public ModelAndView delete(HttpServletRequest req, String id){
		service.delete(id);
		System.out.println(id);
		return new ModelAndView("redirect:/list.do");
	}

}