package day12;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
	List<StudentDTO> list = new ArrayList<>();

	public boolean save(StudentDTO studentDTO) {
		return list.add(studentDTO);

	}

	public List<StudentDTO> findAll() {
		return list;
	}

	public StudentDTO findById(String sno) {
		for (StudentDTO s : list) {
			if (sno.equals(s.getSno())) {
				return s;
			}
		}
		return null;
	}

	public void remove(StudentDTO studentDTO) {
		list.remove(studentDTO);
	}
	
	
	public void update(StudentDTO studentDTO) {
	}
}
//StudentDTO studentDTO2  = new StudentDTO(uName, uKor, uEng, uMat);

