package com.koiwaLearning.api.service;

import com.koiwaLearning.api.domain.Students;
import com.koiwaLearning.api.mapper.StudentsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsService {

    @Autowired
    private StudentsMapper studentsMapper;

    //检索
    public List<Students> findStudents(){
        return studentsMapper.findStudents();
    }

    //追加
    public int insertStudents(Students students){

        return studentsMapper.insertStudents(students);
    }
    //更新
    public int updateStudents(Students students){
        return studentsMapper.updateStudents(students);

    }
    //删除
    public int deleteStudents(Students students){
        return studentsMapper.deleteStudents(students);
    }

}

