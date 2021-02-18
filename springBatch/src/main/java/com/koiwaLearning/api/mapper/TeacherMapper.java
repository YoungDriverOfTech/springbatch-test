package com.koiwaLearning.api.mapper;

import com.koiwaLearning.api.domain.Student;
import com.koiwaLearning.api.domain.Teacher;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherMapper {
    // 查询所有老师
    List<Teacher> findAllTeachers();

    // 添加老师
    int addTeacher(Teacher teacher);

    // 删除老师
    int deleteTeacher(Integer tno);

    // 修改老师数据
    int updateTeacher(Teacher teacher);
}
