package emp.controller;



import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import emp.service.MyEmpService;


@Controller
public class SearchListController {
	@Autowired
	MyEmpService service;
	


	@RequestMapping (value = "search.do", method = RequestMethod.GET)
	public String showPage(){
		return "search/form";
	}
	
	@RequestMapping (value="search.do", method = RequestMethod.POST)
	public ModelAndView runSearch(HttpServletRequest req, String search){
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("userlist",service.findByAddr(search));
		mav.setViewName("searchlist");
		return mav;
	}

}