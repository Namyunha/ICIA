package day11_11;

import java.util.*;

public class UserRepository {
	List<UserDTO> list = new ArrayList<>();

	public boolean save(UserDTO userDTO) {
		return list.add(userDTO);
	}

	public List<UserDTO> findAll() {
		return list;
	}

	public boolean loginCheck(String email, String password) {
		for (UserDTO u : list) {
			if (email.equals(u.getEmail()) && password.equals(u.getPassword())) {
				return true;
			} 
		}
		return false;
		
	}
	
	public UserDTO findById(String email, String pw) {
		for(UserDTO u : list) {
			if(email.equals(u.getEmail())&&pw.equals(u.getPassword())) {
				return u;
			}
		}
		return null;
	}
	

}
