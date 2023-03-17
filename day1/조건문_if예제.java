package day1;

import java.util.Scanner;

public class 조건문_if예제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("====입력하세요 > ");
		int a = sc.nextInt();

		if (a == 0) {
			System.out.print("0입니다.");
		}
		else 
			if ((a % 5)==0) {
				if((a % 3) == 0) {
					System.out.print("5와 3의 배수입니다.");
				}else {
					System.out.print("5의 배수입니다. ");
				}
			}else if((a % 3)==0) {
				System.out.print("3의 배수입니다. ");
			}else
				System.out.println("3과5의 배수가 아닙니다.");
	}
}
//Scanner sc = new Scanner(System.in);
//String id = "test";
//String pw = "1234";
//
//System.out.println("=====로그인=====");
//
//System.out.print("id를 입력하세요 > ");
//String inputId = sc.next();
//System.out.print("password를 입력하세요 > ");
//String inputPw = sc.next();
//
//if (inputId.equals(id)) {
//	if(inputPw.equals(pw)) {
//		System.out.println("로그인 성공!!!!!");
//		
//	}else{
//		System.out.println("비밀번호를 확인하세요!!!!!");
//	}
//
//}else {
//	System.out.println("id를 확인하세요!!!!!");
//}

//if ( inputId.equals(id) && inputPw.equals(pw) ){
//System.out.println("로그인 성공!!!!!");
//
//}else {
//System.out.println("id와 pw 확인하세요!!!!!");
//Scanner sc = new Scanner(System.in);
//System.out.println("=====계산기====");
//System.out.print("첫번째 숫자입력> ");
//int num1 = sc.nextInt();
//System.out.print("두번째 숫자입력> ");
//int num2 = sc.nextInt();
//System.out.println("1.더하기 2.빼기 3. 곱하기 4.나누기 5.나머지");
//System.out.print("메뉴선택> ");
//int menu = sc.nextInt();
//String equal = " = ";
//if (menu == 1) {
//	System.out.println(num1 + " + " + num2 + equal + (num1+num2));
//}else if (menu == 2) {
//	System.out.println(num1 + " - " + num2 + equal + (num1-num2));
//}else if (menu == 3) {
//	System.out.println(num1 + " * " + num2 + equal + (num1*num2));
//}else if (menu == 4) {
//	System.out.println(num1 + " / " + num2 + equal + (num1/num2));
//}else if (menu == 5){
//	System.out.println(num1 + " % " + num2 + equal + (num1%num2));
//}
//if (menu == 1) 
//	System.out.println(num1 +"+"+ num2+ "=" + (num1+num2));
//else if (menu == 2) 
//	System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
//else if (menu == 3) 
//	System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
//else if (menu == 4) 
//	System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
//else if (menu == 5)
//	System.out.println(num1 + "%" + num2 + "=" + (num1%num2));

//int mul = menu * 1000;
//System.out.println(mul);

////변수 num이 짝수이면 '짝수', 홀수이면 '홀수'출력 0이면 "0"출력
//int num = 0;
//if (num == 0) {
//	System.out.println("0");
//}
//else if(num % 2 == 1){
//	System.out.println("홀수");	
//}else {
//	System.out.println("짝수");
//int a = 80;
//if (a < 0) {
//	System.out.println("음수입니다");
//}else if(a > 0) {
//	System.out.println("양수입니다.");
//}else {
//	System.out.println("0 입니다.");
//}
// 문제) 변수 score가 90이상이면 'A',
//80이상이면 'B', 70이상이면 'C', 60이상이면 'D',60이하이면 'F'
//if (a >= 90) {
//	System.out.println("A 입니다");
//}else if(a >= 80) {
//	System.out.println("B 입니다.");
//}else if(a >= 70) {
//	System.out.println("C 입니다.");
//}else if(a >= 60) {
//	System.out.println("D 입니다.");
//}else if(a < 60) {
//	System.out.println("F 입니다.");
//}	