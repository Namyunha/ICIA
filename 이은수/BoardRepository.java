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

}
