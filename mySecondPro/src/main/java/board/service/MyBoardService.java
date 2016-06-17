package board.service;

import java.util.List;

import board.dto.MyBoardDTO;

public interface MyBoardService {

	void board_write(MyBoardDTO write_dto);
	void board_modify(MyBoardDTO mod_dto);
	void board_delete(String board_no);
	MyBoardDTO board_read(String board_no);
	List<MyBoardDTO> board_search(String title);
		
	
}
