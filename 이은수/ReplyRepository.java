package 이은수;

import java.util.ArrayList;
import java.util.List;

public class ReplyRepository {
	List<ReplyDTO> rList = new ArrayList<>();

	public boolean save(ReplyDTO replyDTO) {
		return rList.add(replyDTO);
	}

	public List<ReplyDTO> findAll() {
		return rList;
	}
}
