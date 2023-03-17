package day13;

import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ClientService serv = ClientService.getInstance();
		boolean loginOk = false;

		while (true) {
			System.out.println("=============인터넷뱅킹=============");
			if (loginOk) {
				System.out.println("1.입출금조회 2.입금 3.출금 4.계좌이체 5.비밀번호수정 6.회원탈퇴 7.로그아웃 0.종료");
			} else {
				System.out.println("1.회원가입 2.로그인 3.리스트 4.ID찾기 5.PW찾기 6.미정 7.미정 0.종료");
			}
			System.out.print("메뉴 > ");
			int menu = sc.nextInt();
			if (menu == 1) {
				if (loginOk) {
					serv.findById();
				} else {
					serv.save();
				}
			} else if (menu == 2) {
				if (loginOk) {
					serv.deposit();
				} else {
					loginOk = serv.loginCheck();
				}
			} else if (menu == 3) {
				if (loginOk) {
					serv.withdraw();
				} else {
					serv.findAll();
				}
			} else if (menu == 4) {
				if (loginOk) {
					serv.transfer();
				} else {
				}
			} else if (menu == 5) {
				if (loginOk) {
					serv.update();
				} else {
				}
			} else if (menu == 6) {
				if (loginOk) {
					loginOk = serv.delete();
				} else {
					System.out.println("아직지원되지않는서비스입니다");
				}
			} else if (menu == 7) {
				if (loginOk) {
					serv.logOut();
					loginOk = false;
				} else {
					System.out.println("아직지원되지않는서비스입니다");
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
