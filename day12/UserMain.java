package day12;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 변수는 stack에 저장 stack에 저장 된 변수들이 heap을 참조
		// 참조변수들이 heap을 공유하고 있을 때 heap하나를 변경하면
		// heap에 있는 값을 공유하는 변수들은 전부 변경
		String str0 = new String("안녕");
		String str1 = "안녕";
		String str2 = str1;
		String str3 = str2;
		String str4 = "안녕";
		int i = 9;
		// heap 안에 안녕이 생기고 stack 안 st1에 100번지주소 안녕이 담김 그리고 str2에는 st1이
		// 참조하고있는 100번지주소 안녕이 담김
		// 객체생성 방법에 따라서 주소값 참조 방법이 달라질 수 있는데
		// 리터널 방법으로 객체를 생성할 때에는 참조 값이 기존에 주소에 있는 값과 갔다면 기존 주소에 있는 것을 참조한
		System.out.println(str0 == str4);
		System.out.println(str1 == str4);
		// 새로운 주소값이기 떄문에 위의 값은 fasle가 뜬다.

		Scanner sc = new Scanner(System.in);
		UserService service = UserService.getInstance(); // 싱글톤으로 만든 객체를 사용하는 방법
		Util util = new Util();
		boolean loginOk = false;

		while (true) {
			System.out.println("====" + UserDTO.getDomain() + "====");
			if (loginOk) {
				System.out.println("1.정보읽기 2.로그아웃 3.회원수정 4.회원탈퇴 0.종료");
			} else {
				System.out.println("1.회원가입 2.로그인 3.리스트 4.도메인변경 0.종료");
			}
			System.out.print("선택 >");
			int menu = util.numberCheck();

			if (menu == 1) {
				if (loginOk) {
					service.findById();
				} else {
					service.save();
				}
			} else if (menu == 2) {
				if (loginOk) {
					loginOk = service.logout();
				} else {
					loginOk = service.login();
				}
			} else if (menu == 3) {
				if (loginOk) {
					service.update();
				} else {
					service.list();
				}
			} else if (menu == 4) {
				if (loginOk) {
					loginOk = service.delete();
				} else {
					service.domainChange();
				}
			} else if (menu == 0) {
				break;
			} else {
				System.out.println("다시입력");
			}
			System.out.println();
		}
		System.out.println("시스템 종료");
	}

}
