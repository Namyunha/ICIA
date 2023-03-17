package day10;

public class FruitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit2 f = new Fruit2();
		f.name = "사과";
		f.isSeed = true;
		f.color = "black";
		f.removeSeed();
		f.colorChange("red");
		System.out.println(f.name + "/" + f.isSeed + "/" + f.color);
	}

}

class Fruit {
	String name;
	boolean isSeed;
	String color;

	public void removeSeed() {
		isSeed = false;
	}
}

class Fruit2 extends Fruit {
	public void colorChange(String color) {
		this.color = color;
	}
}

// 상속 = 확장	 > extends 사용 