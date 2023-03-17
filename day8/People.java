package day8;

public class People {
	private String name = "홍길동";
	private int age = 9;
	
	public People () {
	}
	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;  // > 전달자
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void ageUp() {
		this.age++;
	}
	
}
