package day7;

public class Car {
	String name;
	String tire;
	String color;
	int speed;
	// 필드
	
	
	public void print() {
		System.out.println(name + "=" + tire + "=" + color + "=" + speed);
	}
	// 메서드 print 만들기
	// 기능 : sysout 해주기
	// return 값이 없을 때에는 void (void 자리에 return 값이 들어가야 함)
	// 매게변수는 넘겨줄 데이터
	
	public void speedRun(int s) {
		System.out.println(name+" speedRun메소드 호출됨");
		speed = speed + s;
	}
	public String getColor() {
		return  color;
	}
}
