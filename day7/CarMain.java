package day7;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		Car c2 = new Car();

		c1.name = "그랜져";
		c1.tire = "한국";
		c1.color = "빨강";
		c1.speed = 10;
		
		
		
		c2.name = "제네시스";
		c2.tire = "넥센타이어";
		c2.color = "검정";
		c2.speed = 20;
		
		
		
		c1.speedRun(100);
		c2.speedRun(100);
		
		c1.print();
		c2.print();
		
		System.out.println(c1.getColor());
		System.out.println(c2.getColor());
		String str = c1.getColor();
		String str2 = c2.getColor();
		
	}

}
