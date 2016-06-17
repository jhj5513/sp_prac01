package emp.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import emp.dto.MyEmpDTO;


@Repository("empmybatis")
public class MyEmpMybatisDAOImpl implements MyEmpDAO {

	
	@Autowired
	SqlSession sqlSession;
	@Override
	public int count() {
		return sqlSession.selectOne("kitri.myemp.count");
	}

	@Override
	public void insert(MyEmpDTO user) {
		sqlSession.insert("kitri.myemp.insert", user);

	}

	@Override
	public void update(MyEmpDTO userInfo) {
		sqlSession.update("kitri.myemp.update", userInfo);

	}

	@Override
	public void delete(String id) {
		sqlSession.delete("kitri.myemp.delete", id);

	}

	@Override
	public MyEmpDTO login(MyEmpDTO loginUser) {
		return sqlSession.selectOne("kitri.myemp.login", loginUser);
	}

	@Override
	public List<MyEmpDTO> getMemberList() {
		
		return sqlSession.selectList("kitri.myemp.list");
	}

	@Override
	public List<MyEmpDTO> findByAddr(String addr) {
		return sqlSession.selectList("kitri.myemp.search", "%"+addr+"%");
	}

	@Override
	public MyEmpDTO read(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
