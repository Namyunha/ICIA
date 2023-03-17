package day13;

public class 다형성 {
	public static void main(String[] args) {
		Animal a = new Dog();
		
		a.cry();
		a.eat();
		//	부모 클레스에 자식생성자로 생성할 수 있는 것이 다형성이다
		// 오버라이딩 된 것만 자식의 것을 사용할 수 있다.
		
	}
	// 인터페이스 
	public static void test(Animal a) {
		a.cry();
	}
}

class Animal {
	public void eat() {
		System.out.println("먹다.");
	}

	public void cry() {
		System.out.println("울다.");
	}
	public void run() {
		System.out.println("걷다");
	}
}

class Dog extends Animal {
	public void cry() {
		System.out.println("멍멍");
	}
}

class Cat extends Animal {
	public void cry() {
		System.out.println("야옹");
	}
}