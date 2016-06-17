package aop.anno01;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

//��� Ŭ������ ������(����)������ ��� = ����Ͻ����� ������ �κ�(ex. ����, �α�..)

@Service
//aop�� ����Ǿ��ִ� Ŭ������� ���� ����( aop ����� �����ؼ� ����Ͻ� ������ �߰��� ������ɸ���̶�� ���� ���� )
@Aspect
public class LogAdvice {
	//������ ���� ������ �� �޼ҵ带 �����ؼ� ���� : �޼ҵ���� ����Ʈ �� ���� �ȴ�.
	@Pointcut("execution(* aop.anno01.UserDAO.get*(..))")
	public void myLogPointcut() {
	}
	@After("myLogPointcut()")
	public void log() {
		System.out.println("===============�αױ��===============");
	}
}
