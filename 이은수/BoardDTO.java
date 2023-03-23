package 이은수;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class BoardDTO {
	private static int number = 100;
	private final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yy/MM/dd");
	private String bno;
	private String title;
	private String writer;
	private String postDate;
	private String content;
	private String nick;
	private String reple;
	private int cnt;

	public BoardDTO() {
		this.bno = "B" + number++;
		this.postDate = DTF.format(LocalDateTime.now());
	}

	public String getReple() {
		return reple;
	}

	public void setReple(String reple) {
		this.reple = reple;
	}

	public int getCnt() {
		return cnt;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getPostDate() {
		return postDate;
	}

	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}

	public void setCnt() {
		this.cnt = cnt + 1;
	}

	public String getBno() {
		return bno;
	}

	public void setBno(String bno) {
		this.bno = bno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	@Override
	public String toString() {
		return bno + "\t\t\t" + title + "\t\t\t" + writer + " \t\t" + postDate+"         ";
	}

}
