package aop01;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

//모든 클래스에 적용할(조건)공통의 모듈 = 비즈니스로직 외적인 부분(ex. 보안, 로깅..)

@Service

public class LogAdvice {


	public void log() {
		System.out.println("===============로그기록===============");
	}
}
