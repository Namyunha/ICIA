package day14;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BoardDTO2 {
	// 데이터를 담아놓는 곳 class를 DTO , VO 라고 한다
	private static int number = 100;
	private static int num = 0;
	private final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yy/MM/dd hh:mm:ss");
	private String bno;
	private String title;
	private String writer;
	private int cnt;
	private String postDate;
	private int arrayNum;

	public BoardDTO2() {
		this.arrayNum = num++;
		this.bno = "B" + number++;
		this.postDate = DTF.format(LocalDateTime.now());
	}

	public int getArrayNum() {
		return arrayNum;
	}

	public String getBno() {
		return bno;
	}

	public String getTitle() {
		return title;
	}

	public void setBno(String bno) {
		this.bno = bno;
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

	public void increaseSetCnt() {
		this.cnt = cnt + 1;
	}

	public String getPostDate() {
		return postDate;
	}

	public void print() {
		System.out.printf("%s\t%s\t%s\t%d\t%s\n", bno, title, writer, cnt, postDate);
	}
}