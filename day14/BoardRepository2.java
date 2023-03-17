package day14;

import java.util.*;

public class BoardRepository2 {

	Map<Integer, BoardDTO2> map = new HashMap<>();
	List<BoardDTO2> list = new ArrayList<>();

	public boolean save(BoardDTO2 boardDTO) {
		map.put(boardDTO.getArrayNum(), boardDTO);
		list.add(boardDTO);
		return true;
	}

	public Map<Integer, BoardDTO2> findAll() {
		return map;
	}

//	public boolean search(String keyword) {
//		System.out.println("글번호\t제목\t작성자\t조회수\t게시일");
//		System.out.println("------------------------------------------------------------");
//		for (Integer Id : map.keySet()) {
//			if (map.get(Id).getTitle().equals(keyword)) {
//				map.get(Id).print();
//				return true;
//			}
//		}
//		return false;
//	}

	public BoardDTO2 findById(String bno) {
		for (Integer Id : map.keySet()) {
			if (map.get(Id).getBno().equals(bno)) {
				System.out.println(Id);
				return map.get(Id);
			}
		}
		return null;
	}

	public List<BoardDTO2> search(String writer) {
		List<BoardDTO2> sList = new ArrayList<>();
		for (BoardDTO2 b : list) {
			if (writer.equals(b.getWriter())) {
				sList.add(b);
			}
		}
		return sList;

	}

	public boolean update(BoardDTO2 boardDTO, String bno) {
		for (Integer Id : map.keySet()) {
			if (map.get(Id).getBno().equals(bno)) {
				map.get(Id).setTitle(boardDTO.getTitle());
				map.get(Id).setWriter(boardDTO.getWriter());
				return true;
			}
		}
		return false;
	}

	public BoardDTO2 update2(String bno) {
		for (Integer n : map.keySet()) {
			if (bno.equals(map.get(n).getBno())) {
				return map.get(n);
			} 
		}
		return null;
	}

	public boolean delete(String bno) {
		for (Integer Id : map.keySet()) {
			if (map.get(Id).getBno().equals(bno)) {
				map.remove(Id);
				return true;
			}
		}
		return false;
	}


}
