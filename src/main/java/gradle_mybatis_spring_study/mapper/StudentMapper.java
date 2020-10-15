package gradle_mybatis_spring_study.mapper;

import java.util.List;
import java.util.Map;

import gradle_mybatis_spring_study.dto.Student;

public interface StudentMapper {
	//1.TypeHandler 이용
	Student selectStudentByNo(Student student);
	
	//2.ResultMap 이용
	Student selectStudentByNoWithResultMap(Student student);
	
	//3.HashMap
	List<Map<String, Object>> selectStudentByAllForHashMap();
	
	//4.ResultMap
	List<Student> selectStudentByAllForResultMap();

	//5.XML 이용
	List<Student> selectStudentByAll();
	
	
	
	//4.insert
	int insertStudent(Student student);
	
	//5.delete
	int deleteStudent(int id);
	
	//6.update
	int updateStudent(Student student);
	
	/* 내포된 결과매핑(ResultMap)을 사용한 일대일 매핑 */
	Student selectStudentByNoAssociation(Student student);
	
	//7.열거타입
	int insertEnumStudent(Student student);
	Student selecStudentByNoForEnum(Student student);
	
	/* 여러 개의 입력 파라미터 전달 */
	Student selectStudentByMap(Map<String, String> map);
	
	List<Student> selectAllStudentByMap(Map<String, String> map);
	
	/* ResultSet 처리방식의 재정의 */
	Map<Integer, Student> selectStudentForMap(Student student);

	/* set 조건 */
	int updateSetStudent(Student student);

}
