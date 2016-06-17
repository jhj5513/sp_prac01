package aop02;

import java.util.ArrayList;

public interface DAO {
	public ArrayList<UserDTO> getUserList(UserDTO dto);	
	public UserDTO getUser();
	public void addUser(UserDTO dto);
	public void deleteUser(UserDTO dto);
	public ArrayList<UserDTO> selectAll();
}
