package board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import board.dto.MyBoardDTO;


@Repository("myboarddao")
public class MyBoardDAOImpl implements MyBoardDAO {

	@Autowired
	SqlSession sqlSession;
	
	private MyBoardDAOImpl(){
	}

	@Override
	public void board_write(MyBoardDTO write_dto) {
		sqlSession.insert("kitri.board.board_write", write_dto);
	}

	@Override
	public void board_modify(MyBoardDTO mod_dto) {
		sqlSession.update("kitri.board.board_modify");
	}

	@Override
	public void board_delete(String board_no) {
		sqlSession.delete("kitri.board.board_delete");
	}

	@Override
	public MyBoardDTO board_read(String board_no) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("kitri.board.board_read", board_no);
	}

	@Override
	public List<MyBoardDTO> board_search(String title) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("kitri.board.board_search", title);
	}

	@Override
	public List<MyBoardDTO> BoardList() {
		
		return sqlSession.selectList("kitri.board.board_list");
	}
	


}
