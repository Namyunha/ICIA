package day14;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;
//담은 정보를 가공하는 곳

public class BoardService2 {
	BoardRepository2 br = new BoardRepository2();
	Scanner sc = new Scanner(System.in);

	public void save() {
		BoardDTO2 boardDTO2 = new BoardDTO2();
		System.out.println("제목 >");
		boardDTO2.setTitle(sc.nextLine());
		System.out.println("작성자 >");
		boardDTO2.setWriter(sc.next());
		sc.nextLine();
		boolean success = br.save(boardDTO2);
		if (success) {
			System.out.println("게시글 등록완료!");
		} else {
			System.out.println("게시글 등록실패");
		}
	}

	public void findAll() {
		Map<Integer, BoardDTO2> map = br.findAll();
		Object[] mapKey = map.keySet().toArray();
		Arrays.sort(mapKey);
		System.out.println("글번호\t제목\t작성자\t조회수\t게시일");
		System.out.println("------------------------------------------------------------");
		for (Integer bno : map.keySet()) {
			map.get(bno).print();
		}
	}

	public void findById() { // 얘는 좀 복습하자
		System.out.println("읽을 글 번호 > ");
		String bno = sc.next();
		BoardDTO2 boardDTO = br.findById(bno);
		if (boardDTO == null) {
			System.out.println("찾을 수 없는 글입니다.");
		} else {
			boardDTO.increaseSetCnt();
			System.out.println("글번호\t제목\t\t작성자\t조회수\t게시일\n");
			System.out.println("------------------------------------------------------------");
			System.out.println();
			boardDTO.print();
		}

	}

//	public void update() {
//		System.out.println("수정할 글 번호 > ");
//		String bno = sc.next();
//		sc.nextLine();
//		BoardDTO2 b = br.findById(bno);
//		if (b == null) {
//			System.out.println("조회할 수 없는 글번호 입니다.");
//		} else {
//			BoardDTO2 boardDTO = new BoardDTO2();
//			System.out.println("수정할 제목 > ");
//			boardDTO.setTitle(sc.nextLine());
//			System.out.println("수정할 작성자");
//			boardDTO.setWriter(sc.next());
//			sc.nextLine();
//			if (br.update(boardDTO, bno)) {
//				System.out.println("업데이트 성공");
//			} else {
//				System.out.println("업데이트 실패");
//			}
//
//		}
//	}

	public void update() {
		while (true) {
			System.out.println("수정번호 > ");
			String bno = sc.next();
			BoardDTO2 boardDTO2 = br.update2(bno);
			if (boardDTO2 == null) {
				System.out.println("번호가 존재하지 않습니다.");
			} else {
				System.out.print("수정할 제목 > ");
				boardDTO2.setTitle(sc.next());
				System.out.print("수정할 작성자 >");
				boardDTO2.setWriter(sc.next());
				System.out.println(sc.nextLine());
				System.out.println("수정완료");
				break;
			}

		}

	}

	public void delete() {
		System.out.println("삭제할 글 번호 > ");
		String bno = sc.next();
		System.out.println(sc.nextLine());
		if (br.delete(bno)) {
			System.out.println("삭제완료");
		} else {
			System.out.println("삭제실패");
		}
	}

	public void search() {
		System.out.print("검색어 > ");
		String keyword = sc.next();
		List<BoardDTO2> list = br.search(keyword);
		for (BoardDTO2 b : list) {
			b.print();
		}
	}

	public void test() {
		for (int i = 1; i <= 5; i++) {
			BoardDTO2 boardDTO2 = new BoardDTO2();
			boardDTO2.setTitle("title" + i);
			boardDTO2.setWriter("writer" + i);
			br.save(boardDTO2);
		}
	}
}
