package day2_230202;

import java.util.Scanner;

public class 반복문_while {

	public static void main(String[] args) {
		// 숫자입력 받으면서 3의 배수, 5의배수, 3과5의 배수를 출력
		Scanner sc = new Scanner(System.in);
		int a = 5;
		while (a!=0) {
			System.out.print("숫자를 입력하세요>");
			a = sc.nextInt();
			if (a == 0) {
				System.out.println("0입니다.끝");

			} else if ((a % 3 == 0) && (a % 5 == 0)) {
				System.out.println("3과 5의 배수입니다.");
			} else if (a % 5 == 0) {
				System.out.println("5의 배수입니다.");
			} else if (a % 3 == 0) {
				System.out.println("3의 배수입니다.");
			} else {
				System.out.println("3과 5의 배수가 아닙니다.");
			}
		}
//		System.out.println("끝");5
		
	}
}

//System.out.print("숫자를 입력하세요>");
//int a = sc.nextInt();
//while (a != 0) {
//	System.out.print("숫자를 입력하세요>");
//	a = sc.nextInt();
//}
//System.out.println("끝");
// int num2 = sc.nextInt();
// System.out.println("1.더하기 2.빼기 3. 곱하기 4.나누기 5.나머지");
// System.out.print("메뉴선택> ");
// int menu = sc.nextInt();
//int a = 1;
//int sum = 0;
//while(a <= 10000) {
//	sum = sum + a;
//	a++;
//}
//System.out.println(sum);