package day10_1;

public abstract class Salary {
	int salary;

	public abstract void tax();
}

class 정규직 extends Salary {

	@Override
	public void tax() {
		// TODO Auto-generated method stub
		double tax = salary * 0.1;
		System.out.println("정규직 세금은 : " + tax);
	}
}

class 계약직 extends Salary {

	@Override
	public void tax() {
		// TODO Auto-generated method stub
		double tax = salary * 0.033;
		System.out.println("계약직 세금은 : " + tax);
	}

}

// 추상매서드가 있으면 추상클래스릃 해줘야 하고 추상 메서드느 자식 객체에서 무조건 재정의 해줘야 한다.