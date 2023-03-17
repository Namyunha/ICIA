package day6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex03_account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
//		LocalDateTime now = LocalDateTime.now();
		String[] name = new String[100];
		String[] account = new String[100];
		int[] balance = new int[100];
		int cnt = 0;

		while (true) {
			System.out.println(" =====인천일보은행=====");
			System.out.println(" 1.계좌생성 2.입금 3.출금 4.계좌이체 5.계좌목록 0.종료");
			System.out.println(" 메뉴선택> ");
			int menu = sc.nextInt();
			if (menu == 1) {
				System.out.println(" 예금주명> ");
				name[cnt] = sc.next();
				System.out.println(" 계좌번호> ");
				account[cnt] = sc.next();
				System.out.println(" 초기입금금액> ");
				balance[cnt] = sc.nextInt();
				System.out.println(name[cnt] + " 님 계좌가 개설되었습니다. 잔액은 " + balance[cnt] + "입니다.");
				cnt++;
			} else if (menu == 2) {
				System.out.println(" 입금할 계좌> ");
				String inputAccount = sc.next();
				System.out.println(" 입금금액> ");
				int inputMoney = sc.nextInt();
				for (int i = 0; i < cnt; i++) {
					if (inputAccount.equals(account[i])) {
						balance[i] += inputMoney;
						System.out.println("입금액: " + inputMoney);
						System.out.println(inputMoney + " 원 입금 되었습니다. 현재잔액 : " + balance[i]);
						break;
					} else if (i == cnt - 1) {
						System.out.println("계좌가 잘못되었습니다.");
					}
				}

			} else if (menu == 3) {

				System.out.println(" 출금할 계좌> ");
				String inputAccount = sc.next();
				System.out.println(" 출금금액> ");
				int inputOutMoney = sc.nextInt();
				for (int i = 0; i < cnt; i++) {
					if (inputAccount.equals(account[i])) {
						if (balance[i] >= inputOutMoney) {

							balance[i] -= inputOutMoney;
							System.out.println(inputOutMoney + "원 출금 되었습니다. " + balance[i] + "원 남았습니다.");
						} else {
							System.out.println("  잔액이 부족합니다. 현재잔액" + balance[i]);
						}
						break;
					} else if (i == cnt - 1) {
						System.out.println("계좌가 잘못되었습니다.");
					}
				}
			} else if (menu == 4) {
				System.out.println(" 이체 할 계좌> ");
				String sendAccount = sc.next();
				System.out.println(" 돈 받을  계좌> ");
				String takeAccount = sc.next();
				System.out.println(" 이체금액> ");
				int inOutMoney = sc.nextInt();
				for (int i = 0; i < cnt; i++) {/////////// 이체 할 계좌 체크
					if (sendAccount.equals(account[i])) {
						if (balance[i] >= inOutMoney) {

							for (int i1 = 0; i1 < cnt; i1++) {/////////// 돈 받을 계좌 체크
								if (takeAccount.equals(account[i1])) {
									balance[i] -= inOutMoney;
									System.out.println(name[i] + "님" + inOutMoney + "원 이체 되었습니다. " + balance[i] + "원 남았습니다.");
									balance[i1] += inOutMoney;
									System.out.println(name[i1] + "님 " + inOutMoney + "원 받으셔서 잔액" + balance[i1] + "입니다.");
									break;
								} else if (i1 == (cnt - 1)) {
									System.out.println("  받는계좌가 없습니다.");
								}
							}

						} else {
							System.out.println("  잔액이 부족합니다. 현재잔액" + balance[i]);
						}
						break;
					} else if (i == cnt - 1) {
						System.out.println("계좌가 잘못되었습니다.");
					}
				}
			} else if (menu == 5) {
				System.out.println("예금주\t계좌번호\t잔액");
				for (int i = 0; i < cnt; i++) {
					System.out.printf("%s\t%s\t%,d\n", name[i], account[i], balance[i]);
				}
			} else if (menu == 0) {
				System.out.println("  종료 안녕히 가세요");
				break;
			} else {
				System.out.println("다시입력");
			}

		}
	}

}
