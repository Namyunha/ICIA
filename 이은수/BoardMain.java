package 이은수;

import java.util.Scanner;

public class BoardMain {
	UserDTO userDTO = new UserDTO();
	UserMain uMain = new UserMain();
	Scanner sc = new Scanner(System.in);
	BoardService bs = new BoardService();
	BoardRepository br = new BoardRepository();

	public void main(UserDTO userDTO) {
		while (true) {
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			System.out.println("■=================================ICIA 커뮤니티================================■");
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			if (userDTO == null) {
				System.out.println("1.게시글 목록 2.게시글 검색 3.testdata 4.로그인하기");
			} else {
				System.out.println("1.게시글 목록 1-1.게시글 보기 1-2.게시글 삭제 1-3.게시글 검색 2.게시글 등록 3.testdata  0.나가기");
			}
			System.out.print("menu > ");
			int menu = sc.nextInt();
			if (menu == 1) {
				System.out.println("◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆");
				System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※※※ ICIA 게시글 ※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※");
				bs.findAll();
				System.out.println("◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆");
			} else if (menu == 2) {
				bs.save(userDTO);
			} else if (menu == 3) {
				bs.testdata();
			} else if (menu == 4) {
				if (userDTO == null) {
					break;
				} else {
				}
			} else if (menu == 0) {
				break;
			} else {
				System.out.println("숫자를 다시 입력해주세요");
			}
		}

	}

}
