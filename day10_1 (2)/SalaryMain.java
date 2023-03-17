package day10_1;

public class SalaryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		정규직 a = new 정규직();
		a.salary = 2000000;
		a.tax();

		계약직 b = new 계약직();
		b.salary = 1500000;
		b.tax();
	}

}
