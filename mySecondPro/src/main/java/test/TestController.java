package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	@RequestMapping("/emp/test.do")
	public ModelAndView test(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Annotation data from Spring");
		mav.setViewName("test");
		return mav;
		
	}
}
