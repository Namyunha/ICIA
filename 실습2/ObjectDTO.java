package 실습2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ObjectDTO {
	private String OName;// 상품이름
	private int ea;// 수량
	private static int number = 100;// 품번
	private int cell;
	private final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
	private String Rdate;
	private String Onumber;

	public ObjectDTO() {
		number++;
		this.Onumber = "O" + number;
		this.Rdate = DTF.format(LocalDateTime.now());
	}

	public String getOName() {
		return OName;
	}

	public void setOName(String oName) {
		OName = oName;
	}

	public int getEa() {
		return ea;
	}

	public void setEa(int ea) {
		this.ea = ea;
	}

	public static int getNumber() {
		return number;
	}

	public static void setNumber(int number) {
		ObjectDTO.number = number;
	}

	public int getCell() {
		return cell;
	}

	public void setCell(int cell) {
		this.cell = cell;
	}

	public String toString() {
		return Onumber + OName + ea + cell + Rdate;
	}

}
