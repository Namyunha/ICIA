package day9;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Board {
	private static int number = 0;
	private final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yyyy년MM월dd일 hh:mm:ss");
	// final붙으면 상수 > final이 붙으면 변경불가능하다 , final static은 공유되지만 변하지 않는다. > 모든 클래스마다 값이 정해진다.
	private String pw;
	private String title;
	private String writer;
	private int bno;
	private int cnt;
	private String postDate;

	public Board() {
		this.bno = ++number;
		this.cnt = 0;
		this.postDate = DTF.format(LocalDateTime.now());
	}

	public Board(String pw, String title, String writer) {
		this.bno = ++number;
		this.pw = pw;
		this.title = title;
		this.writer = writer;
		this.cnt = 0;
		this.postDate = DTF.format(LocalDateTime.now());
	}

	public int getBno() {
		return this.bno;
	}

	public String getPw() {
		return this.pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return this.writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public void increaseCnt() {
		this.cnt++;
	}

	public void print() {
		System.out.printf("%d\t%s\t%s\t%d\t%s\n", bno, title, writer, cnt, postDate);
	}

}
