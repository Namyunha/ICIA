package day6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class account2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[100];
		String[] account = new String[100];
		String[] date = new String[100];
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");

		int[] balance = new int[100];
		int cnt = 0;

		while (true) {
			System.out.println("==================인천일보은행 4조==================");
			System.out.println("|1.계좌 생성| |2.입금| |3.출금| |4.계좌이체| |5.계좌목록|");
			System.out.print("메뉴선택 >>");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.print("예금주명 >>");
				name[cnt] = sc.next();
				System.out.print("계좌번호 >>");
				account[cnt] = sc.next();
				System.out.print("초기입금금액>>");
				balance[cnt] = sc.nextInt();
				LocalDateTime now = LocalDateTime.now();
				date[cnt] = dtf.format(now);
				System.out.println(name[cnt] + "님 계좌가 개설되었습니다!");
				cnt++;
			} else if (menu == 2) {
				System.out.print("입금할 계좌>>");
				String dAccount = sc.next();
				System.out.print("입금금액>>");
				int deposit = sc.nextInt();
				for (int i = 0; i < cnt; i++) {
					if (dAccount.equals(account[i])) {
						balance[i] += deposit;
						System.out.println("입금완료!");
						System.out.println("현재 잔액: " + balance[i]);
						break;
					} else if (i == cnt - 1) {
						System.out.println("잘못된 계좌입니다");
					}
				}
			} else if (menu == 3) {
				System.out.print("출금할 계좌>>");
				String wAccount = sc.next();
				System.out.print("출금금액>>");
				int withdraw = sc.nextInt();
				boolean accountCheck = false;
				for (int i = 0; i < cnt; i++) {
					if (wAccount.equals(account[i])) {
						if (balance[i] >= withdraw) {
							balance[i] -= withdraw;
							System.out.println("출금완료");
							System.out.println("현재 잔액: " + balance[i]);
							accountCheck = true;

						} else {
							System.out.println("금액부족");
							accountCheck = true;
						}

					}
				}
				if (!accountCheck) {
					System.out.println("잘못된 계좌입니다");
				}

			} else if (menu == 4) {
				boolean moneyCheck = false;
				while (!moneyCheck) {
					int wI = 0;
					int dI = 0;
					int money = 0;
					for (wI = 0; wI < cnt; wI++) {
						System.out.println("출금할 계좌를 입력하세요");
						String wAccount = sc.next();
						if (wAccount.equals(account[wI])) {
							System.out.println("금액을 입력 해주세요");
							money = sc.nextInt();
							if (balance[wI] < money) {
								System.out.println("잔액이 모자랍니다.");
								break;
							} else {
								balance[wI] = balance[wI] - money;
								System.out.println("입금할 계좌를 입력하세요");
								String dAccount = sc.next();
								for (dI = 0; dI < cnt; dI++) {
									if (dAccount.equals(account[dI])) {
										balance[wI] = balance[wI] + money;
									} else {
										System.out.println("입금 계좌를 확인해주세요");
									}
								}

							}
						} else {
							System.out.println("출금 계좌를 확인해주세요");
						}

					}
				}

			} else if (menu == 5) {
				System.out.println("예금주명\t    계좌번호\t   현재잔액\t   계좌개설시간");
				System.out.println("------------------------------------");
				for (int i = 0; i < cnt; i++) {
					System.out.printf("%s\t%s\t%,d\t%s\n", name[i], account[i], balance[i], date[i]);
				}
			} else {

			}
		}

	}

}
