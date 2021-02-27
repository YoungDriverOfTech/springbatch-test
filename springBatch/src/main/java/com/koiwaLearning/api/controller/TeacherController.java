package com.koiwaLearning.api.controller;

import com.koiwaLearning.api.domain.Teacher;
import com.koiwaLearning.api.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @RequestMapping(value = {"/select"},method = RequestMethod.GET)
    public List<Teacher> selectTeacher(){
        return teacherService.findTeacher();
    }
    @RequestMapping(value = {"/insert"},method = RequestMethod.GET)
    public int insertTeacher(){
        Teacher teacher = new Teacher();
        teacher.setTno("109");
        teacher.setTname("王老师");
        teacher.setTsex("男");
        teacher.setTbirthday(Timestamp.valueOf("2009-09-10 12:12:01"));
        teacher.setProf("专业一级");
        teacher.setDepart("计算机工程");
        return teacherService.insertTeacher(teacher);
    }
    @RequestMapping(value = {"/update"},method = RequestMethod.GET)
    public int updateTeacher(){
        Teacher teacher = new Teacher();
        teacher.setTno("109");
        teacher.setTname("xxxx");
        teacher.setTbirthday(Timestamp.valueOf("2019-09-09 10:11:00"));
        teacher.setProf("一级导师");
        teacher.setDepart("土木工程");
        return teacherService.updateTeacher(teacher);
    }
    @RequestMapping(value = {"/delete"},method = RequestMethod.GET)
    public int deleteTeacher(){
       Teacher teacher = new Teacher();
       teacher.setTno("109");
        return teacherService.deleteTeacher(teacher);
    }
}
