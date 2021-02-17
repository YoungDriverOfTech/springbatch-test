package com.koiwaLearning.api.mapper;

import com.koiwaLearning.api.domain.StudentsInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentsMapper {
    List<StudentsInfo> getStudentsInfo();
}
