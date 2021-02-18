package com.koiwaLearning.api.service;

import com.koiwaLearning.api.domain.Student;
import com.koiwaLearning.api.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;

    //查询所有学生
    public List<Student> findAllStudents(){
        return studentMapper.findAllStudents();
    }

    //添加学生
    public int addStudent(Student student){
        return studentMapper.addStudent(student);
    }

    //删除学生
    public int deleteStudent(Integer sno){
        return studentMapper.deleteStudent(sno);
    }

    //修改学生信息
    public int updateStudent(Student student){
        return studentMapper.updateStudent(student);
    }
}
