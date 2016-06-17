package aop02;

import java.util.Random;

//모든 클래스에 적용할(조건)공통의 모듈 = 비즈니스로직 외적인 부분(ex. 보안, 로깅..)
public class CalcAdvice {

	public int num = 0;

	
	
	public void log1(){
		Random rand = new Random();
		System.out.println("**before**");
		int rnum = rand.nextInt();


		
		if(rnum < 50){
			num = 50;
		}else{
			num = 100;
		}
		System.out.println("멤버변수에 " + num+"을 할당");
		
		
	}
	
	public void log2(){
		int num2 = 0;
		System.out.println("**after**");
		for (int i = 1; i <= num ; i++) {
			num2=i+num2;
		}
		System.out.println("1부터 멤버편수에 할당된 값까지의 합 : " +num2);
	}
}
