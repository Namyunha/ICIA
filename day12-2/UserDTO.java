package day12;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UserDTO {
	private final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yy/MM/dd hh:mm:ss");
	private static String Domain = "naver.com";
	private String email;
	private String password;
	private String name;
	private int age;
	private String joinDate;

	public void getDomain() {
		System.out.println(Domain);
	}

	public void setDomain(String domain) {
		this.Domain = email + "@" + domain + ".com";
	}

	public UserDTO() {
		this.joinDate = DTF.format(LocalDateTime.now());
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	@Override
	public String toString() {
		String str = email + "\t" + password + "\t" + name + "\t" + age + "\t" + joinDate;
		return str;
	}

}
