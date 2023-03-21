package refactoring;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BreakdownDTO {
	private final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yy/MM/dd hh:mm:ss");

	private static int number = 0;
	private String account;
	private String division;
	private long dealMoney;
	private long totalMoney;
	private String dealDate;
	private String arrayNum;

	public BreakdownDTO() {
		this.dealDate = DTF.format(LocalDateTime.now());
		this.arrayNum = account + number++;
	}

	public BreakdownDTO(String account, String division, long dealMoney, long totalMoney) {
		this.account = account;
		this.division = division;
		this.dealMoney = dealMoney;
		this.totalMoney = totalMoney;
		this.dealDate = DTF.format(LocalDateTime.now());
		this.arrayNum = account + number++;
	}

	public String getArraynum() {
		return arrayNum;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public long getDealMoney() {
		return dealMoney;
	}

	public void setDealMoney(long dealMoney) {
		this.dealMoney = dealMoney;
	}

	public long getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(long totalMoney) {
		this.totalMoney = totalMoney;
	}

	@Override
	public String toString() {
		String str = account + "\t\t " + division + "\t\t" + dealMoney + "\t\t" + totalMoney + "\t\t" + dealDate;
		return str;
	}

}
