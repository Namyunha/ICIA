package day10;

public class PersonName {
	public static void main(String[] args) {
		Student s = new Student("홍길동", 99, false, "S100");
	}
}


class Person {
	String name;
	int age;
	boolean isFull;

	public Person() {

	}

	public Person(String name, int age, boolean isFull) {

	}
	
}

class Student extends Person {
	String sno;

	public Student() {
//		super("", 11, true);
		System.out.println("Student기본생성자");
	}

	public Student(String name, int age, boolean isFull, String sno) {
		super("", 11, true);
		System.out.println("Student생성자3");
	}
}






//   부모 생성자 호출(모든 객체는 생성자를 호출해야만 생성된다)
// - 자식객체를 생성하면 부모객체가 먼저 생성되고 자식 객체가 생성.
// - 부모생성자는 자식 생성자 맨 첫줄에서 호출




