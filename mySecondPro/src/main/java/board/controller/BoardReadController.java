package board.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import board.dto.MyBoardDTO;
import board.service.MyBoardService;


public class BoardReadController {

	@Controller
	public class ReadController {

		@Autowired
		MyBoardService service;
			
		@RequestMapping (value = "/board_read.do", method = RequestMethod.GET)
		public ModelAndView runRead(HttpServletRequest req, MyBoardDTO dto, String board_no){
			ModelAndView mav = new ModelAndView();
			mav.addObject("board_read", service.board_read(board_no));
			mav.setViewName("board/board_read");
			return mav;
		}
		@RequestMapping(value="/board_read.do", method=RequestMethod.POST)
		public ModelAndView runUdateRead(HttpServletRequest req, MyBoardDTO dto){
			ModelAndView mav = new ModelAndView();
			mav.addObject("board_read", dto);
			mav.setViewName("board/board_read");
			return mav;
		}
	}
}
