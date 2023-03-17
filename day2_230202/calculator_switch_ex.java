package day2_230202;

import java.util.Scanner;

public class calculator_switch_ex {

	public static void main(String[] args) {
		// 문제) 숫자 2개를 입력받고, 메뉴에서 하나를 선택하여 결과출력
		// 1.더하기 2.빼기 3. 곱하기 4 나누기 5. 나머지
		Scanner sc = new Scanner(System.in);
		System.out.print("===첫번째 숫자 입력하세요 > ");
		int a = sc.nextInt();
		System.out.print("===두번째 숫자 입력하세요 > ");
		int b = sc.nextInt();
		System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 5.나머지");
		System.out.print("===메뉴 선택 하세요 > ");
		int selectNum = sc.nextInt();

		switch (selectNum) {
		case 1:
			System.out.println(a + " + " + b + " = " + (a + b));
			break;
		case 2:
			System.out.println(a + " - " + b + " = " + (a - b));
			break;
		case 3:
			System.out.println(a + " * " + b + " = " + (a * b));
			break;
		case 4:
			System.out.println(a + " / " + b + " = " + (a / b));
			break;
		case 5:
			System.out.println(a + " % " + b + " = " + (a % b));
			break;

		default:
			System.out.println("1~5 메뉴 골라주세요");
		}
	}
}
