package com.koiwaLearning.api.controller;

import com.koiwaLearning.api.domain.Students;
import com.koiwaLearning.api.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentsController {

    @Autowired
    private StudentsService studentsService;

    //检索
    @RequestMapping(value = {"/select"},method = RequestMethod.GET)
    public List<Students> selectStudents(){
        return studentsService.findStudents();
    }

    //追加
    @RequestMapping(value = {"/insert"}, method = RequestMethod.GET)
    public  int inserStudents(){

        Students students =new Students();
        students.setSno("123");
        students.setSname("AAA");
        students.setSsex("M");
        students.setSbirthday(Timestamp.valueOf("2020-12-12 01:01:01"));
        students.setSclass("#A");
        return studentsService.insertStudents(students);
    }
    //更新
    @RequestMapping(value = {"/update"},method = RequestMethod.GET)
    public int updateStudents(){
        Students students = new Students();
        students.setSno("123");
        students.setSname("BBB");
        students.setSclass("#HHH");
        return studentsService.updateStudents(students);
    }
    //删除
    @RequestMapping(value = {"/delete"},method = RequestMethod.GET)
    public int deleteStudents(){
        Students students = new Students();
        students.setSno("123");
        return studentsService.deleteStudents(students);
    }

}
