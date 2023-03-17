package day7;

public class Animal {
	String test;

	private String name;
	private String sound;
	private int leg;
	private int age;
	// private같은 클래스에서만 접근할 수 있게 함
	// 외부에서 접근하지 못하게 막아야할 때 쓴다.- 보호기능
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	public int getLeg() {
		return leg;
	}
	public void setLeg(int leg) {
		this.leg = leg;
	}
	public int getAge() {
		return age;
	}
	public void setAeg(int age) {
		this.age = age;
	}
	public void getUp() {
		System.out.println("나이를 한 살 먹었습니다.");
		age+=1;
	}
	
	public void print() {
		System.out.printf("다리가 %d개인 %s는 %s웁니다.", leg, name, sound);
	}
}














