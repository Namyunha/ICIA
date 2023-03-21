package 이은수;

import java.util.*;

public class UserMain {
	public static void main(String[] args) {
		UserService serv = new UserService();
		boolean loginOk = false;
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("==================제목미정=================");
			if (loginOk) {
				System.out.println("1.개인정보확인 2.개인정보수정 3.게시판 9.로그아웃 0.종료");
				System.out.print("menu > ");
			} else {
				System.out.println("1.회원가입 2.로그인 3.찾기 0.종료");
				System.out.print("menu > ");
			}
			int menu = sc.nextInt();
			if (menu == 1) {
				if (loginOk) {
					serv.loginCheck();
				} else {
					serv.save();
				}
			} else if (menu == 2) {
				if (loginOk) {
					serv.update();
					loginOk = serv.logOut();
				} else {
					loginOk = serv.loginOk();
				}
			} else if (menu == 3) {
				if (loginOk) {
				} else {
					serv.search();
				}
			} else if (menu == 9) {
				loginOk = serv.logOut();
			} else if (menu == 0) {
				break;
			} else if (menu == 999) {
				serv.findAll();
			} else {

				System.out.println("올바른 번호를 입력해주세요.");
			}
		}

	}
}
