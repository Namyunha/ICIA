package day10_2;

public class Teacher extends Person{
	private static int number = 100;
	
	private String tno;
	private int salary;
	private int p = 30000;
	private int studentCnt;
	
	public Teacher() {
		this.tno = "T"+number++;
	}
	public String getTno() {
		return tno;
	}
	public void setSalary() {
		this.salary = p * studentCnt;
	}
	public void setStudentCnt() {
		studentCnt++;
	}
	
	public void print() {
		System.out.printf("%s\t%s\t%c\t%s\t%s\t%d\n",getId(),getName(),getGender(),getBirthday(),tno,salary);
	}
	
	
}
