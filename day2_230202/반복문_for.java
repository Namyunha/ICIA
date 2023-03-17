package day2_230202;

public class 반복문_for {

	public static void main(String[] args) {
		// 1~10까지 출력
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(i);
		}
		// 1~10까지 홀수출력
		for(int i = 1 ; i < 10 ; i=i+2) {
			System.out.println(i);
		}
	// 1~10까지 짝수출력
		for(int i = 2 ; i <= 10 ; i=i+2) {
			System.out.println(i);
		}
	}

}

//for(int i = 0 ; i < 10 ; i++) {
//	System.out.println(i);
//}
//System.out.println("끝");