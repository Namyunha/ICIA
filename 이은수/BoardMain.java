package 이은수;

import java.util.Scanner;

public class BoardMain {
	UserDTO userDTO = new UserDTO();
	UserMain uMain = new UserMain();
	Scanner sc = new Scanner(System.in);
	BoardService bs = new BoardService();
	BoardRepository br = new BoardRepository();
	BoardlistMain bl = new BoardlistMain();

	public void main(UserDTO userDTO) {
		while (true) {
			System.out.println("\u001B[36m"
					+ "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■" + "\u001B[0m");
			System.out.println("\u001B[36m"
					+ "■=================================ICIA 커뮤니티================================■" + "\u001B[0m");
			System.out.println("\u001B[36m"
					+ "■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■" + "\u001B[0m");

			if (userDTO == null) {
				System.out.println("1.게시글 보기 2.testdata 0.뒤로가기");
			} else {
				System.out.println("1.게시글 보기 2.게시글 등록 3.testdata  0.나가기");
			}
			System.out.print("menu > ");
			int menu = sc.nextInt();
			if (menu == 1) {
				bs.findAll(userDTO);
			} else if (menu == 2) {
				if (userDTO == null) {
					bs.testdata();
				} else {
					bs.save(userDTO);
				}
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
