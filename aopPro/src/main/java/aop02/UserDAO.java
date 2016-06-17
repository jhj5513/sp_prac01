package aop02;

import java.util.ArrayList;
//business logic
public class UserDAO implements DAO {

	@Override
	public ArrayList<UserDTO> getUserList(UserDTO dto) {
		System.out.println("**************************");
		System.out.println("******getUserList 호출******");
		System.out.println("**************************");
		return null;
	}

	@Override
	public UserDTO getUser() {
		System.out.println("**************************");
		System.out.println("********getUser 호출********");
		System.out.println("**************************");
		return null;
	}

	@Override
	public void addUser(UserDTO dto) {
		System.out.println("**************************");
		System.out.println("********addUser 호출********");
		System.out.println("**************************");
	}

	@Override
	public void deleteUser(UserDTO dto) {
		System.out.println("**************************");
		System.out.println("******deleteUser 호출******");
		System.out.println("**************************");
		
	}

	@Override
	public ArrayList<UserDTO> selectAll() {
		System.out.println("**************************");
		System.out.println("******selectAll 호출*******");
		System.out.println("**************************");
		return null;
	}

}
