package 이은수;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BoardDTO {
	private static int number = 100;
	private final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yy/MM/dd");
	private String bno;
	private String title;
	private String writer;
	private String postDate;
	private int cnt;

	public BoardDTO() {
		this.bno = "B" + number++;
		this.postDate = DTF.format(LocalDateTime.now());
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
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

	@Override
	public String toString() {
		return bno + "\t\t\t" + title + "\t\t\t" + writer + " \t" + postDate;
	}

}
