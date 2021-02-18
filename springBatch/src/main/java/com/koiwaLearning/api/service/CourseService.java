package com.koiwaLearning.api.service;

import com.koiwaLearning.api.domain.Course;
import com.koiwaLearning.api.mapper.CourseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseMapper courseMapper;

    // 查询所有课程
    public List<Course> findAllCourses(){
        return courseMapper.findAllCourses();
    }

    // 增加课程
    public int addCourse(Course course){
        return courseMapper.addCourse(course);
    }

    // 删除课程
    public int deleteCourse(Course course){
        return courseMapper.deleteCourse(course);
    }

    // 更新课程
    public int updateCourse(Course course){
        return courseMapper.updateCourse(course);
    }
}
