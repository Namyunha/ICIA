package 이은수;

import java.util.*;

public class UserService {
	UserRepository re = new UserRepository();
	Scanner sc = new Scanner(System.in);
	String loginId = null;
	String loginPw = null;
	Util util = new Util();

	public void save() {
		System.out.println("======================회원가입======================");
		while (true) {
			UserDTO userDTO = new UserDTO();
			System.out.print("이름 > ");
			userDTO.setName(sc.next());
			System.out.println("주민등록번호 입력");
			System.out.print("앞자리: ");
			int fisrt = sc.nextInt();
			System.out.print("뒷자리: ");
			int last = sc.nextInt();
			userDTO.setpNum(fisrt, last);
			while (true) {
				System.out.print("ID > ");
				String id = sc.next();
				if (re.duCheck(id)) {
					System.out.println("id를 다시 입력해주세요");
				} else {
					userDTO.setId(id);
					break;
				}
			}
			System.out.print("PW > ");
			userDTO.setPw(sc.next());
			System.out.print("휴대전화 >");
			userDTO.setPhone(sc.nextInt());
			if (re.save(userDTO)) {
				System.out.println(userDTO.getName() + "님의 회원가입을 축하드립니다.");
				break;
			} else {
				System.out.println("회원가입에 실패 하였습니다");
			}
		}
	}

	public boolean loginOk() {
		System.out.print("ID > ");
		String id = sc.next();
		System.out.print("PW > ");
		String pw = sc.next();
		UserDTO userDTO = new UserDTO(id, pw);
		if (re.returnUser(userDTO) == null) {
			System.out.println("로그인에 실패하였습니다.");
			return false;
		} else {
			System.out.println(re.returnUser(userDTO).getName() + "님 환영합니다");
			loginId = id;
			loginPw = pw;
			return true;
		}
	}

	public void loginCheck() {
		UserDTO userDTO = new UserDTO(loginId, loginPw);
		if (re.returnUser(userDTO) == null) {
			System.out.println("정보를 찾을 수 없습니다.");
		} else {
			System.out.println("회원번호\t이름\t주민등록번호\tID\tPW\t휴대전화\t\t가입일");
			System.out.println(re.returnUser(userDTO).toString());
		}
	}

	public boolean logOut() {
		loginId = null;
		loginPw = null;
		return false;
	}

	public void findAll() {
		List<UserDTO> uList = re.list();
		System.out.println("회원번호\t이름\t주민등록번호\tID\tPW\t휴대전화\t\t가입일");
		for (UserDTO u : uList) {
			System.out.println(u.toString());
		}
	}

	public void search() {
		while (true) {
			System.out.println("1.ID찾기 2.PW찾기 0.종료");
			System.out.print("menu > ");
			int menu = sc.nextInt();
			if (menu == 1) {
				UserDTO searchUser = new UserDTO();
				System.out.print("이름 > ");
//				String name = sc.next();
				searchUser.setName(sc.next());
				System.out.print("전화번호 > ");
//				int phone = sc.nextInt();
				searchUser.setPhone(sc.nextInt());
				UserDTO user = re.searchId(searchUser.getName(), searchUser.getPhone());
				if (user != null) {
					System.out.println("주민등록번호입력");
					System.out.println("앞자리: ");
					searchUser.setFirstNum(sc.nextInt());
					System.out.println("뒷자리: ");
					searchUser.setLastNum(sc.nextInt());
					re.searchP(searchUser.getName(), searchUser.getName(), searchUser.getPhone(), searchUser.getpNum());
					System.out.println(user.getName()+"님의 ID는 " + user.getId() + "입니다. ");
				} else {
					System.out.println("이름 또는 연락처를 확인해주세요");
					continue;
				}
			} else if (menu == 2) {
				System.out.print("이름 > ");
				String name = sc.next();
				System.out.print("ID > ");
				String id = sc.next();
				System.out.print("전화번호 > ");
				int phone = sc.nextInt();
				UserDTO user = re.search(name, id, phone, "");
				System.out.println(user.getPw());
			} else if (menu == 0) {
				break;
			} else {
				System.out.println("숫자를 다시 입력해주세요");
			}

		}

	}

	public void update() {
		UserDTO loginUser = re.getUser(loginId, loginPw);
		while (true) {
			System.out.println("1.ID수정 2.PW수정 3.회원탈퇴 0.나가기");
			System.out.print("menu > ");
			int i = sc.nextInt();
			if (i == 1) {
				System.out.print("수정할 ID > ");
				loginUser.setId(sc.next());
				loginId = loginUser.getId();
				System.out.println("ID가 변경 됐습니다");
			} else if (i == 2) {
				System.out.print("수정할 PW >");
				loginUser.setPw(sc.next());
				loginPw = loginUser.getPw();
				System.out.println("PW가 변경 됐습니다.");
			} else if (i == 3) {
				System.out.println("회원탈퇴 하시겠습니가?");
				while (true) {
					System.out.println("1.예 2.아니오");
					System.out.print("menu > ");
					int menu = sc.nextInt();
					if (menu == 1) {
						if (re.delete(loginUser)) {
							logOut();
							break;
						} else {
							break;
						}
					} else if (menu == 2) {
						break;
					} else {
						System.out.println("올바르게 입력해주세요");
					}
				}
				break;
			} else if (i == 0) {
				break;
			} else {
				re.delete(loginUser);
				System.out.println("숫자를 정확히 입력해주세요");
			}
		}

	}

}
