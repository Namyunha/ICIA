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
	
	public StudentDTO findById(String stsno) {
		for(StudentDTO s : list) {
			if(s.getSno().equals(stsno)) {
				return s;
			}
		}
		return null;
	}

	public void delete(StudentDTO studentDTO) {
		list.remove(studentDTO);
	}
	
//	public boolean update(String sno , StudetnDTO studentDTO) {
//		for(StudentDTO s : list) {
//			if(s.getSno().equals(sno)) {
//				s.setName(studentDTO.getName());
//				s.setKor(studentDTO.getKor());
//				s.setEng(studentDTO.getEng());
//				s.setMat(studentDTO.getMat());
//				s.setGrade();
//				return true;
//			}
//		}
//		return false;
//	}
	
}
