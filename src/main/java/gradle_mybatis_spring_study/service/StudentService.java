package gradle_mybatis_spring_study.service;

import java.util.Map;

import gradle_mybatis_spring_study.dto.Student;

public interface StudentService {
    Map<Integer, String> selectStudentForMap(int studId);
    Map<Integer, Student> selectStudentForMap2(int studId);
}
