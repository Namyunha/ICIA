package day7;

public class FruitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit apple = new Fruit();//생성자
		apple.setName("사과");
		apple.color = "빨강";
		apple.isSeed = true;
		
		Fruit apple1 = new Fruit("사과", "빨강", true);
		System.out.println(apple.getName()+apple1.color+apple1.isSeed);
		
		Fruit banana = new Fruit();
		banana.setName("바나나");
		banana.color = "노랑";
		banana.isSeed = false;
		
		Fruit melon = new Fruit();
		
		melon.setName("멜론");
		melon.color = "초록";
		melon.isSeed = true;
		
		Fruit orange = new Fruit("오렌지", "주황", true);
		System.out.println(orange.getName()+orange.color+orange.isSeed);
		System.out.println(melon.getName()+melon.color+melon.isSeed);
	}

}
