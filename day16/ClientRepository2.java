package day16;

import java.util.*;

public class ClientRepository2 {
	Map<Integer, ClientDTO2> cMap = new HashMap<>();
	private static ClientRepository2 repository = new ClientRepository2();

	private ClientRepository2() {
	}

	public static ClientRepository2 getInstance() {
		return repository;
	}

	List<ClientDTO2> cList = new ArrayList<>();
	// 회원가입 할때 넣기
//	List<BreakdownDTO2> bList = new ArrayList<>();
	Map<Integer, BreakdownDTO2> bMap = new HashMap<>();
	// 회원가입한 유저가 거래할 때 넣기
//	public List<UserDTO> list() {
//		return list;
//	}

	public boolean save(ClientDTO2 clientDTO) {
//		return cList.add(clientDTO);
		cMap.put(clientDTO.getArraynum(), clientDTO);
		System.out.println("계좌번호\t\tID\tPW\t이름\t잔액\t가입일");
		System.out.println(cMap.get(clientDTO.getArraynum()));
		return true;
	}

	public Map<Integer, BreakdownDTO2> searchList(String account) {
		for (Integer key : bMap.keySet()) {
			if (bMap.get(key).getAccount().equals(account)) {
				return this.bMap;
			}
		}
		return null;
	}

//	public boolean loginCheck(String id, String pw) {
//		for (ClientDTO2 c : cList) {
//			if (id.equals(c.getId()) && pw.equals(c.getPassword())) {
//				c.setBalance(c.getBalance());
//				return true;
//			}
//		}
//		return false;
//	} 이건 arraylist 한거

	public boolean loginCheck(String id, String pw) {
		for (Integer key : cMap.keySet()) {
			if (id.equals(cMap.get(key).getId()) && pw.equals(cMap.get(key).getPassword())) {
				return true;
			}
		}
		return false;
	}

//	public List<ClientDTO2> findAll() {
//		return cList;
//	}
	public Map<Integer, ClientDTO2> findAll() {
		return cMap;
	}

//	public List<BreakdownDTO2> breakList(String account) {
//		List<BreakdownDTO2> list = new ArrayList<>();
//		for (BreakdownDTO2 b : bList) {
//			if (b.getAccount().equals(account)) {
//				list.add(b);
//			}
//		}
//		return list;
//	}

//	public Map<Integer, BreakdownDTO2> breakList2(String account) {
//		for (Integer key : bMap.keySet()) {
//			if (bMap.get(key).getAccount().equals(account)) {
//				bMap.put(key, bMap.get(key));
//			}
//		}
//		return bMap;
//	}

	public Map<Integer, BreakdownDTO2> breakList2(String account) {
		for (Integer key : bMap.keySet()) {
			if (bMap.get(key).getAccount().equals(account)) {
				return bMap;
			}
		}
		return null;
	}

//	public void transferMy(long money, String account) {
//		for (ClientDTO c : cList) {
//			if (c.getAccount().equals(account)) {
//				c.setBalance(c.getBalance() + money);
//				BreakdownDTO breakdownDTO = new BreakdownDTO();
//				breakdownDTO.setAccount(account);
//				breakdownDTO.setDivision("출금");
//				breakdownDTO.setDealMoney(money);
//				breakdownDTO.setTotalMoney(c.getBalance());
//				bList.add(breakdownDTO);
//			} else {
//				System.out.println("계좌가 잘못되었습니다.");
//			}
//		}
//	}

//	public boolean transferCheck(String transferAccount) {
//		for (ClientDTO2 c : cList) {
//			if (c.getAccount().equals(transferAccount)) {
//				return true;
//			}
//		}
//		return false;
//	}

//	public ClientDTO2 findById(String id, String password) {
//		for (ClientDTO2 c : cList) {
//			if (c.getId().equals(id) && c.getPassword().equals(password)) {
//				return c;
//			}
//		}
//		return null;
//	} ArrayList 버젼
	public ClientDTO2 findById(String id, String password) {
		for (Integer key : cMap.keySet()) {
			if (id.equals(cMap.get(key).getId()) && password.equals(cMap.get(key).getPassword()))
				return cMap.get(key);
		}
		return null;
	}

//	public void update(String id, String password, String updatePassword) {
//		for (ClientDTO2 c : cList) {
//			if (c.getId().equals(id) && c.getPassword().equals(password)) {
//				c.setPassword(updatePassword);
//			}
//		}
//	} ArrayList 버젼

	public void update(String id, String pw, String uPw) {
		for (Integer key : cMap.keySet()) {
			if (cMap.get(key).getId().equals(id) && cMap.get(key).getPassword().equals(pw)) {
				cMap.get(key).setPassword(uPw);
			}
		}
	}

//	public String getAccount(String loginId, String loginPw) {
//		for (ClientDTO2 c : cList) {
//			if (c.getId().equals(loginId) && c.getPassword().equals(loginPw)) {
//				return c.getAccount();
//			}
//		}
//		return null;
//	}

//	public boolean deposit(String acoount, long money) {
//		for (ClientDTO2 c : cList) {
//			if (c.getAccount().equals(acoount)) {
//				c.setBalance(c.getBalance() + money);
//				BreakdownDTO2 breakdownDTO = new BreakdownDTO2();
//				breakdownDTO.setAccount(acoount);
//				breakdownDTO.setDivision("입금");
//				breakdownDTO.setDealMoney(money);
//				breakdownDTO.setTotalMoney(c.getBalance());
//				bList.add(breakdownDTO);
//				return true;
//			}
//		}
//		return false;
//	} Array list 버젼
	public String getAccount(String loginId, String loginPw) {
		for (Integer key : cMap.keySet()) {
			if (loginId.equals(cMap.get(key).getId()) && loginPw.equals(cMap.get(key).getPassword())) {
				return cMap.get(key).getAccount();
			}
		}
		return null;
	}

//	public void deposit(String acoount, long money) {
//		for (Integer key : cMap.keySet()) {
//			if (cMap.get(key).getAccount().equals(acoount)) {
//				cMap.get(key).setBalance(cMap.get(key).getBalance() + money);
//				BreakdownDTO2 breakdownDTO = new BreakdownDTO2();
//				breakdownDTO.setAccount(acoount);
//				breakdownDTO.setDivision("입금");
//				breakdownDTO.setDealMoney(money);
//				breakdownDTO.setTotalMoney(cMap.get(key).getBalance());
//				bList.add(breakdownDTO);
//			}
//		}
//
//	}

	public void deposit(String acoount, long money) {
		for (Integer key : cMap.keySet()) {
			if (cMap.get(key).getAccount().equals(acoount)) {
				cMap.get(key).setBalance(cMap.get(key).getBalance() + money);
				BreakdownDTO2 breakdownDTO = new BreakdownDTO2();
				breakdownDTO.setAccount(acoount);
				breakdownDTO.setDivision("입금");
				breakdownDTO.setDealMoney(money);
				breakdownDTO.setTotalMoney(cMap.get(key).getBalance());
				bMap.put(breakdownDTO.getArraynum(), breakdownDTO);
			}
		}

	}

//	public boolean moneyCheck(long money) {
//		for (ClientDTO2 c : cList) {
//			if (c.getBalance() >= money) {
//				return true;
//			}
//		}
//		return false;
//	}
//
//	public void withdraw(long money, String account) {
//		for (ClientDTO2 c : cList) {
//			if (c.getAccount().equals(account)) {
//				c.setBalance(c.getBalance() - money);
//				BreakdownDTO2 breakdownDTO = new BreakdownDTO2();
//				breakdownDTO.setAccount(account);
//				breakdownDTO.setDivision("출금");
//				breakdownDTO.setDealMoney(money);
//				breakdownDTO.setTotalMoney(c.getBalance());
//				bList.add(breakdownDTO);
//			} else {
//				System.out.println("계좌가 잘못되었습니다.");
//			}
//		}
//	} arrayList 버젼

	public boolean moneyCheck(long money) {
		for (Integer key : cMap.keySet()) {
			if (cMap.get(key).getBalance() >= money)
				return true;
		}
		return false;
	}

	public void withdraw(long money, String account) {
		for (Integer key : cMap.keySet()) {
			if (account.equals(cMap.get(key).getAccount())) {
				cMap.get(key).setBalance(cMap.get(key).getBalance() - money);
				BreakdownDTO2 breakdownDTO = new BreakdownDTO2();
				breakdownDTO.setAccount(account);
				breakdownDTO.setDivision("출금");
				breakdownDTO.setDealMoney(money);
				breakdownDTO.setTotalMoney(cMap.get(key).getBalance());
				bMap.put(breakdownDTO.getArraynum(), breakdownDTO);
			} else {
				System.out.println("계좌가 잘못되었습니다.");
			}
		}

	}

//	public boolean withdraw2(long money, String account) {
//		for (ClientDTO2 c : cList) {
//			if (c.getAccount().equals(account)) {
//				c.setBalance(c.getBalance() - money);
//				BreakdownDTO2 breakdownDTO = new BreakdownDTO2();
//				breakdownDTO.setAccount(account);
//				breakdownDTO.setDivision("출금");
//				breakdownDTO.setDealMoney(money);
//				breakdownDTO.setTotalMoney(c.getBalance());
//				bList.add(breakdownDTO);
//				return true;
//			} else {
//				System.out.println("계좌가 잘못되었습니다.");
//			}
//		}
//		return false;
//	}

//	public boolean delete(String id, String pw) {
//		for (ClientDTO2 c : cList) {
//			if (id.equals(c.getId()) && pw.equals(c.getPassword())) {
//				cList.remove(c);
//				return true;
//			}
//		}
//		return false;
//	} arrayList
	public boolean delete(String id, String pw) {
		for (Integer key : cMap.keySet()) {
			if (id.equals(cMap.get(key).getId()) && pw.equals(cMap.get(key).getPassword())) {
				cMap.remove(key);
				return true;
			}
		}
		return false;
	}

	public ClientDTO2 searchName(String name) {
		for (Integer key : cMap.keySet()) {
			if (name.equals(cMap.get(key).getName())) {
				return cMap.get(key);
			}
		}
		return null;
	}

	public ClientDTO2 searchDTO(String name, String id) {
		for (Integer key : cMap.keySet()) {
			if (cMap.get(key).getName().equals(name) && cMap.get(key).getId().equals(id)) {
				return cMap.get(key);
			}
		}
		return null;
	}

	// transfer
	public ClientDTO2 loginUser(String loginId, String loginPw) {
		for (Integer key : cMap.keySet()) {
			if (loginId.equals(cMap.get(key).getId()) && loginPw.equals(cMap.get(key).getPassword())) {
				return cMap.get(key);
			}
		}
		return null;
	}

	public ClientDTO2 dUser(String dAccount) {
		for (Integer key : cMap.keySet()) {
			if (dAccount.equals(cMap.get(key).getAccount())) {
				return cMap.get(key);
			}
		}
		return null;
	}

}
