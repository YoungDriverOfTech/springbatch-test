package com.koiwaLearning.api.controller;

import com.koiwaLearning.api.domain.Student;
import com.koiwaLearning.api.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    //查询所有学生
    @RequestMapping(value = "/findAllStudents", method = RequestMethod.GET)
    public List<Student> findAllStudents() {
        return studentService.findAllStudents();
    }

    //添加学生
    @RequestMapping(value = "/addStudent", method = RequestMethod.GET)
    public int addStudent() {
        Student student = new Student();
        student.setId(666);
        student.setName("TOM");
        student.setGender("男");
        student.setBirthday(Timestamp.valueOf("2021-02-17 01:02:03"));
        student.setStudentClass(309);
        return studentService.addStudent(student);
    }
    //删除学生
    @RequestMapping(value = "/deleteStudent", method = RequestMethod.GET)
    public int deleteStudent() {
        Integer sno = 666;
        return studentService.deleteStudent(sno);
    }

    //修改学生数据
    @RequestMapping(value = "/updateStudent", method = RequestMethod.GET)
    public int updateStudent() {
        Student student = new Student();
        student.setId(666);
        student.setName("SUN");
        student.setGender("F");
        student.setBirthday(Timestamp.valueOf("2021-01-17 01:02:03"));
        student.setStudentClass(207);
        return studentService.updateStudent(student);
    }
}
