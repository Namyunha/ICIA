package day3;

import java.util.Scanner;

public class Ex01_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String id = "test";
		String pw = "1234";
		
		boolean run = true;
		while(run) {
			System.out.println("==========로그인===========");
			System.out.print("아이디입력 > ");
			String ID = sc.next();
			System.out.print("비밀번호 입력 > ");
			String PW = sc.next();
			
			if(ID.equals(id) && PW.equals(pw)) {
				System.out.println("로그인됐습니다.");
				run = false;
			} 
		 else {
			System.out.println("로그인 실패");
			System.out.println("다시시도(Y/y)");
			String y = sc.next();
			if(y.equals("Y")||y.equals("y")) {
				System.out.print("아이디입력 > ");
				ID = sc.next();
				System.out.print("비밀번호 입력 > ");
				PW = sc.next();
			} else {
				System.out.println("로그인 종료");
				break;
			}
		}
//			else if(ID != id || PW !=pw) {
//			System.out.println("ID 또는 PW를 확인해주세요");
//			System.out.println("아이디입력 > ");
//			ID = sc.next();
//			System.out.println("비밀번호 입력 > ");
//			PW = sc.next();
//		}
	}
	}
}