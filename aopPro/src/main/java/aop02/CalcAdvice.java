package aop02;

import java.util.Random;

//��� Ŭ������ ������(����)������ ��� = ����Ͻ����� ������ �κ�(ex. ����, �α�..)
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
		System.out.println("��������� " + num+"�� �Ҵ�");
		
		
	}
	
	public void log2(){
		int num2 = 0;
		System.out.println("**after**");
		for (int i = 1; i <= num ; i++) {
			num2=i+num2;
		}
		System.out.println("1���� �������� �Ҵ�� �������� �� : " +num2);
	}
}
