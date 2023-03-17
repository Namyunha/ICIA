package day16;

import java.util.*;

public class ClientService2 {
	// 싱글톤패턴
	private static ClientService2 service = new ClientService2();

	private ClientService2() {
	}

	public static ClientService2 getInstance() {
		return service;
	}

	private Scanner sc = new Scanner(System.in);
	private ClientRepository2 re = ClientRepository2.getInstance();
	private String loginId = null;
	private String loginPw = null;

	public void save() {
//		BreakdownDTO2 passbook = new BreakdownDTO2();
		ClientDTO2 clientDTO = new ClientDTO2();
		System.out.print("ID > ");
		clientDTO.setId(sc.next());
		System.out.print("password > ");
		clientDTO.setPassword(sc.next());
		System.out.print("name > ");
		clientDTO.setName(sc.next());
//		System.out.print("초기입금금액 > ");
//		int money = sc.nextInt();
//		clientDTO.setBalance(clientDTO.getBalance() + money);
		clientDTO.setBalance(clientDTO.getBalance());
		if (re.save(clientDTO)) {
			System.out.println("회원가입성공");
		} else {
			System.out.println("회원가입실패");
		}
	}

	public boolean loginCheck() {
		System.out.print("ID > ");
		String id = sc.next();
		System.out.println("PW > ");
		String pw = sc.next();
		if (re.loginCheck(id, pw)) {
			loginId = id;
			loginPw = pw;
			return true;
		} else {
			System.out.println("로그인 실패");
			return false;
		}

	}

	public void logOut() {
		loginId = null;
		loginPw = null;
		System.out.println("로그아웃");
	}

//	public void findAll() {
//		List<ClientDTO2> cList = re.findAll();
//		System.out.println("계좌번호\t\t아이디\t비밀번호\t예금주\t잔액\t가입일");
//		System.out.println("-----------------------------------------------------------------");
//		for (ClientDTO2 c : cList) {
//			System.out.println(c.toString());
//		}
//	} ArrayList 버젼
	public void findAll() {
		Map<Integer, ClientDTO2> cMap = re.findAll();
		System.out.println("계좌번호\t\t아이디\t비밀번호\t예금주\t잔액\t가입일");
		System.out.println("-----------------------------------------------------------------");
		for (Integer key : cMap.keySet()) {
			String string = cMap.get(key).toString();
			System.out.println(string);
		}
	}

	public boolean delete() {
		if (re.delete(loginId, loginPw)) {
			System.out.println("삭제성공");
			return false;
		} else {
			System.out.println("삭제실패");
			return true;
		}

	}

//	public void findById() {
//		ClientDTO2 clientDTO = re.findById(loginId, loginPw);
//		if (clientDTO == null) {
//			System.out.println("로그인 오류");
//		} else {
//			System.out.println("계좌번호\t\t아이디\t비밀번호\t예금주\t잔액\t가입일");
//			System.out.println("-----------------------------------------------------------------");
//			System.out.println(clientDTO.toString());
//			System.out.println("-----------------------------------------------------------------");
//			System.out.println("▼ 입출금내역 ▼");
//			List<BreakdownDTO2> bList = re.breakList(clientDTO.getAccount());
//			if (bList.size() == 0) {
//				System.out.println("입출금 내역이 없습니다.");
//			} else {
//				System.out.println("계좌번호\t\t구분\t거래금액\t거래후 잔액\t\t거래일");
//				for (BreakdownDTO2 b : bList) {
//					System.out.println(b.toString());
//				}
//			}
//
//			System.out.println("-----------------------------------------------------------------");
//		}
//
//	}
//	public void findById() {
//		ClientDTO2 clientDTO = re.findById(loginId, loginPw);
//		if (clientDTO == null) {
//			System.out.println("로그인 오류");
//		} else {
//			System.out.println("계좌번호\t\t아이디\t비밀번호\t예금주\t잔액\t가입일");
//			System.out.println("-----------------------------------------------------------------");
//			System.out.println(clientDTO.toString());
//			System.out.println("-----------------------------------------------------------------");
//			System.out.println("▼ 입출금내역 ▼");
//			Map<Integer, BreakdownDTO2> bMap = re.breakList2(clientDTO.getAccount());
//			if (bMap.size() == 0) {
//				System.out.println("입출금 내역이 없습니다.");
//			} else {
//				System.out.println("계좌번호\t\t구분\t거래금액\t거래후 잔액\t\t거래일");
//				for (Integer key : bMap.keySet()) {
//					System.out.println(bMap.get(key).toString());
//				}
//			}
//
//			System.out.println("-----------------------------------------------------------------");
//		}
//
//	}
	public void findById() {
		ClientDTO2 clientDTO = re.findById(loginId, loginPw);
		System.out.println("계좌번호\t\t아이디\t비밀번호\t예금주\t잔액\t가입일");
		System.out.println("-----------------------------------------------------------------");
		System.out.println(clientDTO.toString());
		System.out.println("-----------------------------------------------------------------");
		System.out.println("▼ 입출금내역 ▼");
		Map<Integer, BreakdownDTO2> bMap = re.searchList(clientDTO.getAccount());
		if (bMap.size() == 0) {
			System.out.println("입출금 내역이 없습니다.");
		} else {
			System.out.println("계좌번호\t\t구분\t거래금액\t거래후 잔액\t\t거래일");
			for (Integer key : bMap.keySet()) {
				System.out.println(bMap.get(key).toString());
			}
		}
	}

	public void deposit() {
		String account = re.getAccount(loginId, loginPw);
		if (account == null) {
			System.out.println("로그인 오류");
		} else {
			System.out.println("입금 금액 > ");
			long money = sc.nextLong();
			re.deposit(account, money);
		}

	}

	public void withdraw() {
		String account = re.getAccount(loginId, loginPw);
		if (account == null) {
			System.out.println("로그인 오류");
		} else {
			System.out.println("출금 금액");
			long money = sc.nextLong();
			if (re.moneyCheck(money)) {
				re.withdraw(money, account);
				System.out.println("출금성공");
			} else {
				System.out.println("잔액이부족합니다");
			}
		}
	}

//	public void transferMy() {
//		System.out.println("입금할 계좌");
//		String account = sc.next();
//		if (account == null) {
//			System.out.println("로그인 오류");
//		} else {
//			System.out.println("이체 금액");
//			long money = sc.nextLong();
//			if (re.moneyCheck(money)) {
//				re.transfer(money, account, loginId);
//				System.out.println("이체성공");
//			}else {
//				System.out.println("잔액이부족합니다");
//			}
//		}
//	}

//	public void transfer() {
//		String account = re.getAccount(loginId, loginPw);
//		if (account == null) {
//			System.out.println("로그인 오류");
//			return;
//		}
//		System.out.println("이체할 계좌번호 > ");
//		String depositAccount = sc.next();
//		System.out.println("이체할 금액 > ");
//		long transferMoney = sc.nextLong();
//		if (re.transferCheck(depositAccount)) {
//			if(re.withdraw2(transferMoney, account)) {
//				System.out.println("이체성공");
//			}else {
//				System.out.println("잔액부족");
//			}
//		} else {
//			System.out.println("이체할 계좌번호가 없습니다.");
//		}
//	} ArrayList 버젼

	public void transfer() {
		// 로그인 돼 있는 상태이고, 보낼계좌와 얼마보낼지 금액을 받고나서,
		// 보낼계좌가 틀렸는지 확인 / 보낼금액이 잔액보다 적은지 확인
		ClientDTO2 loginUser = re.loginUser(loginId, loginPw);
		System.out.print("입금할 계좌 입력 > ");
		String dAccount = sc.next();
		ClientDTO2 dUser = re.dUser(dAccount);
		System.out.print("보낼 금액 > ");
		long dMoney = sc.nextInt();
		if (loginUser.getBalance() < dMoney || dUser == null) {
			if (loginUser.getBalance() < dMoney && dUser == null) {
				System.out.println("정신차리세요");
			} else if (loginUser.getBalance() > dMoney) {
				System.out.println("잔액이 모자랍니다");
			} else if (dUser != null) {
				System.out.println("계좌가 존재하지 않습니다.");
			}
		} else {
			loginUser.setBalance(loginUser.getBalance() - dMoney);
			dUser.setBalance(dUser.getBalance() + dMoney);
			System.out.println("현재 잔여 금액 > " + loginUser.getBalance());
			System.out.println("이체 완료");
		}
	}

	public void update() {
		while (true) {
			System.out.println("비밀번호 확인 > ");
			String password = sc.next();
			if (loginPw.equals(password)) {
				System.out.println("수정할 비밀번호 > ");
				String updatePassword = sc.next();
				re.update(loginId, loginPw, updatePassword);
				System.out.println("비밀번호가 수정 되었습니다.");
				loginPw = updatePassword;
				break;
			} else {
				System.out.println("암호가틀렸습니다\n다시 입력해주세요");
			}
		}
	}

	public void searchId() {
		while (true) {
			System.out.println("===============ID찾기==============");
			System.out.print("사용자의 이름을 입력해주세요 > ");
			String name = sc.next();
			ClientDTO2 searchName = re.searchName(name);
			if (searchName == null) {
				System.out.println("찾고자하는 사용자의 ID는 존재하지 않습니다.");
			} else {
				System.out.println("찾고자하는 사용자의 ID > " + searchName.getId());
				break;
			}

		}
	}

	public void searchPw() {
		// pwCheck = false;
		System.out.println("===============PW찾기==============");
		System.out.print("사용자의 이름을 입력해주세요 > ");
		String name = sc.next();
		System.out.print("사용자의 ID를 입력해주세요 > ");
		String id = sc.next();
		ClientDTO2 searchPw = re.searchDTO(name, id);
		if (searchPw == null) {
			System.out.println("이름 또는 ID가 존재하지 않습니다.");
		} else {
			System.out.println("찾고자 하는 사용자의 PW > " + searchPw.getPassword());
		}
	}

}
