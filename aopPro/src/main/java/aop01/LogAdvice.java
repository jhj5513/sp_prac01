package aop01;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

//��� Ŭ������ ������(����)������ ��� = ����Ͻ����� ������ �κ�(ex. ����, �α�..)

@Service

public class LogAdvice {


	public void log() {
		System.out.println("===============�αױ��===============");
	}
}
