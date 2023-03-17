package day9;

public class Student {
	private static int num = 100;

	private String sno;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int total;
	private double avg;
	private char grade;

	public Student() {
		this.sno = "S" + num++;
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
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal() {
		this.total = kor + eng + mat;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg() {
		this.avg = (kor + eng + mat) / (double) 3;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade() {
		char grade = ' ';
		if (this.avg >= 90) {
			grade = 'A';
		} else if (this.avg >= 80) {
			grade = 'B';
		} else if (this.avg >= 70) {
			grade = 'C';
		} else if (this.avg >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		this.grade = grade;
	}

	public void print() {
		System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.2f\t%c\n", sno, name, kor, eng, mat, total, avg, grade);
	}
}
