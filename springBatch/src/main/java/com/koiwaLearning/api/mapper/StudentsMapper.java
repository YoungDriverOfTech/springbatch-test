package com.koiwaLearning.api.mapper;

import com.koiwaLearning.api.domain.Students;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentsMapper {

    // 検索
    List<Students> findStudents();

    // 追加
    int insertStudents(Students students);

    // 更新
    int updateStudents(Students students);

    // 削除
    int deleteStudents(String sno);
}
