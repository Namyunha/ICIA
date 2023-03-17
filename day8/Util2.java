package day8;

import java.util.List;
import java.util.Scanner;

public class Util2 {
	Scanner sc = new Scanner(System.in);

	public int selectNumber() {
		int result;
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

	public String lengthCheck(String str, int maxLength) {
		System.out.println(str + "입력 > ");
		String result;
		while (true) {
			result = sc.next();
			if (result.length() <= maxLength) {
				break;
			}
			System.out.printf("%s의 최대 글자수는 %d입니다.\n", str, maxLength);
			System.out.println(str + "입력 > ");
		}
		return result;
	}


	public String lengthPw() {
		String result;
		while (true) {
			System.out.println("비밀번호 입력 > ");
			result = sc.next();
			if (result.length() > 6) {
				System.out.println("암호를 6자리 이하로 적어주세요");
			} else {
				break;
			}
		}
		return result;
	}

}
//아이디 길이체크 메소드
// 비밀번호 자리수
// 아이디 중복체크