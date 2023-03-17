package 실습2;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class VisitorMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		VisitorService service = new VisitorService();
		boolean login = false;
		while (!login) {
			System.out.println("====================로그인창========================");
			System.out.println("1.가입 2.로그인하기 3.ID찾기 4.PW찾기 5.회원목록 0.종료");
			System.out.print("메뉴 > ");
			int menu = sc.nextInt();
			if (menu == 1) {
				service.join();
			} else if (menu == 2) {
				service.login();
				login = true;
			} else if (menu == 3) {
				service.searchId();
			} else if (menu == 4) {
				service.searchPw();
			} else if (menu == 5) {
				service.findAll();
			} else if (menu == 0) {
				break;
			} else {
				System.out.println("다시 입력");
			}
			while (login) {
				System.out.println("==================하영's 쁘띠 쇼핑몰======================");
				System.out.println("1.상품리스트 2.장바구니 3.로그아웃 0.종료");
				System.out.println("메뉴선택> ");
				int menu1 = sc.nextInt();
				if (menu1 == 1) {
//					상품리스트repository
					while (true) {
						System.out.println("-----------------------------");
						System.out.println("1.구매하기 2.뒤로가기");
						System.out.println("선택> ");
						int menu2 = sc.nextInt();

						if (menu2 == 1) {
//								상품리스트repository

						} else if (menu2 == 2) {
							break;
						} else {
							System.out.println("다시입력");
						}
						System.out.println();
					}

				}
			}
		}
		System.out.println("프로그램 종료");
	}

}
