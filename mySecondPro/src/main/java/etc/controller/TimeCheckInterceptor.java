package etc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;



public class TimeCheckInterceptor extends HandlerInterceptorAdapter{
private long start;
private long end;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
			
		System.out.println("==============preHandler==============");
		System.out.println("접속한 ip : "+request.getRemoteHost());
		start= System.nanoTime();
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	end = System.nanoTime();
	System.out.println("==============postHandler==============");
	String handlerClass = handler.getClass().getName();
	
	System.out.println(handlerClass + " 실행에 걸린 시간 : "+ (end - start));
	
	}
}
