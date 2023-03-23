package 이은수;

import java.util.ArrayList;
import java.util.List;

public class BoardRepository {
	List<BoardDTO> bList = new ArrayList<>();

	public void save(BoardDTO boardDTO) {
		bList.add(boardDTO);
	}

	public List<BoardDTO> list() {
		return bList;
	}

	public boolean delete(String bno, UserDTO userDTO) {
		for (BoardDTO b : bList) {
			if (b.getBno().equals(bno)) {
				if (userDTO.getBno().equals(b.getBno()))
					bList.remove(b);
				return true;
			}
		}
		return false;
	}
}
