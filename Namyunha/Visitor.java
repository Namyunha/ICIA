package Namyunha;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Visitor {
	private String name;
	private String id;
	private String pw;
	private String phone;
	private static int number = 0;
	private final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yyyy년MM월dd일 hh:mm:ss");
	private int vno;
	private int cnt;
	private String joinDate;

	public Visitor() {
		this.vno = ++number;
		this.cnt = 0;
		this.joinDate = DTF.format(LocalDateTime.now());
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt() {
		this.cnt++;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(List<Visitor> list, int max) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			boolean find = false;
			String id = sc.next();
			if (id.length() > max) {
				System.out.print("아이디는" + max + "글자 이상 사용 불가!\n다시입력 >");
				find = true;
			}
			for (Visitor s : list) {
				if (s.getId().equals(id)) {
					System.out.println("중복된 아이디입니다\n다시입력 >");
					find = true;
				}

			}
			if (!find) {
				this.id = id;
				break;
			}
		}
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public void print() {

		System.out.printf("%s\t%s\t%s\t%d\t%s\t%s\t%d\n", name, id, pw, vno, phone, joinDate, cnt);
	}
}
