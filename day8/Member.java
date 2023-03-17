package day8;

public class Member {
	private int id;
	private String email;
	private String pw;
	private String name;
	private String joinDate;
	
	public Member() {
		
	}
	public Member(int id, String email, String pw, String name, String joinDate) {
		this.id = id;
		this.email = email;
		this.pw = pw;
		this.name = name;
		this.joinDate = joinDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
	
	public void print() {
		System.out.printf("%d\t%s\t%s\t%s\t%s\n",id,email,pw,name,joinDate);
	}
	
}
