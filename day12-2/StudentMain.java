package day12;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentService service = new StudentService();
		Util utill = new Util();
		while (true) {
			System.out.println("=================학사관리====================");
			System.out.println("1.학생등록 2.리스트 3.학생조회 4.학생수정 5.학생삭제 0.종료");
			System.out.println("선택 > ");
			int menu = utill.numberCheck();
			if (menu == -1) {
				System.out.println();
				continue;
			}
			if (menu == 1) {
				service.save();
			} else if (menu == 2) {
				service.findAll();
			} else if (menu == 3) {
				service.findById();
			} else if (menu == 4) {
				service.update();
			} else if (menu == 5) {
				service.remove();
			} else if (menu == 0) {
				break;
			} else {
				System.out.println("다시입력");
			}
			System.out.println("");
		}
		System.out.println("프로그램 종료");
	}
}
