package day9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Student> list = new ArrayList<>();

		boolean find = false;
		boolean check = false;
		boolean remove = false;
		while (true) {
			System.out.println("=====================학사관리시스템======================");
			System.out.println("1.학생등록 2.리스트 3.검색 4.수정 5.삭제 0.종료");
			System.out.print("메뉴 선택 > ");
			int menu = sc.nextInt();
			if (menu == 1) {
				Student student = new Student();
				System.out.print("이름 > ");
				student.setName(sc.next());
				System.out.print("국어 점수 > ");
				student.setKor(sc.nextInt());
				System.out.print("영어 점수 > ");
				student.setEng(sc.nextInt());
				System.out.print("수학 점수 > ");
				student.setMat(sc.nextInt());
				student.setTotal();
				student.setAvg();
				student.setGrade();
				list.add(student);
				System.out.println(student.getName() + "학생이 등록되었습니다.");
			} else if (menu == 2) {
				System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t학점");
				for (Student s : list) {
					s.print();
				}
			} else if (menu == 3) {
				while (!find) {
					System.out.print("찾을 학번 > ");
					String no = sc.next();
					for (Student s : list) {
						if (s.getSno().equals(no)) {
							s.print();
							find = true;
							break;
						}
					}
					if (!find) {
						System.out.println("찾으시는 학번은 없습니다.");
					}
				}
				// ==는 스택변수(int 등)에 저장된 값(주소)을 비교, 참조값(String, Array)을 비교할 때는 equals()사용
				// 메모리 공간의 이유로
				// 주소 확인은 == / 값 확인은 equals
			} else if (menu == 4) {
				while (!check) {
					System.out.print("수정하고싶은 학번 > ");
					String no = sc.next();
					System.out.print("수정할 수학점수 > ");
					int updateMat = sc.nextInt();
					System.out.print("수정할 국어점수 > ");
					int updateKor = sc.nextInt();
					System.out.print("수정할 영어점수 > ");
					int updateEng = sc.nextInt();
					for (Student s : list) {
						if (s.getSno().equals(no)) {
							s.setMat(updateMat);
							s.setKor(updateKor);
							s.setEng(updateEng);
							s.setTotal();
							s.setAvg();
							s.setGrade();
							System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t학점");
							s.print();
							check = true;
							break;
						}
					}
					if (!check) {
						System.out.println("찾으시는 학번은 없습니다.");
					}
				}
			} else if (menu == 5) {
				while (!remove) {
					System.out.println("삭제할 학번");
					String no = sc.next();
					for (Student s : list) {
						if (s.getSno().equals(no)) {
							list.remove(s);
							remove = true;
							break;
						}
					}
					if (!remove) {
						System.out.println("찾으시는 학번은 없습니다.");
					}
				}
			} else if (menu == 0) {
				break;
			} else {
				System.out.println("다시입력");
			}
			System.out.println();
		}
	}

}
