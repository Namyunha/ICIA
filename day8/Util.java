package day8;

import java.util.Scanner;

public class Util {
	// 숫자체크 메소드
	public int numberCheck() {
		int result;
		Scanner sc = new Scanner(System.in);
		while (true) {
			if (sc.hasNextInt()) {
				result = sc.nextInt();
				break;
			} else {
				System.out.println("숫자만 입력 > ");
				sc.nextLine();
			}
		}
		return result;
	}

	public int numberCheck1(String str) {
		int result;
		Scanner sc = new Scanner(System.in);
		while (true) {
			if (sc.hasNextInt()) {
				result = sc.nextInt();
				break;
			} else {
				System.out.println(str + "은 숫자만 입력 > ");
				sc.nextLine();
			}
		}
		return result;
	}

	// 아이디는 6자 이내 체크 함수
//	public String idCheck1() {
//		String result2;
//		Scanner sc = new Scanner(System.in);
//		result2 = sc.next();
//		while (true) {
//			if (result2.length() < 7) {
//				break;
//			} else {
//				System.out.println("7자 이내로 입력해주세요");
//				System.out.print("아이디입력 > ");
//				result2 = sc.next();
//			}
//
//		}
//		return result2;
//	}

	public String lengthCheck(String str, int maxLength) {
		Scanner sc = new Scanner(System.in);
		System.out.println(str + "입력 > ");
		String result;
		while (true) {
			result = sc.next();
			if (result.length() <= maxLength) {
				break;
			}
			System.out.printf("%s의 최대 글자수는 %d입니다.", str, maxLength);
		}
		return result;
	}

}
