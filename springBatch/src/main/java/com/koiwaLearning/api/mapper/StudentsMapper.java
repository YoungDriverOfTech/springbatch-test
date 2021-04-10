package com.koiwaLearning.api.mapper;

import com.koiwaLearning.api.domain.StudentDetail;
import com.koiwaLearning.api.domain.StudentsInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentsMapper {
    // 查询
    List<StudentsInfo> getStudentsInfo();

    // 根据id查询单个学生
    StudentDetail getStudent(String studentId);

    // 追加
    int insertStudents(StudentsInfo students);

    // 更新
    int updateStudents(StudentsInfo students);

    // 削除
    int deleteStudents(String sno);
}
