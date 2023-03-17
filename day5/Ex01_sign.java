package day5;

import java.util.Scanner;

public class Ex01_sign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String id = "test";
		String pw = "1234";
		String name = "테스트";
		String loginId = "";
		String loginPw = "";
		boolean loginSuccess = false;
		while (true) {
			System.out.println("로그인폼");
			if (loginSuccess) {
				System.out.println("1.비밀번호 수정하기 / 2.로그아웃(" + name + "님) / 3.프로필");
			} else {
				System.out.println("1.회원가입하기 2.로그인하기 0.종료");
			}
			System.out.println("메뉴 > ");
			int menu = sc.nextInt();
			if (menu == 1) {
				if (loginSuccess) {
					System.out.println("비밀번호를 입력해주세요");
					pw = sc.next();
				} else {
					System.out.println("이름을입력해주세요");
					name = sc.next();
					System.out.println("아이디를입력해주세요");
					id = sc.next();
					System.out.println("비밀번호를 입력해주세요");
					pw = sc.next();
				}
			} else if (menu == 2) {
				if (loginSuccess) {
					loginSuccess = false;
					continue;
				} else {
					System.out.print("아이디입력 > ");
					loginId = sc.next();
					System.out.print("비밀번호 입력 > ");
					loginPw = sc.next();
					if (id.equals(loginId) && pw.equals(loginPw)) {
						System.out.println("로그인에 성공하셨습니다.");
						loginSuccess = true;
					} else {
						System.out.println("로그인에 실패하셨습니다.");
					}
				}

			} else if (menu == 3) {
				System.out.println("이름: " + name + "\n" + "ID :" + id + "\n" + "PW: " + pw);
				while (true) {
					System.out.println("1.로그아웃 2.비밀번호수정하기");
					System.out.println("메뉴선택 > ");
					menu = sc.nextInt();
					if (menu == 1) {
						loginSuccess = false;
						break;
					} else if (menu == 2) {
						System.out.println("비밀번호를 입력해주세요");
						pw = sc.next();
						break;
					} else {
						System.out.println("1~2중에 골라주세요");
					}
				}

			}

			else if (menu == 0) {
				System.out.println("프로그램이 종료 되었습니다.");
				break;
			} else {
				System.out.println("1,2,0중에 골라주세요");
			}

		}


	}

}
