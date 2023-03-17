package day7;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Animal a = new Animal();
//		a.test = "test입니다";
//		a.setName("강아지");
//		System.out.println(a.test);
//		System.out.println(a.getName());

		Animal dog = new Animal();
		dog.setName("강아지");
		dog.setSound("멍멍");
		dog.setLeg(4);
		System.out.println(dog.getName() + "/" + dog.getSound() + "/" + dog.getLeg());
		Animal cat = new Animal();
		cat.setName("고양이");
		cat.setSound("야옹");
		cat.setLeg(4);
		System.out.println(cat.getName() + "/" + cat.getSound() + "/" + cat.getLeg());
		Animal chicken = new Animal();
		chicken.setName("닭");
		chicken.setSound("음메");
		chicken.setLeg(2);
		chicken.print();
		System.out.println();
		Animal elephant = new Animal();
		elephant.setName("코끼리");
		elephant.setSound("웨옹");
		elephant.setLeg(4);
	
		elephant.setAeg(4);
		elephant.setAeg(8);
		elephant.getUp();
		elephant.getUp();
		System.out.println("코끼리 나이: "+elephant.getAge());
		dog.getUp();
		System.out.println("강아지 나이: "+dog.getAge());
	}

}
