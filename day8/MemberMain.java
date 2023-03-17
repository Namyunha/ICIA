package day8;

//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
import java.util.*;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Member> list = new ArrayList<>();
		// List.add(객체); list.get
		int id = 0;
		Util util = new Util();
		while (true) {
			System.out.println("1.맴버등록 2.맴버리스트 3.검색 4.맴버수정 5.멤버삭제 0.종료");
			System.out.println("메뉴 선택 > ");
			int menu = util.numberCheck();

			if (menu == 1) {
				Member member = new Member();
				member.setId(++id); // 전치 증가 연산자 증가 시키고
				System.out.println("이메일 입력 > ");
				member.setEmail(sc.next());
				System.out.println("비밀번호입력 > ");
				member.setPw(sc.next());
				System.out.println("이름 입력 > ");
				member.setName(sc.next());
				list.add(member);
				System.out.println("멤버등록 완료!");
			} else if (menu == 2) {
				System.out.println("아이디\t이메일\t\t비밀번호\t이름\t가입일");
				System.out.println("-----------------------------------");
				for (Member m : list) {
					m.print();
				}
			} else if (menu == 3) {
				System.out.print("검색할 id > ");
				int searchId = sc.nextInt();
				boolean find = false;
				for (Member m : list) {
					if (m.getId() == searchId) {
						m.print();
						find = true;
						break;
					}
				}
				if (!find) {
					System.out.println("조회할 수 없는 id입니다.");
				}

			} else if (menu == 4) {
				System.out.println("수정할 id > ");
				int updateId = sc.nextInt();
				boolean find = false;
				for (Member m : list) {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
					if (updateId == m.getId()) {
						System.out.println("수정할 이메일입력 > ");
						String uEmail = sc.next();
						System.out.println("수정할 이메일 입력 > ");
						m.setEmail(sc.next());
						System.out.println("비밀번호입력 > ");
						m.setPw(sc.next());
						System.out.println("이름 입력 > ");
						m.setName(sc.next());
						find = true;
						break;
					}
				}
				if (!find) {
					System.out.println("조회할 수 없는 id입니다.");
				}
			} else if (menu == 5) {
				boolean find = false;
				System.out.println("삭제할 id > ");
				int deleteId = sc.nextInt();
				for (Member m : list) {
					if (deleteId == m.getId()) {
						System.out.println(m.getName() + "님 삭제완료");
						list.remove(m);
						find = true;
						break;
					}
				}
				if (!find) {
					System.out.println("조회할 수 없는 id입니다.");
				}

			} else if (menu == 0) {
				break;
			} else {
				System.out.println("다시입력");
			}
		}
		System.out.println("프로그램 종료");
	}

}
