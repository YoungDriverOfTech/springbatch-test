package com.koiwaLearning.api.service;

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
}
