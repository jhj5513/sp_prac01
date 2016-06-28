package board.dao;

import java.util.List;

import board.dto.MyBoardDTO;

public interface MyBoardDAO {

	List<MyBoardDTO> BoardList();
	void board_write(MyBoardDTO write_dto);
	void board_modify(MyBoardDTO mod_dto);
	void board_delete(String board_no);
	MyBoardDTO board_read(String board_no);
	List<MyBoardDTO> board_search(String title);
	void board_count(String board_no);
}
