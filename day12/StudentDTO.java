package day12;

import java.text.DecimalFormat;

public class StudentDTO { 
	DecimalFormat df = new DecimalFormat("###.00");
	private static int Number = 100;
	
	private String sno;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int total;
	private double avg;
	private char grade; // 학점
	
	public StudentDTO() {
		this.sno = "S" + ++Number;
	}
	
	public String getSno() {
		return sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
		this.total = kor+eng+mat;
		this.avg = total/(double)3;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
		this.total = kor+eng+mat;
		this.avg = total/(double)3;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
		this.total = kor+eng+mat;
		this.avg = total/(double)3;
	}

	public int getTotal() {
		return total;
	}

	public double getAvg() {
		return avg;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade() {
		if(avg >= 90) {
			this.grade = 'A';
		}else if(avg >= 80){
			this.grade = 'B';
		}else if(avg >= 70){
			this.grade = 'C';
		}else if(avg >= 60){
			this.grade = 'D';
		}else {
			this.grade = 'F';
		}
	}
	
	@Override
	public String toString() {
		String str = sno+"\t"+name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+total+"\t"+df.format(avg)+"\t"+grade;
		return str;
		// 기본적으로 모든 class는 오브젝트를 상속받는다
		// 아무튼 그러니까 오버라이드임
	}
	
}
