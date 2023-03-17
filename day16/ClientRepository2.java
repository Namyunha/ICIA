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
	Map<String, BreakdownDTO2> bMap = new HashMap<>();

	public boolean save(ClientDTO2 clientDTO) {
		cMap.put(clientDTO.getArraynum(), clientDTO);
		System.out.println("계좌번호\t\tID\tPW\t이름\t잔액\t가입일");
		System.out.println(cMap.get(clientDTO.getArraynum()));
		return true;
	}

	public Map<String, BreakdownDTO2> searchList(String account) {
		Map<String, BreakdownDTO2> map = new HashMap<>();
		for (String key : bMap.keySet()) {
			if (bMap.get(key).getAccount().equals(account)) {
				map.put(key, bMap.get(key));
			}
		}
		return map;
	}

	public boolean duCheck(String id) {
		for (Integer key : cMap.keySet()) {
			if (id.equals(cMap.get(key).getId())) {
				return true;
			}
		}
		return false;
	}

	public boolean loginCheck(String id, String pw) {
		for (Integer key : cMap.keySet()) {
			if (id.equals(cMap.get(key).getId()) && pw.equals(cMap.get(key).getPassword())) {
				return true;
			}
		}
		return false;
	}

	public Map<Integer, ClientDTO2> findAll() {
		return cMap;
	}

	public Map<Integer, ClientDTO2> searchPw(String pw) {
		Map<Integer, ClientDTO2> aMap = new HashMap<>();
		for (Integer key : cMap.keySet()) {
			if (pw.equals(cMap.get(key).getPassword())) {
				aMap.put(key, cMap.get(key));
			}
		}
		return aMap;
	}

	public Map<Integer, ClientDTO2> findName(String name) {
		Map<Integer, ClientDTO2> nMap = new HashMap<>();
		for (Integer key : cMap.keySet()) {
			if (name.equals(cMap.get(key).getName())) {
				nMap.put(key, cMap.get(key));
			}
		}
		return nMap;
	}

	public ClientDTO2 findById(String id, String password) {
		for (Integer key : cMap.keySet()) {
			if (id.equals(cMap.get(key).getId()) && password.equals(cMap.get(key).getPassword()))
				return cMap.get(key);
		}
		return null;
	}

	public void update(String id, String pw, String uPw) {
		for (Integer key : cMap.keySet()) {
			if (cMap.get(key).getId().equals(id) && cMap.get(key).getPassword().equals(pw)) {
				cMap.get(key).setPassword(uPw);
			}
		}
	}

	public String getAccount(String loginId, String loginPw) {
		for (Integer key : cMap.keySet()) {
			if (loginId.equals(cMap.get(key).getId()) && loginPw.equals(cMap.get(key).getPassword())) {
				return cMap.get(key).getAccount();
			}
		}
		return null;
	}
	
//	public void breakdown(String loginAccount, String dAccount, long dMoney) {
//		for(Integer key : cMap.keySet()) {
//			if(cMap.get(key).getAccount().equals(loginAccount)){
//				for(String k : bMap.keySet()) {
//					
//				}
//			}
//		}
//	}
	
	
	public void dw(long mon, String div, String account) {
		for (Integer key : cMap.keySet()) {
			if (account.equals(cMap.get(key).getAccount())) {
				cMap.get(key).setBalance(cMap.get(key).getBalance() + mon);
				BreakdownDTO2 breakdownDTO = new BreakdownDTO2();
				breakdownDTO.setAccount(account);
				breakdownDTO.setDivision(div);
				breakdownDTO.setDealMoney(mon);
				breakdownDTO.setTotalMoney(cMap.get(key).getBalance());
				bMap.put(breakdownDTO.getArraynum(), breakdownDTO);
			} else {
				System.out.println("계좌가 잘못되었습니다.");
			}
		}
	}
	
	public boolean moneyCheck(long money) {
		for (Integer key : cMap.keySet()) {
			if (cMap.get(key).getBalance() >= money)
				return true;
		}
		return false;
	}

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
