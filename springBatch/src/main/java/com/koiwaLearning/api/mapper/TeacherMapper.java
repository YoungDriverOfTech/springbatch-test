package com.koiwaLearning.api.mapper;

import com.koiwaLearning.api.domain.Teacher;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherMapper {

    //检索
    List<Teacher> findTeacher();
    //追加
    int insertTeacher(Teacher teacher);
    //更新
    int updateTeacher(Teacher teacher);
    //删除
    int deleteTeacher(Teacher teacher);
}
