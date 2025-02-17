package i05.a507.certblock.service;

import i05.a507.certblock.domain.Student;
import i05.a507.certblock.dto.Student.StudentUniversitiesRes;

import java.util.List;

public interface StudentService {
	Student getStudent(int userId);
	List<StudentUniversitiesRes>  getStudentUniversities(int studentId);
	boolean registStudentUniversity (int studentId, int universityId);
}
