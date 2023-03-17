package 실습2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VisitorService {
	VisitorRepository reposit = new VisitorRepository();
	Scanner sc = new Scanner(System.in);
	String loginEmail = null;
	String loginPw = null;
	VisitorDTO loginVisitor = null;
	
	public void join() {
		System.out.println("이름 > ");
		String name = sc.next();
		System.out.println("ID > ");
		String id = sc.next();
		System.out.println("PW > ");
		String password = sc.next();
		System.out.println("나이 > ");
		int age = sc.nextInt();
		VisitorDTO user = new VisitorDTO(id, password, name, age);
		if (reposit.save(user)) {
			System.out.println("회원가입 성공");
		} else {
			System.out.println("회원가입 실패");
		}
	}

	public void login() {
		System.out.println("ID > ");
		String id = sc.next();
		System.out.println("PW > ");
		String pw = sc.next();
		reposit.login(id, pw){
			
		}
		
	}
	

	public void searchId() {
		System.out.println("================id 찾기================");
		System.out.println("이름을 입력 해주세요");
		String name = sc.next();
		System.out.println("나이를 입력 해주세요");
		int age = sc.nextInt();
		reposit.searchId(name, age);

	}

	public void searchPw() {
		while (true) {
			System.out.println("================pw 찾기================");
			System.out.println("이름을 입력 해주세요 > ");
			String name = sc.next();
			System.out.println("나이를 입력 해주세요 > ");
			int age = sc.nextInt();
			System.out.println("아이디를 입력해주세요 > ");
			String id = sc.next();
			if (reposit.searchPw(name, age, id)) {
				break;
			} else {
				System.out.println("다시입력해주세요");
			}
		}

	}

	public void findAll() {
		List<VisitorDTO> list = reposit.findAll();
		System.out.println("===================================================");
		for (VisitorDTO visitorDTO : list) {
			System.out.println("이름\t아이디\t비밀번호\t나이\t등록");
			System.out.println(visitorDTO.toString());
		}
	}

}
