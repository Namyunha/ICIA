package day7;

public class Calculator {
	int num1;
	int num2;

	public void sum() {
		System.out.println(num1 + num2);
		// 필드 두개를 더한값 출력
	}

	public void sub(int a, int b) {
		System.out.println(a - b);
		// 매개변수로 받은 두수를 뺀 값 출력
	}

	public int mul() {
		return num1 * num2;
		// 필드 두개를 곱한 값을 리턴
	}

	public double div(int a, int b) {
		return a / (double) b;
		// 매개변수로 받은 두수를 나눈 값을 리턴
	}
}
