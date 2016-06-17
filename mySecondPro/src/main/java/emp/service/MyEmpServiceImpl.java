package emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import emp.dao.MyEmpDAO;
import emp.dto.MyEmpDTO;

@Service
public class MyEmpServiceImpl implements MyEmpService {
@Autowired
@Qualifier("empmybatis")
	MyEmpDAO dao;
	
	public MyEmpDAO getDao() {
		return dao;
	}

	public void setDao(MyEmpDAO dao) {
		this.dao = dao;
	}

	@Override
	public int count() {
		
		return dao.count();
	}

	@Override
	public void insert(MyEmpDTO user) { 
		dao.insert(user);

	}

	@Override
	public void update(MyEmpDTO userInfo) {
		//homework
		dao.update(userInfo);
	}

	@Override
	public void delete(String id) {
		dao.delete(id);
	}

	@Override
	public MyEmpDTO login(MyEmpDTO loginUser) {
		return dao.login(loginUser);
	}

	@Override
	public List<MyEmpDTO> getMemberList() {
		
		return dao.getMemberList();
	}

	@Override
	public List<MyEmpDTO> findByAddr(String addr) {
		
		return dao.findByAddr(addr);
	}

	@Override
	public MyEmpDTO read(String id) {
		
		return dao.read(id);
	}

	
	//Ʈ������� �׽�Ʈ�ϱ� ���� service�� insert!
	@Override
	public void txinsert(MyEmpDTO user) {
		dao.insert(user);
		//dao.insert(null);
		
	}


}
