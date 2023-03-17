package day4;

import java.util.Scanner;

public class Ex02_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.println("=====계산기=====");
			System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 5.나머지");
			System.out.println("메뉴 선택 > ");
			int menu = sc.nextInt();
			double result = 0;
			if (menu < 1 || menu > 5) {
				System.out.println("0~5까지 입력가능합니다.");
				continue;
			}
			System.out.println("첫번째 숫자 입력 > ");
			int num1 = sc.nextInt();
			System.out.println("두번째 숫자 입력 > ");
			int num2 = sc.nextInt();
			switch (menu) {
			case 1:
				System.out.printf("%d + %d = %d\n", num1, num2, (num1 + num2));
				result = num1 + num2;
				break;
			case 2:
				System.out.printf("%d - %d = %d\n", num1, num2, (num1 - num2));
				result = num1 - num2;
				break;
			case 3:
				System.out.printf("%d * %d = %d\n", num1, num2, (num1 * num2));
				result = num1 * num2;
				break;
			case 4:
				System.out.printf("%d / %d = %.2f\n", num1, num2, (num1 / (double) num2));
				result = (num1 / (double) num2);
				break;
			case 5:
				System.out.printf("%d %% %d = %d\n", num1, num2, (num1 % num2));
				result = (num1 % num2);
				break;
			}
			System.out.println();
			System.out.println("1이어서하기 2.새로하기 0.종료");
			System.out.println("메뉴 선택 > ");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				while (true) {
					System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 5.나머지");
					System.out.println("메뉴선택 > ");
					menu = sc.nextInt();
					System.out.println("숫자입력 > ");
					int num = sc.nextInt();
					System.out.println();
					if (menu == 1) {
						System.out.printf("%.2f + %d = %.2f\n", result, num, result + num);
						result = result + num;
					} else if (menu == 2) {
						System.out.printf("%.2f - %d = %.2f\n", result, num, result - num);
						result = result - num;
					} else if (menu == 3) {
						System.out.printf("%.2f * %d = %.2f\n", result, num, result * num);
						result = result * num;
					} else if (menu == 4) {
						System.out.printf("%.2f / %d = %.2f\n", result, num, result / num);
						result = result / num;
					} else if (menu == 5) {
						System.out.printf("%.2f %% %d = %.2f\n", result, num, result % num);
						result = result % num;
					}
					System.out.println();
					System.out.println("1이어서하기 2.새로하기 0.종료");
					System.out.println("메뉴 선택 > ");
					menu = sc.nextInt();
					if (menu == 1) {
						
					} else if (menu == 2) {
						break;
					} else if (menu == 3) {
						run = false;
						break;
					}
				}
				break;
			case 2:
				break;
			case 0:
				run = false;
			default:
				System.out.println("0~2까지 입력가능");
			}
		}
		System.out.println("프로그램 종료");
	}

}

//결과출력하고나서 이어서하기 새로하기  종료
