package board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import emp.service.MyEmpService;

@Controller
public class BoardlistController {

	@Autowired
	MyEmpService service;

	@RequestMapping(value = "/board_list.do", method = RequestMethod.GET)
	public String showPage() {
		return "board/board_list";
	}

}
