package day2_230202;

import java.util.Scanner;

public class 조건문_switch_case예제 {

	public static void main(String[] args) {
		//문제) 변수 a에 숫자를 입력받고 , 1~12까지 각각 매달을 영어로 출력
		System.out.print("====1~12까지입력하세요 > ");
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		
		switch(a) {
		case "1":
			System.out.println("January.");
			break;
		case "2":
			System.out.println("February.");
			break;
		case "3":
			System.out.println("March.");
			break;
		case "4":
			System.out.println("April.");
			break;
		case "5":
			System.out.println("May.");
			break;
		case "6":
			System.out.println("June.");
			break;
		case "7":
			System.out.println("July.");
			break;
		case "8":
			System.out.println("August.");
			break;
		case "9":
			System.out.println("September.");
			break;
		case "10":
			System.out.println("October.");
			break;
		case "11":
			System.out.println("Nobember.");
			break;
		case "12":
			System.out.println("December.");
			break;
		default:
			System.out.println("1~12까지입력해주세요");
		}

	}

}
