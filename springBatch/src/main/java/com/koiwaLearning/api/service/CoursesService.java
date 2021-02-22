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
    //更新
    public int updateCourses(Courses courses){
        return coursesMapper.updateCourses(courses);
    }
    //删除
    public int deleteCourses(String string){
        //return coursesMapper.deleteCourses(courses);
        return coursesMapper.deleteCourses(string);
    }


}


