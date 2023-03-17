package day7;

public class PeopleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People People1 = new People();
		People1.setAge(70);
		People1.ageUp4("-", 51);
		People1.setName("Nam Yun Ha");
		People1.print();
		People People2 = new People("kim");
		
		
		People2.setAge(22);
		People2.ageUp3();
		People2.print();

		People People3 = new People("park", 25);
		People3.ageUp2(3);
		People3.print();
	}

}
