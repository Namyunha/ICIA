package day4;

import java.util.Scanner;

public class 연습해보기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("오름차순 내림차순 구하기");
		System.out.println("첫번째 숫자를 입력해주세요 > ");
		int num1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력해주세요 > ");
		int num2 = sc.nextInt();
		for(int i = num1; i <num2; i++ ) {
			System.out.println(i);
		}
	}

}
