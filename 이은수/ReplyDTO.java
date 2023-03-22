package 이은수;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReplyDTO {
	private static int number = 0;
	private final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yy/MM/dd hh:mm:ss");
	private String writeTime = DTF.format(LocalDateTime.now());
	private String nick;
	private String content;
	private String writer;
	private int up;
	private int down;
	private String rno;
	private int num;

	ReplyDTO() {
		this.rno = "R" + number++;
		this.writeTime = writeTime;
	}
	
	
	public String getNick() {
		return nick;
	}


	public void setNick(String nick) {
		this.nick = nick;
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

	public int getUp() {
		return up;
	}

	public void setUp() {
		this.up = up++;
	}

	public int getDown() {
		return down;
	}

	public void setDown() {
		this.down = num++;
	}

	public String getRno() {
		return rno;
	}

	public void setRno(String rno) {
		this.rno = rno;
	}
	
	
}
