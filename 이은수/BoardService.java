package 이은수;

import java.util.List;
import java.util.Scanner;

public class BoardService {
	BoardRepository bs = new BoardRepository();
	Scanner sc = new Scanner(System.in);

	public void save(UserDTO userDTO) {
		BoardDTO boardDTO = new BoardDTO();
		boardDTO.setWriter(userDTO.getName());
		System.out.print("제목 > ");
		boardDTO.setTitle(sc.next());
		bs.save(boardDTO);
		System.out.println("게시글 등록 완료");
	}

	public void findAll() {
		List<BoardDTO> list = bs.list();
		System.out.println("=========================================================================================");
		System.out.println("No\t\t\t제목\t\t\t작성자\t\t작성일자          ");
		System.out.println("=========================================================================================");
		for (BoardDTO b : list) {
			System.out.println(b.toString());
			System.out.println("-----------------------------------------------------------------------------------------");
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
