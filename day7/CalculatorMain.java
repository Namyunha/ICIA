package day7;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();

		cal.num1 = 19;
		cal.num2 = 8;
		// 더하기, 빼기, 곱하기 ,나누기 값출력
		cal.sum();
		System.out.println(cal.mul());
		cal.sub(4, 2);
		System.out.println(cal.div(10, 3));

	}
}
