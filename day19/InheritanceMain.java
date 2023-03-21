package day19;

public class InheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClass p1 = new ParentClass();
		p1.name = "name1";
		System.out.println(p1.name);
		p1.hello();

		// 자식 객체
		ChildClass c1 = new ChildClass(); // 자식 객체가 생성될 때 부모객체도 생성
		c1.name = "자식 name1";
		System.out.println(c1.name);
		c1.hello();
		
//		ChildClass c2 = new ParentClass(); // ParentClass가 ChildClass 보다 크기 때문에 강제형변환 없이는 에러가난다.
		ParentClass p2 = new ChildClass();
		ChildClass c2 =(ChildClass) new ParentClass(); // 강제 형변환

	}

}