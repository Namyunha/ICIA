package day10_1;

public abstract class Animal { // 추상 클래스 추상매서드가 하나이상존재하면 추상클래스
	String name;

	public Animal() {
	}

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public abstract String cry();

	public abstract String move();

	public abstract String food();

	public abstract void print();

}
