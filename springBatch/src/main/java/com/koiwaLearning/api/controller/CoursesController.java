package com.koiwaLearning.api.controller;


import com.koiwaLearning.api.domain.Courses;
import com.koiwaLearning.api.service.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CoursesController {

//    git practice
    @Autowired
    private CoursesService coursesService;

    //检索
    @RequestMapping(value = {"/select"},method = RequestMethod.GET)
    public List<Courses> selectCourses(){
        return coursesService.findCourses();
    }

    //追加
    @RequestMapping(value = {"/insert"},method = RequestMethod.GET)
    public int  insertCourses(){

        Courses courses = new Courses();
        courses.setCno("3-001");
        courses.setCname("BBB");
        courses.setTno("A001");
        return coursesService.insertCourses(courses);
    }
    @RequestMapping(value = {"/update"},method = RequestMethod.GET)
    public int updateCourses(){
        Courses courses = new Courses();
        courses.setCno("3-001");
        courses.setCname("CCCC");
        courses.setTno("A1234567");
        return coursesService.updateCourses(courses);
    }

    @RequestMapping(value = {"/delete"},method = RequestMethod.GET)
    public int deleteCourses(){
//        Courses courses = new Courses();
//        courses.setTno("123");
        String cno = "3-001";
        return coursesService.deleteCourses(cno);
    }
}
