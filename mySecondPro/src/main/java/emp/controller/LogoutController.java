package emp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import emp.service.MyEmpService;

@Controller
public class LogoutController {

	@Autowired
	MyEmpService service;

@RequestMapping(value = "/logout.do", method = RequestMethod.GET)
	public String runLogout(HttpServletRequest req) {
	HttpSession ses = req.getSession(false);
	if(ses!= null){
		ses.invalidate();
		
	}
	return "index";
	}
}
