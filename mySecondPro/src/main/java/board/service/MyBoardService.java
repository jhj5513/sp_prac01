package board.service;

import java.util.List;

import board.dto.MyBoardDTO;

public interface MyBoardService {

	void write(MyBoardDTO write_dto);
	void modify(MyBoardDTO mod_dto);
	void delete(String board_no);
	MyBoardDTO read(String board_no);
	List<MyBoardDTO> search(String title);
	
}