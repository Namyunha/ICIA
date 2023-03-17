package 실습;

import java.util.ArrayList;
import java.util.List;

public class VisitorRepository {
	List<VisitorDTO> list = new ArrayList<>();
	
	public boolean save(VisitorDTO visitorDTO) {
		return list.add(visitorDTO);
	}

	public List<VisitorDTO> findAll() {
		return list;
	}

	

	public visitorDTO login(String id, String pw) {
		for (VisitorDTO v : list) {
			if (id.equals(v.getId()) && pw.equals(v.getPassword())) {
				return v;
			}

		}
		return false;
	}
	
	
	public void searchId(String name, int age) {
		boolean check = false;
		for (VisitorDTO v : list) {
			if (name.equals(v.getName()) && age == v.getAge()) {
				System.out.println("아이디는" + v.getId() + "입니다");
				check = true;
			}
		}
		if (!check) {
			System.out.println("다시입력해주세요");
		}
	}

	public boolean searchPw(String name, int age, String id) {
		for (VisitorDTO v : list) {
			if (name.equals(v.getName()) && age == v.getAge() && id.equals(v.getId())) {
				System.out.println("PW는 " + v.getPassword() + "입니다.");
				return true;
			}
		}
		return false;
	}
	
	public VisitorDTO findById(String loginEmail, String loginPw) {
		for(VisitorDTO v : list) {
			if(v.getId().equals(loginEmail) && v.getPassword().equals(loginPw)) {
				return v;
			}
		}
		return null;
	}
}
