package com.koiwaLearning.api.mapper;

import com.koiwaLearning.api.domain.Students;
import com.koiwaLearning.api.domain.StudentsInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentsMapper {
    // 查询
    List<StudentsInfo> getStudentsInfo();
    List<Students> findAll();

    Students getStudentById(String sutId);

    // 追加
    int insertStudents(StudentsInfo students);
    int insertStudent(Students student);
    // 更新
    int updateStudents(StudentsInfo students);
    int updateStudent(Students student);

    // 削除
    int deleteStudents(String sno);

}
