package aop02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest02 {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("config/aopbean02.xml");
		DAO seconddao = (DAO)factory.getBean("seconddao");
		seconddao.getUser();
		seconddao.getUserList(new UserDTO());
		seconddao.addUser(new UserDTO());
		seconddao.selectAll();
	}
}
