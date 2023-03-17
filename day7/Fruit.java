package day7;

public class Fruit {
	private String name;
	String color;
	boolean isSeed;

	public Fruit() {
		System.out.println("기본생성자");
	}

	public Fruit(String name, String color, boolean isSeed) {
		System.out.println("생성자1");
		this.name = name;
		this.color = color;
		this.isSeed = isSeed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
