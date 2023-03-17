package day4;

import java.util.Scanner;

public class Ex02_calculator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		double result = 0;
		
		while(run) {
			System.out.println("=====계산기=====");
			System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 5.나머지");
			System.out.print("메뉴선택> ");
			int menu = sc.nextInt();
			if(menu < 1 || menu > 5) {
				System.out.println("0~5까지 입력가능합니다");
				continue;
			}
			System.out.print("첫번째 숫자 입력> ");
			int num1 = sc.nextInt();
			System.out.print("두번째 숫자 입력> ");
			int num2 = sc.nextInt();
			System.out.println();
			
			switch(menu) {
			case 1:
				System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
				result = num1+num2;
				break;
			case 2:
				System.out.printf("%d - %d = %d\n",num1,num2,num1-num2);
				result = num1-num2;
				break;
			case 3:
				System.out.printf("%d * %d = %d\n",num1,num2,num1*num2);
				result = num1*num2;
				break;
			case 4:
				System.out.printf("%d / %d = %.2f\n",num1,num2,num1/(double)num2);
				result = num1/num2;
				break;
			case 5:
				System.out.printf("%d %% %d = %d\n",num1,num2,num1%num2);
				result = num1%num2;
				break;
			}
			System.out.println();
			System.out.print("\n다시입력(Y/y)> ");
			String reStart = sc.next();
			
			if(!(reStart.equals("Y") || reStart.equals("y"))) {
				run = false;
			}
			
			
			
			
			
			
			
			
			
			
		}
		System.out.println("프로그램 종료");
	}

}