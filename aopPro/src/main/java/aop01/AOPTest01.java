package aop01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest01 {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("config/aopbean01.xml");
		DAO dao = (DAO)factory.getBean("dao");
		dao.getUser();
		dao.getUserList(new UserDTO());
		dao.addUser(new UserDTO());
	}
}
