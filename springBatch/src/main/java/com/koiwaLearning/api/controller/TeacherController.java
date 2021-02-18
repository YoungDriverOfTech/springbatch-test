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
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    //查询所有老师
    @RequestMapping(value = "/findAllTeachers", method = RequestMethod.GET)
    public List<Teacher> findAllTeachers() {
        return teacherService.findAllTeachers();
    }

    //添加老师
    @RequestMapping(value = "/addTeacher", method = RequestMethod.GET)
    public int addTeacher(){
        Teacher teacher = new Teacher();
        teacher.setId(666);
        teacher.setName("Sun");
        teacher.setGender("男");
        teacher.setBirthday(Timestamp.valueOf("2021-02-17 01:02:03"));
        teacher.setProf("Master");
        teacher.setDepart("English");
        return teacherService.addTeacher(teacher);
    }

    //删除老师
    @RequestMapping(value = "/deleteTeacher", method = RequestMethod.GET)
    public int deleteTeacher() {
        Integer tno = 666;
        return teacherService.deleteTeacher(tno);
    }

    // 修改老师数据
    @RequestMapping(value = "/updateTeacher", method = RequestMethod.GET)
    public int updateStudent() {
        Teacher teacher = new Teacher();
        teacher.setId(666);
        teacher.setName("MON");
        teacher.setGender("F");
        teacher.setBirthday(Timestamp.valueOf("1999-01-17 01:02:03"));
        teacher.setProf("Wu");
        teacher.setDepart("Chinese");
        return teacherService.updateTeacher(teacher);
    }

}
