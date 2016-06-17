package emp.mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import emp.service.MyEmpService;

@Controller
public class CountMybatisController {

	@Autowired
	MyEmpService service;
	
	@RequestMapping("/emp/count.do")	//변경
	public String getCount(){
		int result = service.count();
		System.out.println("인원수 : " + result);
		return "index";
	}
}
