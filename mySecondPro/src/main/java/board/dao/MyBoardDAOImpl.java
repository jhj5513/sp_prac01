package board.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import board.dto.MyBoardDTO;


@Repository("boarddao")
public class MyBoardDAOImpl implements MyBoardDAO {

	@Autowired
	private JdbcTemplate template;
	
	private MyBoardDAOImpl(){
	}
	
	
	public JdbcTemplate getTemplate() {
		return template;
	}


	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}


	@Override
	public void write(MyBoardDTO write_dto) {
		String sql = "insert into tb_table values(?, ?, ?, ?, ?, ?, ?, ?)";
		int result = template.update(sql, write_dto.getBoard_no(), 
				write_dto.getMem_id(),write_dto.getTitle(), 
				write_dto.getText(), write_dto.getCount(),
				write_dto.getReg_dtm(), write_dto.getDel_flg());
	}

	@Override
	public void modify(MyBoardDTO mod_dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String board_no) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MyBoardDTO read(String board_no) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MyBoardDTO> search(String title) {
		// TODO Auto-generated method stub
		return null;
	}


}
