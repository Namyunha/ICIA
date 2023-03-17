package day12;

import java.util.List;
import java.util.Scanner;

public class StudentService {
	StudentRepository re = new StudentRepository();
	Scanner sc = new Scanner(System.in);

	public void save() {
		StudentDTO studentDTO = new StudentDTO();
		Scanner sc = new Scanner(System.in);
		System.out.println("이름");
		studentDTO.setName(sc.next());
		System.out.println("국어점수");
		studentDTO.setKor(sc.nextInt());
		System.out.println("수학점수");
		studentDTO.setMat(sc.nextInt());
		System.out.println("영어점수");
		studentDTO.setEng(sc.nextInt());
		studentDTO.setGrade();

		if (re.save(studentDTO)) {
			System.out.println("등록 성공");
		} else {
			System.out.println("등록 실패");
		}

	}

	public void findAll() {
		List<StudentDTO> list = re.findAll();

		System.out.println("=======================학생 리스트==========================");
		System.out.println("학번\t이름\t국어\t수학\t영어\t총점\t평균\t학점\n");
		for (StudentDTO s : list) {
			System.out.println(s.toString());
		}
	}

//	public void findById() {
//		System.out.println("이름 > ");
//		StudentDTO student = re.findById(sc.next());
//		System.out.println(student.toString());
//	}

	public void findById() {
		System.out.println("조회할 학번 > ");
		String sno = sc.next();
		StudentDTO studentDTO = re.findById(sno);
		if (studentDTO == null) {
			System.out.println("조회할 수 없는 학번입니다.");
		} else {
			System.out.println("=======================학생 리스트==========================");
			System.out.println("학번\t이름\t국어\t수학\t영어\t총점\t평균\t학점\n");
			System.out.println(studentDTO.toString());
		}

	}

	public void update() {
		System.out.println("수정할 학번 > ");
		String sno = sc.next();
		StudentDTO studentDTO = re.findById(sno);
		if (studentDTO == null) {
			System.out.println("수정할 수 없는 학번입니다.");
		} else {
			System.out.println("수정할 이름");
			studentDTO.setName(sc.next());
			System.out.println("수정할 국어점수");
			studentDTO.setKor(sc.nextInt());
			System.out.println("수정할 수학점수");
			studentDTO.setMat(sc.nextInt());
			System.out.println("수정할 영어점수");
			studentDTO.setEng(sc.nextInt());
			studentDTO.setGrade();
			System.out.println("=======================수정한 학생==========================");
			System.out.println("학번\t이름\t국어\t수학\t영어\t총점\t평균\t학점\n");
			System.out.println();
			System.out.println(studentDTO.toString());
		}
	}

	public void remove() {
		System.out.println("삭제할 학번 > ");
		String sno = sc.next();
		StudentDTO studentDTO = re.findById(sno);
		if (studentDTO == null) {
			System.out.println("삭제할 수 없는 학번입니다.");
		} else {
			System.out.println("=======================삭제한 학생==========================");
			System.out.println("학번\t이름\t국어\t수학\t영어\t총점\t평균\t학점\n");
			System.out.println(studentDTO.toString());
			re.remove(studentDTO);
			System.out.println();
			System.out.println("삭제완료");
		}
	}
}
