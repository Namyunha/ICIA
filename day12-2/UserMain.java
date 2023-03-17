package day12;

import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserService serv = UserService.getInstance();
		Util util = new Util();
		boolean loginOk = false;
		UserDTO userDTO = new UserDTO();
		while (true) {
			if (loginOk) {
				System.out.println("1.정보읽기 2.로그아웃 3.회원수정 4.회원탈퇴 0.종료");
			} else {
				System.out.println("1.회원가입 2.로그인 3.리스트 4.도메인변경 0.종료");
			}

			System.out.println("선택 > ");
			int menu = util.numberCheck();
			if (menu == 1) {
				if (loginOk) {
					serv.findById();
				} else {
					serv.join();
				}
			} else if (menu == 2) {
				if (loginOk) {
					loginOk = serv.logout();
				} else {
					loginOk = serv.login();
				}
			} else if (menu == 3) {
				if (loginOk) {
					serv.update();
				} else {
					System.out.println("이름\tID\tPW\t나이\t가입일");
//					serv.findAll();
					serv.findAll2();
				}
			} else if (menu == 4) {
				if (loginOk) {
					serv.remove();
				} else {
					serv.domainChange();
				}
			} else if (menu == 0) {
				break;
			} else {
				System.out.println("다시입력");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}
}
