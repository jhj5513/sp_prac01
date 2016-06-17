package etc.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.ModelAndView;

import emp.dto.MyEmpDTO;

@Controller
public class I18NTestController {
	@Autowired
	LocaleResolver resolver;
	
/*	public ModelAndView ShowPage(String lang, HttpServletRequest req, HttpServletResponse res)
	throws Exception{
		//언어 정보를 이용해서 Locale객체를 생성 :: 지역정보 setting
		Locale locale = new Locale(lang);
		resolver.setLocale(req, res, locale);
		resolver.resolveLocale(req);
		return new ModelAndView("i18ntest");
	}*/
	@RequestMapping(value="/i18ntest.do" , method = RequestMethod.GET)
	public ModelAndView ShowPage(String lang, HttpServletRequest req, HttpServletResponse res)
			throws Exception{
				//언어 정보를 이용해서 Locale객체를 생성 :: 지역정보 setting
				Locale locale = new Locale(lang);
				//locale객체를 localeresolver에 세팅
				resolver.setLocale(req, res, locale);
				//locale정보를 세팅할 수 있는 
				resolver.resolveLocale(req);
				return new ModelAndView("i18ntest", "command", new MyEmpDTO());
			}
	
	
}
