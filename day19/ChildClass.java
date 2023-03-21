package day19;

public class ChildClass extends ParentClass {
	public ChildClass() {
		System.out.println("자식 클래스 생성");
	}
	
	// hello 재정의
	public void hello() {
		System.out.println("자식 hello");
	}
	// hi

	@Override
	public void hi() {
		System.out.println("자식 hi");
	}
}
