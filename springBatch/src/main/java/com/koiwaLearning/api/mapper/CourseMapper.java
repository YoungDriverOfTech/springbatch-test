package com.koiwaLearning.api.mapper;

import com.koiwaLearning.api.domain.Course;
import com.koiwaLearning.api.domain.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseMapper {
    // 查询所有课程
    List<Course> findAllCourses();

    // 添加课程
    int addCourse(Course course);

    //删除课程
    int deleteCourse(Course course);

    // 修改课程信息
    int updateCourse(Course course);
}
