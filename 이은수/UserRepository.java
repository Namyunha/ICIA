package 이은수;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
	List<UserDTO> uList = new ArrayList<>();

	public boolean save(UserDTO userDTO) {
		return uList.add(userDTO);
	}

	public List<UserDTO> list() {
		return uList;
	}

	public UserDTO returnUser(UserDTO userDTO) {
		for (UserDTO u : uList) {
			if (u.getId().equals(userDTO.getId()) && u.getPw().equals(userDTO.getPw())) {
				return u;
			}
		}
		return null;
	}

	public boolean duCheck(String id) {
		for (UserDTO u : uList) {
			if (u.getId().equals(id)) {
				System.out.println("중복된 id가 있습니다");
				return true;
			}
		}
		return false;
	}

	public UserDTO getUser(String loginId, String loginPw) {
		for (UserDTO u : uList) {
			if (loginId.equals(u.getId()) && loginPw.equals(u.getPw())) {
				return u;
			}
		}
		return null;
	}

	public boolean delete(UserDTO UserDTO) {
		for (UserDTO u : uList) {
			if (u.equals(UserDTO)) {
				System.out.println(u);
				uList.remove(u);
				System.out.println("회원탈퇴에 성공하셨습니다.");
				return true;
			} else {
				System.out.println("이용자를 찾을 수 없습니다.");
			}
		}
		return false;
	}

	public UserDTO search(String name, String id, int phone, String pNum) {
		for (UserDTO u : uList) {
			if (name.equals(u.getName()) || id.equals(u.getId()) || phone == u.getPhone() || pNum.equals(u.getpNum())) {
				return u;
			}
		}
		return null;
	}

	public UserDTO searchId(String name, int phone) {
		if (search(name, "", -3, "") != null) {
			if (search(name, "", phone, "") != null) {
				return search(name, "", phone, "");
			}
		}
		return null;
	}

	public boolean searchP(UserDTO searchUser) {
		for (UserDTO u : uList) {
			if (searchUser.getpNum().equals(u.getpNum())) {
				return true;
			}
		}
		return false;
	}
}
