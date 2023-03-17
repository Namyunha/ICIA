package day5;

import java.util.Scanner;

public class 배열예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제) 문자열 배열에 문자열 5개를 할당하고, 전체 출력
//		String[] name = new String[5];
//		name[0] = "남윤하";
//		name[1] = "이순신";
//		name[2] = "감강찬";
//		name[3] = "김좌진";
//		name[4] = "다오";
//		System.out.println(name[0]);
//		System.out.println(name[1]);
//		System.out.println(name[2]);
//		System.out.println(name[3]);
//		System.out.println(name[4]);
//
//		String[] BTS = { "진", "슈가", "RM", "제이홉", "뷔", "정국", "지민" };
//
//		for (int i = 0; i < BTS.length; i++) {
//			System.out.println(BTS[i]);
//		}
//
//		String[] str = { "안녕", "하세요", "반가", "워요", "잘있어요" };
//		System.out.println(str.length);
//		for (int i = 0; i < str.length; i++) {
//			System.out.println(str[i]);
//		}

//		 문제) int 배열 10칸에 값을 할당하고, 총 합 출력

//		System.out.println(sum);

//		문제) 짝수값만 더하기

//		int sum = 0;
//		int[] num = { 1, 2, 1, 4, 1, 6, 1, 8, 1, 10 };
//		for (int i = 0; i < num.length; i++) {
//			if (num[i] % 2 == 0) {
//				sum += num[i];
//			}
//
//		}
//		System.out.println(sum);

//		int[] num = new int[100];
//		for (int i = 0; i < num.length; i++) {
//			num[i] = i+1;
//		}
//		for(int i=0; i<num.length; i++) {
//			System.out.println(num[i]);
//		}

//		Scanner sc = new Scanner(System.in);
//		
//		int[] num = new int [10];
//		for (int i = 0; i<num.length; i++) {
//			System.out.println("숫자입력 > ");
//			int a = sc.nextInt();
//			num[i] = a;
//		}
//		for(int i=0; i<num.length; i++) {
//			System.out.println(num[i]);
//		}

		// 문제 10칸 짜리 정수배열 선언 후 값을 입력받는데, 값이 3의 배수의 합 출력
//		Scanner sc = new Scanner(System.in);
//		int[] num = new int[10];
//		int cnt35 = 0;
//		int cnt3 = 0;
//		int cnt5 = 0;
//		int sum35 = 0;
//		for (int i = 0; i < num.length; i++) {
//			System.out.print((i + 1) + "번째 숫자입력 > ");
//			num[i] = sc.nextInt();

//			if (num[i] % 3 == 0 && num[i] % 5 == 0) {
//				sum35 = sum35 + num[i];
//				cnt35++;
//				cnt3++;
//				cnt5++;
//			} else if (num[i] % 3 == 0) {
//				sum35 = sum35 + num[i];
//				cnt3++;
//			} else if (num[i] % 5 == 0) {
//				sum35 = sum35 + num[i];
//				cnt5++;
//			}
//			if (num[i] % 3 == 0 && num[i] % 5 == 0) {
//				sum35 = sum35 + num[i];
//				cnt35++;
//			}
//			if (num[i] % 3 == 0) {
//				sum35 = sum35 + num[i];
//				cnt3++;
//			}
//			if (num[i] % 5 == 0) {
//				sum35 = sum35 + num[i];
//				cnt5++;
//			}

//		}
//		System.out.println("3의배수는" + cnt3 + "개");
//		System.out.println("5의배수는" + cnt5 + "개");
//		System.out.println("3또는 5의배수는" + cnt35 + "개");
//		System.out.println("합계는" + sum35);

//		}
//		문제) 10칸의 정수배열을 만들고, 반복하면서 입력을 받는데 짝수만 배열에 저장 후 출력

//		int cnt = 0;
//		int all = 0;
//		while (true) {
//
//			if (cnt > 9) {
//				System.out.println("game over");
//				break;
//			}
//			System.out.print("숫자를 입력해주세요 > ");
//			all++;
//			int a = sc.nextInt();
//			if (a == 0) {
//				cnt = cnt;
//				System.out.println(cnt + "번 째 짝수입니다");
//				continue;
//			}
//			if (a % 2 == 0) {
//				cnt++;
//				for (int i = 0; i < num.length; i++) {
//					num[i] = a;
//				}
//			} else {
//			}
//
//			System.out.println(cnt + "번 째 짝수입니다");
//		}
//		System.out.println(all + "번입력했습니다.");

//		int j = 0;
//
//		while (j >= 10) {
//			System.out.println("숫자입력 > ");
//			int number = sc.nextInt();
//			if (number % 2 == 0) {
//				num[j] = number;
//				j++;
//			}
//		}
//		for (int i = 0; i < num.length; i++) {
//			System.out.println(num[i]);
//		}
		// 문제) 배열 num의 값을 앞으로 한칸씩 당기시오
		Scanner sc = new Scanner(System.in);

		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int lastNum = num[num.length-1];
		
		for(int i = num.length-1; i>=0; i--) {
			if(i==0) {
				num[i] = lastNum;
			} else {
				num[i] = num[i-1];
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}
}










