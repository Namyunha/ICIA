package day10;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		dog.cry();
		dog.eat();
		dog.drink();

		Cat cat = new Cat();
		cat.cry();
		cat.eat();
		cat.drink();
	}

}

class Animal {
	public void eat() {
		System.out.println("동물이 먹다");
	}

	public void cry() {
		System.out.println("동물이 운다");
	}
}

class Dog extends Animal {
	public void cry() {
		System.out.println("멍멍");
	}

	public void drink() {
		System.out.println("강아지가 마신다.");
	}

}

class Cat extends Animal {
	public void cry() {
		System.out.println("야옹");
	}

	public void drink() {
		System.out.println("고양이가 마신다.");
	}
}




//추상화란 개념,카테고리이다.




