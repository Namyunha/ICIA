package day4;

import java.util.Scanner;

public class Ex04_updown {

	public static void main(String[] args) {
		// 문제) 숫자를 계속 입력받으면서 정답을 맞추는 게임
		// 정답이 입력받은 숫자보다 크면 up 출력 작으면 down 출력
		// 정답맞추면 정답! 후 반복문 빠져나오기
		double answer = (int) (Math.random() * 45) + 1;
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		int cnt = 0;
		while (check) {
			System.out.println(answer);
			cnt++;
			System.out.println("정답을입력해주세요 > ");
			int a = sc.nextInt();
         if(cnt <=10) {
				if (a == answer) {
					if (cnt == 1) {
						System.out.println("perfect");
					} else if (cnt <= 3) {
						System.out.println("good");
					} else if (cnt <= 5) {
						System.out.println("clear");
					} else if (cnt <= 10) {
						System.out.println("nomal");
					}
					System.out.println(cnt + "번 만에 성공하셨습니다");
					break;
				} else if (a > answer) {
					System.out.println("down");
				} else if (a < answer) {
					System.out.println("up");
				}
         }else {
         	System.out.println("gameover");
         	break;
         }

		}

	}

}
