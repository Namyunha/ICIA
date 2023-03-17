package day13;

import java.util.*;

public class ClientRepository {
	private static ClientRepository repository = new ClientRepository();

	private ClientRepository() {
	}

	public static ClientRepository getInstance() {
		return repository;
	}

	List<ClientDTO> cList = new ArrayList<>();
	// 회원가입 할때 넣기
	List<BreakdownDTO> bList = new ArrayList<>();
	// 회원가입한 유저가 거래할 때 넣기
//	public List<UserDTO> list() {
//		return list;
//	}

	public boolean save(ClientDTO clientDTO) {
		return cList.add(clientDTO);
	}

	public boolean loginCheck(String id, String pw) {
		for (ClientDTO c : cList) {
			if (id.equals(c.getId()) && pw.equals(c.getPassword())) {
				c.setBalance(c.getBalance());
				return true;
			}
		}
		return false;
	}

	public List<ClientDTO> findAll() {
		return cList;
	}

	public List<BreakdownDTO> breakList(String account) {
		List<BreakdownDTO> list = new ArrayList<>();
		for (BreakdownDTO b : bList) {
			if (b.getAccount().equals(account)) {
				list.add(b);
			}
		}
		return list;
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

	public boolean transferCheck(String transferAccount) {
		for(ClientDTO c : cList) {
			if(c.getAccount().equals(transferAccount)) {
				return true;
			}
		}
		return false;
	}
	
	public ClientDTO findById(String id, String password) {
		for (ClientDTO c : cList) {
			if (c.getId().equals(id) && c.getPassword().equals(password)) {
				return c;
			}
		}
		return null;
	}

	public void update(String id, String password, String updatePassword) {
		for (ClientDTO c : cList) {
			if (c.getId().equals(id) && c.getPassword().equals(password)) {
				c.setPassword(updatePassword);
			}
		}
	}

	public String getAccount(String loginId, String loginPw) {
		for (ClientDTO c : cList) {
			if (c.getId().equals(loginId) && c.getPassword().equals(loginPw)) {
				return c.getAccount();
			}
		}
		return null;
	}

	public boolean deposit(String acoount, long money) {
		for (ClientDTO c : cList) {
			if (c.getAccount().equals(acoount)) {
				c.setBalance(c.getBalance() + money);
				BreakdownDTO breakdownDTO = new BreakdownDTO();
				breakdownDTO.setAccount(acoount);
				breakdownDTO.setDivision("입금");
				breakdownDTO.setDealMoney(money);
				breakdownDTO.setTotalMoney(c.getBalance());
				bList.add(breakdownDTO);
				return true;
			}
		}
		return false;
	}

	public boolean moneyCheck(long money) {
		for (ClientDTO c : cList) {
			if (c.getBalance() >= money) {
				return true;
			}
		}
		return false;
	}

	public void withdraw(long money, String account) {
		for (ClientDTO c : cList) {
			if (c.getAccount().equals(account)) {
				c.setBalance(c.getBalance() - money);
				BreakdownDTO breakdownDTO = new BreakdownDTO();
				breakdownDTO.setAccount(account);
				breakdownDTO.setDivision("출금");
				breakdownDTO.setDealMoney(money);
				breakdownDTO.setTotalMoney(c.getBalance());
				bList.add(breakdownDTO);
			} else {
				System.out.println("계좌가 잘못되었습니다.");
			}
		}
	}
	public boolean withdraw2(long money, String account) {
		for (ClientDTO c : cList) {
			if (c.getAccount().equals(account)) {
				c.setBalance(c.getBalance() - money);
				BreakdownDTO breakdownDTO = new BreakdownDTO();
				breakdownDTO.setAccount(account);
				breakdownDTO.setDivision("출금");
				breakdownDTO.setDealMoney(money);
				breakdownDTO.setTotalMoney(c.getBalance());
				bList.add(breakdownDTO);
				return true;
			} else {
				System.out.println("계좌가 잘못되었습니다.");
			}
		}
		return false;
	}

	public boolean delete(String id, String pw) {
		for (ClientDTO c : cList) {
			if (id.equals(c.getId()) && pw.equals(c.getPassword())) {
				cList.remove(c);
				return true;
			}
		}
		return false;
	}

}
