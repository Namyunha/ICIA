package day10_1;

public class Cat extends Animal {
	String cry;
	String move;
	String food;

	@Override
	public String cry() {
		// TODO Auto-generated method stub
		return cry;
	}
	// 자식객체에서 재정의하고 싶을 떄 추상 메서드를 사용하고 오버라이드함

	@Override
	public String move() {
		// TODO Auto-generated method stub
		return move;
	}

	@Override
	public String food() {
		// TODO Auto-generated method stub
		return food;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(getName() + "/" + cry + "/" + move + "/ ");
	}

}
