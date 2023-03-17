package day11_11;

import java.util.*;

public class UserService {

	UserRepository repository = new UserRepository();
	Scanner sc = new Scanner(System.in);

	String loginEmail = null;
	String loginPassword = null;
	
	public void save() {
		System.out.println("이메일 > ");
		String email = sc.next();
		System.out.println("비밀번호 > ");
		String password = sc.next();
		System.out.println("나이 > ");
		int age = sc.nextInt();
		System.out.println("이름 > ");
		String name = sc.next();
		UserDTO userDTO = new UserDTO(email, password, name, age);
		if (repository.save(userDTO)) {
			System.out.println("회원가입 성공");
		} else {
			System.out.println("회원가입 실패");
		}
	}

	public boolean loginCheck() {
//		System.out.println("Email > ");
//		String email = sc.next();
//		System.out.println("PW > ");
//		String pw = sc.next();
//		List<UserDTO> list = repository.findAll();
//		for(UserDTO u : list) {
//			if(u.getEmail().equals(email) && u.getPassword().equals(pw)) {
//				System.out.println("로그인성공");
//			}else {
//				System.out.println("로그인실패");
//			}
//		}
		System.out.println("Email > ");
		String email = sc.next();
		System.out.println("PW > ");
		String pw = sc.next();
		if (repository.loginCheck(email, pw)) {
			System.out.println("로그인에 성공하셨습니다.");
			loginEmail = email;
			loginPassword = pw;
			return true;
		} else {
			System.out.println("로그인에 실패하셨습니다");
			return false;
		}
	}
	public void findAll() {
		List<UserDTO> list = repository.findAll();
		System.out.println("이메일\t비밀번호\t이름\t나이\t가입일\n");
		System.out.println("-------------------------------------------");
		for (UserDTO u : list) {
			System.out.println(u.toString());
		}
	}
// toString
	public void findById() {
		UserDTO userDTO = repository.findById(loginEmail, loginPassword);
		if(userDTO == null) {
			System.out.println("로그인 오류");
		} else {
			System.out.println(userDTO);
		}
	}

}










