package etc.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import emp.dto.MyEmpDTO;

public class LoginCheckInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
/*				
		MyEmpDTO user = (MyEmpDTO) request.getSession().getAttribute("loginUser");
		if (user == null){
			response.sendRedirect("login.do");		
			System.out.println("로그아웃 상태");
			return false;
		}
	return true;*/
		
		if(request.getSession(false).getAttribute("loginUser")==null){
			System.out.println("로그인 하세요");
			response.sendRedirect("/mySecondPro/login.do");
			return false;
		}
		return true;
	}
}
