package day4;

import java.util.Scanner;

public class Ex03_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("=====정렬=====");
			System.out.println("첫번째 숫자입력 > ");
			int num1 = sc.nextInt();
			System.out.println("두번째 숫자입력 > ");
			int num2 = sc.nextInt();
			
	
			if(num1 > num2) {
				int temp = num1;
				num1 = num2;
				num2 = temp;
			}

			System.out.println("1.오름차순 2.내림차순");
			System.out.println("메뉴선택");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				for(int i = num1; i <= num2; i++) {
					System.out.println(i);
				}
			}else if(menu == 2) {
				for(int i=num2; i>= num1; i--) {
					System.out.println(i);
				}
			}
			
			
//			if (menu == 1) {
//				if (num1 > num2) {
//					for (int i = num2; i <= num1; i++)
//						System.out.println(i);
//				} else {
//					for (int i = num1; i <= num2; i++)
//						System.out.println(i);
//				}
//			} else if (menu == 2) {
//				if (num1 > num2) {
//					for (int i = num1; i >= num2; i--)
//						System.out.println(i);
//				} else {
//					for (int i = num2; i >= num1; i--)
//						System.out.println(i);
//				}
//			}

		}
	}

}
