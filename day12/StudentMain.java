package day12;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StudentService service = new StudentService();
		Util util = new Util();
		
		while(true) {
			System.out.println("====학사관리====");
			System.out.println("1.학생등록 2.리스트 3.학생조회 4.학생수정 5.학생삭제 0.종료");
			System.out.print("메뉴 >");
			int menu = util.numberCheck();

			if(menu == 1) {
				service.save();
			}else if(menu == 2) {
				service.findAll();
			}else if(menu == 3) {
				service.findById();
			}else if(menu == 4) {
				service.upDate();
			}else if(menu == 5) {
				service.delete();
			}else if(menu == 0) {
				break;
			}else {
				System.out.println("없는 메뉴");
			}
		}
		System.out.println("시스템 종료");
	}

}
