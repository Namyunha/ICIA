package day10;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SportCar scar = new SportCar();
		scar.run();
		scar.run1();
		System.out.println(scar.speed);
	}

}

class Car {
	String color;
	String tire;
	int speed;

	public void run() {
		System.out.println("Car run 메소드");
		this.speed++;
	}

}

class SportCar extends Car {
	String engine;

	public void run() {
		System.out.println("SportCar run 메소드");
		this.speed += 2;
	}

	public void run1() {
		System.out.println("SportCar run 메소드2");
		this.speed += 4;
	}
}

// 같은 클래스내에서 매개변수달리해서 정의 overloading
// 부모의 매서드를 다시 정의하고 싶을 때 하는 것이다. overwriting
// overwriting를 할 때에는 선언부가 동일해야 한다. 
// overwriting은 자식입장에서 재정의 하는 것이다.