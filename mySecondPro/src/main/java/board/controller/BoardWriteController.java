package board.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import board.dto.MyBoardDTO;
import board.service.MyBoardService;

@Controller
public class BoardWriteController {

	@Autowired
	MyBoardService service;

	@RequestMapping(value = "/board_write.do", method = RequestMethod.GET)
	public String showPage() {
		return "board/board_write";
	}

	@RequestMapping(value = "/board_write.do", method = RequestMethod.POST)
	public ModelAndView runWriteBoard(HttpServletRequest req, MyBoardDTO write_dto) {
		System.out.println(write_dto);
		service.board_write(write_dto);

		return new ModelAndView("redirect:board_list.do");
	}

}
