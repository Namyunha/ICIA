package day4;

import java.util.Scanner;

public class Ex05_drink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int bal = 1000;
		while (true) {
			if (bal < 0) {
				System.out.printf("======자판기====== 현재잔액 : %,d원\n", +bal);
				System.out.println("잔액이 부족합니다");
				System.out.println("금액을 충전해주세요");
				System.out.println("충전금액 > ");
				int mon = sc.nextInt();
				bal = mon + bal;
				continue;
			} else if (bal > 0) {
				System.out.printf("======자판기====== 현재잔액 : %,d원\n", +bal);
				System.out.println("1.콜라(1000) 2.사이다(1200) 3.우유(1500) 4.충전");
				System.out.println("메뉴 선택 > ");
				int menu = sc.nextInt();
				System.out.println("수량 > ");
				int qua = sc.nextInt();
				int total = bal - (qua * 1000);
				if (menu == 1) {
					if (total > 0) {
						bal = total;
						System.out.println("콜라구매성공");
					} else {
						System.out.println("콜라구매실패");
					}
				} else if (menu == 2) {
					if (total > 0) {
						bal = total;
						System.out.println("사이다 구매성공");
					} else {
						System.out.println("사이다 구매실패");
					}
				} else if (menu == 3) {
					if (total > 0) {
						bal = bal - (qua * 1500);
						System.out.println("우유 구매성공");

					} else {
						System.out.println("우유구매실패");
					}
				} else if (menu == 4) {
					System.out.println("충전금액 > ");
					int mon = sc.nextInt();
					bal = bal + mon;
				} else {
					System.out.println("1~4중에서 눌러주세요");
				}
				if (bal >= 0) {
					System.out.println("금액을 충전해주세요");
					System.out.println("충전금액 > ");
					int mon = sc.nextInt();
					bal = bal + mon;
				}
			}
		}

	}

}
