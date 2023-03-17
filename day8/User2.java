package day8;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class User2 {
	private String name;
	private String id;
	private String pw;
	private String joinDate;

	public User2() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
		this.joinDate = dtf.format(LocalDateTime.now());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	public void print() {
		System.out.printf("%s\t%s\t%s\t%s\n", name, id, pw, joinDate);
	}

}
