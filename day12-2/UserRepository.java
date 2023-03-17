package day12;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
	// static 변수로 객체 생성
	private static UserRepository repository = new UserRepository();

	// 외부에서 new로 생성할 수 없게 생성자를 private으로 선언
	private UserRepository() {
	}

	// 필드로 선언된 객체를 리턴하는 메소드
	public static UserRepository getInstance() {
		return repository;
	}

	List<UserDTO> list = new ArrayList<>();

	public boolean save(UserDTO userDTO) {
		return list.add(userDTO);
	}

	public void findAll() {
		for (UserDTO u : list) {
			System.out.println(u.toString());
		}
	}

	public List<UserDTO> findAll2() {
		return list;
	}

	public boolean login(String id, String pw) {
		for (UserDTO u : list) {
			if (id.equals(u.getEmail()) && pw.equals(u.getPassword())) {
				return true;
			}
		}
		return false;
	}

	public UserDTO findByID(String loginEmail, String loginPw) {
		for (UserDTO u : list) {
			if (loginEmail.equals(u.getEmail()) && loginPw.equals(u.getPassword())) {
				return u;
			}
		}
		return null;
	}

	public boolean edit(String email, String domain) {
		for (UserDTO u : list) {
			if (email.equals(u.getEmail())) {
				u.setDomain(domain);
				return true;
			}
		}
		return false;
	}

	public void update(String email, String pw, int age, String name) {
		for (UserDTO u : list) {
			if (!(email.equals(u.getEmail())) || !(pw.equals(u.getPassword()))) {
				u.setEmail(email);
				u.setPassword(pw);
				u.setAge(age);
				u.setName(name);
				System.out.println("사용자의 id는 " + u.getEmail() + "로 바뀌고 pw는 " + u.getPassword() + " 바뀌었고"+"이름은 "+name+"으로 바뀌었습니다");
			}
		}
	}

	public void remove(UserDTO userDTO) {
		list.remove(userDTO);
	}

}
