package day10_1;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		dog.name = "강아지";
		dog.cry = "멍멍";
		dog.move = "성큼성큼";
		dog.food = "뼈다귀";

		Cat cat = new Cat();
		cat.name = "고양이";
		cat.cry = "야옹";
		cat.move = "사뿐사뿐";
		cat.food = "생선";

		Bird bird = new Bird();
		bird.name = "새";
		bird.cry = "짹짹";
		bird.move = "펄럭펄럭";
		bird.food = "애벌래";

		dog.print();
		cat.print();
		bird.print();
	}

}
