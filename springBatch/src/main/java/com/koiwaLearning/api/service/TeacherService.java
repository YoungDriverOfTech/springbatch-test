package com.koiwaLearning.api.service;

import com.koiwaLearning.api.domain.Student;
import com.koiwaLearning.api.domain.Teacher;
import com.koiwaLearning.api.mapper.StudentMapper;
import com.koiwaLearning.api.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    // 查询所有老师
    public List<Teacher> findAllTeachers(){
        return teacherMapper.findAllTeachers();
    }

    // 添加老师
    public int addTeacher(Teacher teacher){
        return teacherMapper.addTeacher(teacher);
    }

    // 删除老师
    public int deleteTeacher(Integer tno) {
        return teacherMapper.deleteTeacher(tno);
    }

    //修改老师数据
    public int updateTeacher(Teacher teacher) {
        return teacherMapper.updateTeacher(teacher);
    }


}
