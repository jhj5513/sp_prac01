package emp.mybatis.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import emp.dto.MyEmpDTO;
import emp.service.MyEmpService;

@Controller
public class LoginMybatisController {

	@Autowired
	MyEmpService service;

	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public String showPage() {
		return "login/form";
	}

	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public String runLogin(HttpServletRequest req, MyEmpDTO user) {
		System.out.println(user);
		String url = "";
		
		MyEmpDTO loginUser = service.login(user);
		if (loginUser != null) {
			req.getSession().setAttribute("loginUser", loginUser);
	
			url = "index";
		} else {
			url = "login/form";
		}

		return url;
	}

}
