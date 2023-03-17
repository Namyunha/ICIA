package day10_2;

public class Person {
	private static int number = 1000;
	
	private String id; // 주민등록 번호
	private String name;
	private char gender;
	private String birthday;
	
	public Person(){
		
	}
	public String getid() {
		return id;
	}
	public void setId() {
		if(!(gender == 0 || birthday == null)) {
			int firstNo = (gender == 'M')? 1:2; //삼항 연산자의 식은 = (조건식) ? _ : _
			int random = ((int)Math.random()*9)+1; //랜덤 수를 넣는 식
			this.id = birthday+"-"+firstNo+number+++random;
		}
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getBirthday(){
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
}