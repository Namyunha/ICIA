package Namyunha;

import java.util.List;
import java.util.Scanner;

import day8.User2;

public class Utill {
	Scanner sc = new Scanner(System.in);

	public int numberCheck() {
		int result;

		while (true) {
			if (sc.hasNextInt()) {
				result = sc.nextInt();
				break;
			} else {
				System.out.println("숫자만 입력하세요 > ");
				sc.nextLine();
			}
		}
		return result;
	}

	public void userCheck(List<Visitor> list, String id) {
		boolean check = false;
		while (check) {
			System.out.print("ID 입력 > ");
			id = sc.next();
			for (Visitor v : list) {
				if (id.equals(v.getId())) {
					System.out.println("이미 존재하는 아이디입니다");
				}
				if (!id.equals(v.getId())) {
					check = true;
					break;
				}
			}

		}

	}

}
