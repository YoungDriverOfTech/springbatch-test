package com.koiwaLearning.api.controller;

import com.koiwaLearning.api.domain.Course;
import com.koiwaLearning.api.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    // 查询所有课程
    @RequestMapping(value = "/findAllCourses", method = RequestMethod.GET)
    public List<Course> findAllCourses() {
        return courseService.findAllCourses();
    }

    // 增加课程
    @RequestMapping(value = "/addCourse", method = RequestMethod.GET)
    public int addCourse() {
        Course course = new Course();
        course.setCoursesName("History");
        course.setCourseNumber("6-199");
        course.setTeacherNumber(666);
        return courseService.addCourse(course);
    }

    // 删除课程
    @RequestMapping(value = "/deleteCourse", method = RequestMethod.GET)
    public int deleteCourse() {
        Course course = new Course();
        course.setCourseNumber("6-199");
        return courseService.deleteCourse(course);
    }

    // 修改课程
    @RequestMapping(value = "/updateCourse", method = RequestMethod.GET)
    public int updateCourse() {
        Course course = new Course();
        course.setCourseNumber("6-199");
        course.setCoursesName("Math");
        course.setTeacherNumber(567);
        return courseService.updateCourse(course);
    }
}
