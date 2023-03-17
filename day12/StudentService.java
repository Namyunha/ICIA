package day12;

import java.util.List;
import java.util.Scanner;

public class StudentService {
	StudentRepository re = new StudentRepository();
	Scanner sc = new Scanner(System.in);
	
	public void save() {
		StudentDTO studentDTO = new StudentDTO();
		System.out.print("이름 >");
		studentDTO.setName(sc.next());
		System.out.print("국어 >");
		studentDTO.setKor(sc.nextInt());
		System.out.print("영어 >");
		studentDTO.setEng(sc.nextInt());
		System.out.print("수학 >");
		studentDTO.setMat(sc.nextInt());
		studentDTO.setGrade();
		
		if(re.save(studentDTO)) {
			System.out.println("등록 성공");
		}else {
			System.out.println("등록 실패");
		}
	}
	public void findAll() {
		List<StudentDTO> list = re.findAll();
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println("------------------------------------------------------------");
		for(StudentDTO s : list) {
			System.out.println(s.toString());
		}
	}
	public void findById() {
		System.out.println("학번 >");
		String stsno = sc.next();
		
		StudentDTO studentDTO = re.findById(stsno);
		if(studentDTO == null) {
			System.out.println("없는 정보");
		}else {
			System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t학점");
			System.out.println("------------------------------------------------------------");
			System.out.println(studentDTO.toString());
		}
	}
	public void upDate() {
		System.out.print("대상 학번 >");
		String stsno = sc.next();
		
		StudentDTO studentDTO = re.findById(stsno);
		if(studentDTO == null) {
			System.out.println("없는 학생");
		}else {
			System.out.print("이름(수정) >");
			studentDTO.setName(sc.next());
			System.out.print("국어(수정) >");
			studentDTO.setKor(sc.nextInt());
			System.out.print("영어(수정) >");
			studentDTO.setEng(sc.nextInt());
			System.out.print("수학(수정) >");
			studentDTO.setMat(sc.nextInt());
			studentDTO.setGrade();
			System.out.println("수정 완료!\n");
			System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t학점");
			System.out.println("------------------------------------------------------------");
			System.out.println(studentDTO.toString()+"\n");
		}
	}
	public void delete() {
		System.out.print("대상 학번 >");
		String stsno = sc.next();
		
		StudentDTO studentDTO = re.findById(stsno);
		if(studentDTO == null) {
			System.out.println("없는 학번");
		}else {
			re.delete(studentDTO);
			System.out.println("삭제 완료");
		}
	}
}
