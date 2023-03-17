package day8;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		User[] list = new User[100];
		int cnt = 0;
		Util util = new Util();
		
		while (true) {
			System.out.println("==============회원가입==============");
			System.out.println("1.회원가입 2.로그인 3.리스트 4.검색 0.종료");
			System.out.println("메뉴선택 > ");
			int menu = util.numberCheck();
			
			if (menu == 1) {
				System.out.println("이름입력 > ");
				String name = sc.next();
				String id = util.lengthCheck("아이디", 7);
				System.out.println("비밀번호입력 > ");
				String pw = sc.next();
				User user = new User(name, id, pw);
				list[cnt] = user;
				System.out.println("회원가입 완료");
				cnt++;
			} else if (menu == 2) {

				System.out.print("아이디입력 > ");
				String id = util.lengthCheck("id", 7);
				System.out.print("비밀번호 입력 > ");
				String pw = sc.next();
				for (int i = 0; i < cnt; i++) {
					if (list[i].getId().equals(id) && list[i].getPw().equals(pw)) {
						System.out.println("로그인 성공");
						break;
					} else if (i == cnt - 1) {
						System.out.println("로그인 실패");
					}

				}
			} else if (menu == 3) {
				System.out.println("이름\t아이디\t비밀번호");
				System.out.println("------------------------------------");
				for (int i = 0; i < cnt; i++) {
					list[i].print();
				}

			} else if (menu == 4) {
				System.out.println("검색할 아이디 > ");
				String searchId = sc.next();
				System.out.println("이름\t아이디\t비밀번호");
				System.out.println("----------------------------");
				for (int i = 0; i < cnt; i++) {
					if (list[i].getId().equals(searchId)) {
						list[i].print();
						break;
					} else if (i == cnt - 1) {
						System.out.println("검색 실패");
					}

				}
				for(User u : list) {
					
				}
			} else if (menu == 0) {
				break;
			} else {
				System.out.println("다시입력");
			}
		}
		System.out.println("프로그램 종료");
	}

}
