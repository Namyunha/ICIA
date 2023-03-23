package 이은수;

import java.util.*;

public class UserMain {

	public static void main(String[] args) {
		UserService serv = new UserService();
		BoardMain board = new BoardMain();
		boolean loginOk = false;
		UserDTO bUser = null;
		while (true) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("\u001B[40m" + "\u001B[33m"
					+ "============================(●'◡'●)인천일보아카데미(ICIA)==========================="+"\u001B[0m");
			if (loginOk) {
				System.out.println("1.개인정보확인 2.개인정보수정 3.ICIA 커뮤니티 4.로그아웃 0.종료");
				System.out.print("menu > ");
			} else {
				System.out.println("1.회원가입 2.로그인 3.ICIA 커뮤니티 4.찾기 0.종료");
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
					bUser = serv.loginOk();
					if (bUser != null) {
						loginOk = true;
					}
				}
			} else if (menu == 3) {
				if (loginOk) {
					board.main(bUser);
				} else {
					board.main(null);
				}
			} else if (menu == 4) {
				if (loginOk) {
					bUser = null;
					loginOk = serv.logOut();
				} else {
					serv.search();
				}
			} else if (menu == 5) {
				if (loginOk) {
					loginOk = serv.logOut();
				} else {
					System.out.println("서비스가 지원 되지 않습니다");
				}

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
