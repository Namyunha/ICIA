package 이은수;

import java.util.List;
import java.util.Scanner;

public class BoardService {
	BoardRepository bs = new BoardRepository();
	Scanner sc = new Scanner(System.in);
	BoardlistMain bdList = new BoardlistMain();
	UserDTO userDTO = new UserDTO();
	List<String> rList = null;
	ReplyRepository rr = new ReplyRepository();
	boolean choice = false;

	public void save(UserDTO userDTO) {
		BoardDTO boardDTO = new BoardDTO();
		boardDTO.setWriter(userDTO.getName());
		System.out.print("제목 > ");
		boardDTO.setTitle(sc.next());
		System.out.println("내용 > ");
		
		boardDTO.setContent(sc.nextLine());
		sc.nextLine();
		boardDTO.setNick(userDTO.getNickname());
		bs.save(boardDTO);
		System.out.println("게시글 등록 완료");
		findAll(userDTO);
	}

	public void findAll(UserDTO userDTO) {
		List<BoardDTO> list = bs.list();
		System.out.println();
		System.out.println("◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆");
		System.out.println();
		System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※※※ ICIA 게시글 ※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※");
		System.out.println();
		System.out.println("=========================================================================================");
		System.out.println("No\t\t\t제목\t\t\t작성자\t\t작성일자          ");
		System.out.println("=========================================================================================");
		for (BoardDTO b : list) {
			System.out.println(b.toString());
			System.out.println(
					"-----------------------------------------------------------------------------------------");
		}
		System.out.println();
		System.out.println("◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆◆");
		System.out.println();

		search(userDTO);
	}

	public void search(UserDTO userDTO) {
		while (true) {
			List<BoardDTO> list = bs.list();
			System.out.println("1.사용자검색  2.제목검색  3.게시글읽기  0.나가기");
			System.out.print("menu > ");
			int menu = sc.nextInt();
			if (menu == 1) {
				System.out.print("사용자 입력 > ");
				String writer = sc.next();
				System.out.println(
						"=========================================================================================");
				System.out.println("No\t\t\t제목\t\t\t작성자\t\t작성일자");
				System.out.println(
						"=========================================================================================");
				for (BoardDTO b : list) {
					if (b.getWriter().equals(writer)) {
						System.out.println(b);
						System.out.println(
								"-----------------------------------------------------------------------------------------");
					}
				}
			} else if (menu == 2) {
				System.out.print("제목 입력 > ");
				String title = sc.next();
				System.out.println(
						"=========================================================================================");
				System.out.println("No\t\t\t제목\t\t\t작성자\t\t작성일자");
				System.out.println(
						"=========================================================================================");
				for (BoardDTO b : list) {
					if (b.getTitle().equals(title)) {
						System.out.println(b);
						System.out.println(
								"-----------------------------------------------------------------------------------------");
					}
				}
			} else if (menu == 3) {
				read(userDTO);
				break;
			} else if (menu == 0) {
				break;
			}
		}
	}

	public void read(UserDTO userDTO) {
		while (true) {
			List<BoardDTO> list = bs.list();
			System.out.print("읽고자하는 게시글 번호 > ");
			String bno = sc.next();
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※");
			System.out.println();
			BoardDTO board = null;
			for (BoardDTO b : list) {
				if (b.getBno().equals(bno)) {
					board = b;
					b.setCnt();
					System.out.println("");
					System.out.println("제목: " + b.getTitle());
					System.out.println("작성자(" + b.getNick() + "): " + b.getWriter());
					System.out.println("조회수: " + b.getCnt());
					System.out.println(
							"--------------------------------------------------------------------------------------------");
					System.out.println();
					System.out.println("내용: " + b.getContent());
					System.out.println();
					System.out.println(
							"--------------------------------------------------------------------------------------------");
					System.out.println();
					System.out.println("작성일자: " + b.getPostDate());
				}

			}
			System.out.println();
			System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※");
			System.out.println();
			List<ReplyDTO> rList = rr.findAll();
			if (rList != null) {
				for (ReplyDTO r : rList) {
					System.out.println(r.getContent());
				}
			}
			choice = false;
			choice(board, userDTO);
			break;
		}
	}

	public void choice(BoardDTO boardDTO, UserDTO userDTO) {
		while (!choice) {
			if (userDTO == null) {
				while (true) {
					System.out.println("0.나가기");
					int i = sc.nextInt();
					if (i == 0) {
						choice = true;
						break;
					}
				}
			} else if (userDTO.getName().equals(boardDTO.getWriter())) {
				while (true) {
					System.out.println("1.댓글등록 2.댓글수정 3.댓글삭제 0.나가기");
					int i = sc.nextInt();
					if (i == 1) {
						reply(boardDTO);
					} else if (i == 2) {

					} else if (i == 3) {

					} else if (i == 0) {
						choice = true;
						break;
					} else {

					}
				}
			} else {
				while (true) {
					System.out.println("1.댓글등록 2.UP 3.DOWN 0.나가기");
					int i = sc.nextInt();
					if (i == 1) {
						reply(boardDTO);
					} else if (i == 2) {

					} else if (i == 3) {

					} else if (i == 0) {
						choice = true;
						break;
					} else {
						System.out.println("정확한 번호를 입력해주세요");
					}
				}

			}

		}

	}

	public void reply(BoardDTO boardDTO) {
		ReplyDTO replyDTO = new ReplyDTO();
		System.out.print("댓글 > ");
		String reple = sc.next();
		replyDTO.setContent(reple);
		replyDTO.setWriter(boardDTO.getWriter());
		replyDTO.setNick(userDTO.getNickname());
		if (rr.save(replyDTO)) {
			System.out.println("댓글등록");
		} else {
			System.out.println("등록실패");
		}
	}

	public void testdata() {
		for (int i = 0; i <= 40; i++) {
			BoardDTO boardDTO = new BoardDTO();
			boardDTO.setTitle("title" + (i + 1));
			boardDTO.setWriter("Writer" + (i + 1));
			bs.save(boardDTO);
		}
	}
}
