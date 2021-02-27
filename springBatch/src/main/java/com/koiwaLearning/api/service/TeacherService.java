package com.koiwaLearning.api.service;

import com.koiwaLearning.api.domain.Teacher;
import com.koiwaLearning.api.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;
    //检索
    public List<Teacher> findTeacher(){
        return teacherMapper.findTeacher();
    }
    //追加
    public int insertTeacher(Teacher teacher){
        return teacherMapper.insertTeacher(teacher);
    }
    //更新
    public int updateTeacher(Teacher teacher){
        return teacherMapper.updateTeacher(teacher);
    }
    //删除
    public int deleteTeacher(Teacher teacher){
        return teacherMapper.deleteTeacher(teacher);
    }
}
