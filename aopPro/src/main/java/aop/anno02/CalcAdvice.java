package aop.anno02;

import java.util.Random;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

//��� Ŭ������ ������(����)������ ��� = ����Ͻ����� ������ �κ�(ex. ����, �α�..)
@Service
@Aspect
public class CalcAdvice {

	public int num = 0;

	
	@Pointcut("execution(* aop.anno02.UserDAO.*())")
	public void myPointcut(){}
	
	@Before("myPointcut()")
	public void log1(){
		Random rand = new Random();
		System.out.println("**before**");
		int rnum = rand.nextInt();


		
		if(rnum < 50){
			num = 50;
		}else{
			num = 100;
		}
		System.out.println("��������� " + num+"�� �Ҵ�");
		
		
	}
	

	@After("myPointcut()")
	public void log2(){
		int num2 = 0;
		System.out.println("**after**");
		for (int i = 1; i <= num ; i++) {
			num2=i+num2;
		}
		System.out.println("1���� �������� �Ҵ�� �������� �� : " +num2);
	}
}
