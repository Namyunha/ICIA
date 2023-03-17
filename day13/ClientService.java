package day13;

import java.util.*;

public class ClientService {
	// 싱글톤패턴
	private static ClientService service = new ClientService();

	private ClientService() {
	}

	public static ClientService getInstance() {
		return service;
	}

	private Scanner sc = new Scanner(System.in);
	private ClientRepository re = ClientRepository.getInstance();
	private String loginId = null;
	private String loginPw = null;

	public void save() {
		BreakdownDTO passbook = new BreakdownDTO();
		ClientDTO clientDTO = new ClientDTO();
		System.out.print("ID > ");
		clientDTO.setId(sc.next());
		System.out.print("password > ");
		clientDTO.setPassword(sc.next());
		System.out.print("name > ");
		clientDTO.setName(sc.next());
		System.out.print("초기입금금액 > ");
		int money = sc.nextInt();
		clientDTO.setBalance(clientDTO.getBalance() + money);
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

	public void findAll() {
		List<ClientDTO> cList = re.findAll();
		System.out.println("계좌번호\t\t아이디\t비밀번호\t예금주\t잔액\t가입일");
		System.out.println("-----------------------------------------------------------------");
		for (ClientDTO c : cList) {
			System.out.println(c.toString());
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

	public void findById() {

		ClientDTO clientDTO = re.findById(loginId, loginPw);
		if (clientDTO == null) {
			System.out.println("로그인 오류");
		} else {
			System.out.println("계좌번호\t\t아이디\t비밀번호\t예금주\t잔액\t가입일");
			System.out.println("-----------------------------------------------------------------");
			System.out.println(clientDTO.toString());
			System.out.println("-----------------------------------------------------------------");
			System.out.println("▼ 입출금내역 ▼");
			List<BreakdownDTO> bList = re.breakList(clientDTO.getAccount());
			if (bList.size() == 0) {
				System.out.println("입출금 내역이 없습니다.");
			} else {
				System.out.println("계좌번호\t\t구분\t거래금액\t거래후 잔액\t\t거래일");
				for (BreakdownDTO b : bList) {
					System.out.println(b.toString());
				}
			}

			System.out.println("-----------------------------------------------------------------");
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

	public void transfer() {
		String account = re.getAccount(loginId, loginPw);
		if (account == null) {
			System.out.println("로그인 오류");
			return;
		}
		System.out.println("이체할 계좌번호 > ");
		String depositAccount = sc.next();
		System.out.println("이체할 금액 > ");
		long transferMoney = sc.nextLong();
		if (re.transferCheck(depositAccount)) {
			if(re.withdraw2(transferMoney, account)) {
				System.out.println("이체성공");
			}else {
				System.out.println("잔액부족");
			}
		} else {
			System.out.println("이체할 계좌번호가 없습니다.");
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

}
