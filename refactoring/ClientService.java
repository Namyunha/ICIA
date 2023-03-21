package refactoring;

import java.util.*;

public class ClientService {
	// 싱글톤패턴
	boolean check;
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
		ClientDTO clientDTO2 = new ClientDTO();
		System.out.print("name > ");
		clientDTO2.setName(sc.next());
		while (true) {
			System.out.print("ID > ");
			String id = sc.next();
			if (re.duCheck(id) == false) {
				clientDTO2.setId(id);
				System.out.print("PW > ");
				clientDTO2.setPassword(sc.next());
				re.save(clientDTO2);
				System.out.println("Congraturation " + clientDTO2.getName() + "\'s registration");
				break;
			} else {
				System.out.println("Again?");
				System.out.println("1.Write again 2.end");
				int menu = sc.nextInt();
				if (menu == 1) {
					continue;
				} else if (menu == 2) {
					clientDTO2.setName(null);
					break;
				}
			}
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
			System.out.println("fail to login");
			return false;
		}

	}

	public void logOut() {
		loginId = null;
		loginPw = null;
		System.out.println("logout");
	}

	public void findAll() {
		Map<Integer, ClientDTO> cMap = re.findAll();
		System.out.println("Account number\t\tID\t Password\t Depositor\t Balance\t Date of subscription");
		System.out.println("-----------------------------------------------------------------");
		for (Integer key : cMap.keySet()) {
			String string = cMap.get(key).toString();
			System.out.println(string);
		}
	}

	public boolean delete() {
		if (re.delete(loginId, loginPw)) {
			System.out.println("Success deleting.");
			return false;
		} else {
			System.out.println("Fail deleting.");
			return true;
		}

	}

	public void findById() {
		ClientDTO clientDTO = re.findById(loginId, loginPw);
		System.out.println("Account number\t\tID\t Password\t Depositor\t Balance\t Date of subscription");
		System.out.println("-----------------------------------------------------------------");
		System.out.println(clientDTO.toString());
		System.out.println("-----------------------------------------------------------------");
		System.out.println(" Deposit and withdrawal details ");
		Map<String, BreakdownDTO2> bMap = re.searchList(clientDTO.getAccount());
		if (bMap.size() == 0) {
			System.out.println("There is no deposit or withdrawal history.");
		} else {
			System.out.println(
					"Account number\t\t classification\t transaction amount\t post-transaction balance\t\t transaction date");
			for (String key : bMap.keySet()) {
				System.out.println(bMap.get(key).toString());
			}
		}
	}

	public void dw(int i) {
		String account = re.getAccount(loginId, loginPw);
		ClientDTO loginUser = re.findById(loginId, loginPw);
		if (account == null) {
			System.out.println("login error");
		} else {
			System.out.println("Enter Amount > ");
			long money = sc.nextLong();
			if (i == 2) {
				re.dw(money, "diposit", account);
			} else if (i == 3) {
				long a = (-1 * money);
				re.dw(a, "withdraw", account);
			} else if (i == 4) {
				System.out.print("Enter account to deposit > ");
				String dAccount = sc.next();
				ClientDTO dUser = re.dUser(dAccount);
				if (loginUser.getBalance() < money || dUser == null) {
					if (loginUser.getBalance() < money && dUser == null) {
						System.out.println("Please check the balance and account.");
					} else if (loginUser.getBalance() > money) {
						System.out.println("Account does not exist.");
					} else if (dUser != null) {
						System.out.println("Do not have enough money left.");
					}
				} else {
					re.dw(-money, "withdraw", loginUser.getAccount());
					re.dw(dUser.getBalance() + money, "diposit", dUser.getAccount());
					System.out.println("Current Remaining Amount > " + loginUser.getBalance());
					System.out.println("Account transfer successful");
				}
			}
		}
	}
	public void update() {
		while (true) {
			System.out.println("Checking  the password > ");
			String password = sc.next();
			if (loginPw.equals(password)) {
				System.out.println("Password to update > ");
				String updatePassword = sc.next();
				re.update(loginId, loginPw, updatePassword);
				System.out.println("Password is updated");
				loginPw = updatePassword;
				break;
			} else {
				System.out.println("Password is not proper. again Enter please.");
			}
		}
	}

	public void search() {
		while (true) {
			System.out.println("1.Searching the PW 2.Searching user 0.End");
			System.out.print("menu > ");
			int menu = sc.nextInt();
			if (menu == 1) {
				System.out.print("PW to find > ");
				String pw = sc.next();
				Map<Integer, ClientDTO> cMap = re.findNP("", pw);
				if (cMap == null) {
					System.out.println("ID to find is not exist");
					while (true) {
						System.out.println("1.find again 2.end");
						System.out.print("menu > ");
						int menu2 = sc.nextInt();
						if (menu2 == 1) {
							continue;
						} else if (menu == 2) {
							break;
						} else {
							System.out.println("please pick \"1\" or \"2\"");
						}
					}
				} else {
					System.out.println(
							"Account number\t\t classification\t transaction amount\t post-transaction balance\t transaction date");
					for (Integer key : cMap.keySet()) {
						System.out.println(cMap.get(key));
					}
					break;
				}
			} else if (menu == 2) {
				System.out.print("User to find > ");
				String name = sc.next();
				Map<Integer, ClientDTO2> nMap = re.findNP(name, "");
				if (nMap == null) {
					System.out.println("User to find is not exist");
				} else {
					System.out.println(
							"Account number\t\t classification\t transaction amount\t post-transaction balance\t transaction date");
					for (Integer key : nMap.keySet()) {
						System.out.println(nMap.get(key));
					}
					break;
				}
			} else if (menu == 0) {
				System.out.println("End");
				break;
			} else {
				System.out.println("Please Enter the number again.");
			}
		}

	}

	public void searchId() {
		while (true) {
			System.out.println("===============ID찾기==============");
			System.out.print("Please enter a user's name > ");
			String name = sc.next();
			ClientDTO searchName = re.searchName(name);
			if (searchName == null) {
				System.out.println("The ID of the user you are looking for does not exist.");
			} else {
				System.out.println("The ID of the user you want to find. > " + searchName.getId());
				break;
			}
		}
	}

	public void searchPw() {
		// pwCheck = false;
		System.out.println("===============PW찾기==============");
		System.out.print("Please enter user's name > ");
		String name = sc.next();
		System.out.print("Please enter user's id > ");
		String id = sc.next();
		ClientDTO searchPw = re.searchPw(name, id);
		if (searchPw == null) {
			System.out.println("Name or ID does not exist.");
		} else {
			System.out.println("PW of the user you want to find > " + searchPw.getPassword());
		}
	}

}
