package com.koiwaLearning.api.service;


import com.koiwaLearning.api.domain.Courses;
import com.koiwaLearning.api.mapper.CoursesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursesService {

    @Autowired
    private CoursesMapper coursesMapper;

    //检索
    public List<Courses> findCourses(){

        return coursesMapper.findCourses();
    }
    //追加
    public int insertCourses(Courses courses){
        return coursesMapper.insertCourses(courses);
    }


}


