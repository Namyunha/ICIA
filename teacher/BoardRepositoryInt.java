package teacher;

import java.util.Map;

public interface BoardRepositoryInt {
	public boolean save(BoardDTO boardDTO);
	
	public Object findAll();
	
	public BoardDTO findById(String bno);
	
	public boolean update(BoardDTO boardDTO, String bno);
	
	public boolean delete(String bno);	
}
