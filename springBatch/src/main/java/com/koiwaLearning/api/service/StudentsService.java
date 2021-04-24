package com.koiwaLearning.api.service;

import com.koiwaLearning.api.domain.Students;
import com.koiwaLearning.api.domain.StudentsInfo;
import com.koiwaLearning.api.mapper.StudentsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsService {

    @Autowired
    private StudentsMapper studentsMapper;

    public List<StudentsInfo> getStudentsInfo() {

        return studentsMapper.getStudentsInfo();
    }

    public Students getStudentById(String stuId){

        return studentsMapper.getStudentById(stuId);

    }
    public List<Students> findAll(){
        return studentsMapper.findAll();
    }

    // 追加
    public int insertStudents(StudentsInfo students) {
        return studentsMapper.insertStudents(students);
    }

    public int insertStudent(Students student){
        return studentsMapper.insertStudent(student);
    }


    // 更新
    public int updateStudents(StudentsInfo students) {
        return studentsMapper.updateStudents(students);
    }
    // 削除
    public int deleteStudents(String sno) {
        return studentsMapper.deleteStudents(sno);
    }
}
