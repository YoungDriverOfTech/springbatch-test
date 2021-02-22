package com.koiwaLearning.api.mapper;

import com.koiwaLearning.api.domain.Courses;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoursesMapper {

    //检索
    List<Courses> findCourses();

    //追加
    int insertCourses(Courses courses);

}
