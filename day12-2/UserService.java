package day12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {

	private static UserService service = new UserService();

	private UserService() {
	}

	public static UserService getInstance() {
		return service;
	}

	Scanner sc = new Scanner(System.in);
	UserRepository re = UserRepository.getInstance();
	String loginEmail = null;
	String loginPw = null;

	public void join() {
		UserDTO userDTO = new UserDTO();
		System.out.print("이름 > ");
		userDTO.setName(sc.next());
		System.out.print("ID > ");
		userDTO.setEmail(sc.next());
		System.out.print("PW > ");
		userDTO.setPassword(sc.next());
		System.out.print("나이 > ");
		userDTO.setAge(sc.nextInt());
		System.out.print("도메인입력 >");
		userDTO.setDomain(sc.next());
		if (re.save(userDTO)) {
			System.out.println("가입에 성공하셨습니다");
		} else {
			System.out.println("가입에 실패하셨습니다");
		}
	}

	public boolean login() {
		System.out.print("id > ");
		String id = sc.next();
		System.out.print("pw > ");
		String pw = sc.next();
		if (re.login(id, pw)) {
			System.out.println("로그인에 성공하셨습니다.");
			loginEmail = id;
			loginPw = pw;
			return true;
		} else {
			System.out.println("로그인에 실패하셨습니다.");
			return false;
		}

	}

	public boolean logout() {
		loginEmail = null;
		loginPw = null;
		return false;
	}

	public void findAll() {
		re.findAll();
	}

	public void findAll2() {
		List<UserDTO> list = re.findAll2();
		for (UserDTO u : list) {
			System.out.println(u.toString());
		}
	}

	public void findById() {
		if (loginEmail == null || loginPw == null) {
			System.out.println("로그인 오류");
			return;
		}
		UserDTO userDTO = re.findByID(loginEmail, loginPw);
		if (userDTO == null) {
			System.out.println("세션오류");
		} else {
			System.out.println("아이디\t비밀번호\t이름\t나이\t가입일");
			System.out.println("--------------------------------------------------------");
			System.out.println(userDTO.toString());
		}
	}
//	public void findById2() {
//	re.readInfo(loginEmail,loginPw);
//	}

	public void domainChange() {
		System.out.print("수정할 id > ");
		String email = sc.next();
		System.out.print("변경할 domain > ");
		String domain = sc.next();
		if (re.edit(email, domain)) {
		} else {
			System.out.println("입력하신 email이 잘못 됐습니다.");
		}

	}

	public void update() {
		System.out.print("수정할 ID > ");
		String updateId = sc.next();
		System.out.print("수정할 PW > ");
		String updatePw = sc.next();
		System.out.print("수정할 나이 > ");
		int updateAge = sc.nextInt();
		System.out.println("수정할 이름 > ");
		String upadateName = sc.next();
		re.update(updateId, updatePw, updateAge, upadateName);
	}
	
	public void remove() {
		System.out.println("삭제할 ID > ");
		String removeId = sc.next();
		System.out.println("삭제할 PW > ");
		String removePw =  sc.next();
		UserDTO userDTO = re.findByID(removeId, removePw);
		re.remove(userDTO);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
