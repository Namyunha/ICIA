package day4;

import java.util.Scanner;

public class Ex01_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("=====성적=====");
			System.out.println("이름입력 > ");
			String name = sc.next();
			System.out.println("국어점수 입력 > ");
			int kor = sc.nextInt();
			System.out.println("영어점수 입력");
			int eng = sc.nextInt();
			System.out.println("수학점수 입력");
			int mat = sc.nextInt();
			if(kor>100 || kor<0) {
				System.out.println("국어점수를 0~100사이를 입력해주세요");
				continue;
			} else if(eng>100 || eng<0) {
				System.out.println("영어점수를 0~100사이를 입력해주세요");
				continue;
			} else if(mat>100 || mat<0) {
				System.out.println("수학점수를 0~100사이를 입력해주세요");
				continue;
			}
			int total = kor + eng + mat;
			double avg = total / 3f;
			char grade = ' ';
			if(avg>100 || avg<0) {
				System.out.println("다시 입력해주세요");
				continue;
			}else if(avg >= 90) {
				grade = 'A';
			} else if(avg >= 80) {
				grade = 'B';
			} else if(avg >= 70) {
				grade = 'C';
			} else if(avg >= 60) {
				grade = 'D';
			} else if(avg<60 && avg>=0) {
				grade = 'F';
			} 
			System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점\n");
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%c\n",name,kor,eng,mat,total,avg,grade);
			//%d = 숫자, %s = 문자열, %f = 실수, %c = 문자
			System.out.print("다시 입력(Y/y) > ");
			String reStart = sc.next();
			if(!(reStart.equals("Y") || reStart.equals("y")) ) {
				break;
			} 
			
			
			
		}
		
		
	}

}
