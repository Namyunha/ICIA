package 실습;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class VisitorDTO {
	public final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
	private String id;
	private String password;
	private String name;
	private int age;
	private int point;

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	private String joinDate;

	public VisitorDTO() {
		this.joinDate = DTF.format(LocalDateTime.now());
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public VisitorDTO(String id, String password, String name, int age) {
		this();
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + " \t " + id + " \t " + password + " \t " + age + " \t " + joinDate;
	}
}
