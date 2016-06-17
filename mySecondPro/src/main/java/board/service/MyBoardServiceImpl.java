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
	@Qualifier("boarddao")
	MyBoardDAO dao;

	public MyBoardDAO getDao() {
		return dao;
	}

	public void setDao(MyBoardDAO dao) {
		this.dao = dao;
	}

	@Override
	public void write(MyBoardDTO write_dto) {
		dao.write(write_dto);

	}

	@Override
	public void modify(MyBoardDTO mod_dto) {
		dao.modify(mod_dto);
	}

	@Override
	public void delete(String board_no) {
		dao.delete(board_no);
	}

	@Override
	public MyBoardDTO read(String board_no) {
		return dao.read(board_no);
	}

	@Override
	public List<MyBoardDTO> search(String title) {
		return dao.search(title);
	}

}
