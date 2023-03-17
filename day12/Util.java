package day12;

import java.util.*;
import java.util.Scanner;

public class Util {
	UserService service = UserService.getInstance();
	UserRepository repository = UserRepository.getInstance();
	static Scanner sc = new Scanner(System.in);

	public static int numberCheck() {
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) {
			return sc.nextInt();
		}
		return -1;
	}

//	public String numberCheak() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("메뉴 >");
//		String menu = sc.next();
//		
//	}
//
//	public void overlapCheck(UserDTO userDTO) {
//		Scanner sc = new Scanner(System.in);
//		for (UserDTO s : repository.list) {
//			while (true) {
//				if (s.getEmail().equals(userDTO.getEmail())) {
//					System.out.print("중복된 아이디입니다\n다시입력 >");
//					userDTO.setEmail(sc.next());
//				} else if (!userDTO.getEmail().equals(s.getEmail())) {
//					break;
//				}
//			}
//		} 
//	}
	// 아이디 중복 체크만들기

	public static char genderCheck() {
		do {
			System.out.print("<성별>\n1.남자 2.여자 > ");
			String gender = sc.next();
			if (gender.equals("1")) {
				return 'M';
			} else if (gender.equals("2")) {
				return 'F';
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		} while (true);

//		while(true) {
//			System.out.println("성별\n 1.남자 2.여자 > ");
//			
//		}
	}

	public static String overlapCheck(List<UserDTO> list, String str) {
		while (true) {
			System.out.println(str + " > ");
			String email = sc.next();
			boolean find = false;
			for (UserDTO u : list) {
				if (u.getEmail().equals(email + "@" + UserDTO.getDomain())) {
					System.out.println("중복된 " + str);
					break;
				}
			}
			if (find) {
				continue;
			}
			return email;
		}

	}
}
