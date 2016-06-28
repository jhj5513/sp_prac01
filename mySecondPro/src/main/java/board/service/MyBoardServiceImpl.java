package board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import board.dao.MyBoardDAO;
import board.dto.MyBoardDTO;

@Service
public class MyBoardServiceImpl implements MyBoardService {
	@Autowired
	@Qualifier("myboarddao")
	MyBoardDAO dao;

	@Override
	public void board_write(MyBoardDTO write_dto) {
		dao.board_write(write_dto);
		
	}

	@Override
	public void board_modify(MyBoardDTO mod_dto) {
		dao.board_modify(mod_dto);
	}

	@Override
	public void board_delete(String board_no) {
		dao.board_delete(board_no);
		
	}

	@Override
	public MyBoardDTO board_read(String board_no) {
		// TODO Auto-generated method stub
		return dao.board_read(board_no);
	}

	@Override
	public List<MyBoardDTO> board_search(String title) {
		// TODO Auto-generated method stub
		return dao.board_search(title);
	}

	@Override
	public List<MyBoardDTO> BoardList() {
		// TODO Auto-generated method stub
		return dao.BoardList();
	}

	@Override
	public void board_count(String board_no) {
		dao.board_count(board_no);
		
	}
	
	
}
