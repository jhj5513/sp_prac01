package product.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import product.service.ProductService;


@Controller
	public class ProductController {
	@Autowired
	ProductService service;
	
	
	@RequestMapping(value="prdlist.do", method = RequestMethod.GET)
	public ModelAndView prdList(HttpServletRequest req, String category){
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("prdlist", service.productlist(category));

		
		if(category == null){
			//"layout/indexLayout.jsp"
			mav.addObject("topprdlist", service.searchTopProduct());
			mav.setViewName("indexLayout");
		}else{
			///layout/mainLayout.jsp
			mav.setViewName("mainLayout");
		}

		
		return mav;

	}
}
