package day3;

import java.util.Scanner;

public class Fax {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("4조(최도영 남윤하 최민호 김유진)");
		while (true) {
			System.out.println("복합기만들기\n");
			System.out.print("충전금액 > ");
			long money = sc.nextInt();
			while (true) {
				if (money <= 0) {
					System.out.println("잔액이 부족합니다");
					System.out.println("1.충전 2.종료");
					int btn = sc.nextInt();
					if (btn == 1) {
						System.out.print("충전금액 > ");
						money = sc.nextInt() + money;
					} else if (btn == 2) {
						break;
					}
				}
				System.out.println("\n==== 복합기 =====\t현재잔액: " + money + "원");
				System.out.println("1.인쇄기 2.스캐너(500원) 3.팩스(1000원) 0.종료");
				System.out.print("메뉴선택>");
				int p = sc.nextInt();
				int sum = 0;
				if (p == 1) {
					while (true) {
						System.out.print("인쇄기: 1.흑백(1000원), 2.칼라(1500원) > ");
						int choice = sc.nextInt();
						if (choice == 1) {
							System.out.print("수량입력 > ");
							int num = sc.nextInt();
							sum = num * 1000;
							System.out.println("가격은" + sum + "입니다.");
							break;
						} else if (choice == 2) {
							System.out.print("수량입력 > ");
							int num = sc.nextInt();
							sum = num * 1500;
							System.out.println("가격은" + sum + "입니다.");
							break;
						} else {
							System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
						}
					}
					money = money - sum;
				} else if (p == 2) {
					System.out.println("스캐너가격은 500원 입니다.");
					System.out.print("수량입력 > ");
					int num = sc.nextInt();
					sum = num * 500;
					System.out.println("가격은" + sum + "입니다.");
					money = money - sum;
				} else if (p == 3) {
					while (true) {
						System.out.println("번호를 입력해주세요");
						String n = sc.next();
						System.out.println("번호는" + n + "입니다.");
						System.out.println("번호가 맞으면 1 아니면 2");
						int choice = sc.nextInt();
						if (choice == 1) {
							System.out.print("수량입력 > ");
							int num = sc.nextInt();
							sum = num * 1000;
							System.out.println("가격은" + sum + "입니다.");
							money = money - sum;
							break;
						} else {
							System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
						}
					}
				} else if (p == 0) {
					System.out.println("종료 되었습니다");
					money = money - sum;
					System.out.println("잔액은" + money + "입니다.");
					break;

				} else {
					System.out.println("1~3중에 입력해주세요");
				}
			}

		}
	}

}
