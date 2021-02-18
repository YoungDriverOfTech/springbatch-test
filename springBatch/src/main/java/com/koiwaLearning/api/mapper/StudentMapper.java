package com.koiwaLearning.api.mapper;

import com.koiwaLearning.api.domain.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentMapper {
    // 查询所有学生
    List<Student> findAllStudents();

    // 追加学生
    int addStudent(Student student);

    // 删除学生
    int deleteStudent(Integer sno);

    // 修改学生信息
    int updateStudent(Student student);
}
