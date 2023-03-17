package Namyunha;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Shopping {
	private static int number = 0;
	private final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
	
	private int bno;
	private String pw;
	private String title;
	private String writer;
	private int cnt;
	private String postDate;
	private int cell;
	
	public int getCell() {
		return cell;
	}

	public void setCell(int cell) {
		this.cell = cell;
	}

	public Shopping() {
		
	}
	public Shopping(String title,int cnt, int cell) {
		this.bno = ++number;
		this.postDate = DTF.format(LocalDateTime.now());
		this.title = title;
		this.cnt = cnt;
		this.cell = cell;
	}

	public static int getNumber() {
		return number;
	}

	public static void setNumber(int number) {
		Shopping.number = number;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public String getPostDate() {
		return postDate;
	}

	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}
	
	public void print() {
		
		System.out.printf("%d\t%s\t%d\t%d\t%s\n",this.bno,this.title,this.cnt,this.cell,this.postDate);
	}

}
