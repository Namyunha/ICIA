package 이은수;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class UserDTO {
	BoardRepository br = new BoardRepository();
	private final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yy/MM/dd hh:mm:ss");
	private static int number = 0;
	private static int num = 100;
	private int firstNum;
	private int lastNum;
	private String uno;
	private String name;
	private String id;
	private String pw;
	private String pNum;
	private String joinDate = DTF.format(LocalDateTime.now());
	private String nickname;
	private String bno;
	private int phone;
//	private BoardDTO board;

	public UserDTO() {
		this.uno = "U" + ++number;
		this.joinDate = joinDate;
	}

	public UserDTO(String name, String id, String pw, String pNum) {
		this.uno = "U" + number++;
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.joinDate = joinDate;
	}

	public String getBno() {
		return bno;
	}

	public void setBno(String bno) {
		this.bno = bno;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

//	public BoardDTO getBoard() {
//		return board;
//	}
//
//	public void setBoard(BoardDTO board) {
//		this.board = board;
//	}

	public UserDTO(String id, String pw) {
		this.id = id;
		this.pw = pw;
		this.joinDate = joinDate;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getFirstNum() {
		return firstNum;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public int getLastNum() {
		return lastNum;
	}

	public void setLastNum(int lastNum) {
		this.lastNum = lastNum;
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

	public String getpNum() {
		return pNum;
	}

	public void setpNum(int first, int last) {
		this.pNum = first + "-" + last;
	}

	public static DateTimeFormatter getDtf() {
		return DTF;
	}

	@Override
	public String toString() {
		return uno + "\t" + name + "\t" + pNum + "\t" + id + "\t" + pw + "\t" + phone + "\t\t" + joinDate;

	}
}
