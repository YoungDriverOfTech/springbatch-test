package com.koiwaLearning.api.controller;

import com.koiwaLearning.api.domain.Students;
import com.koiwaLearning.api.domain.StudentsInfo;
import com.koiwaLearning.api.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentsController {

    @Autowired
    private StudentsService studentsService;

    /**
     * 查询学生
     */
    @RequestMapping(value = "/getStudentsInfo", method = RequestMethod.GET)
    public ModelAndView getStudentsInfo(Model model) {
        model.addAttribute("studentList",studentsService.getStudentsInfo());
        model.addAttribute("title", "学生信息");
        return new ModelAndView("students/studentsInfoSelect","studentModel",model);
    }
    @RequestMapping(value="/getStudent",method = RequestMethod.GET)
    public Students getStudentById(@RequestParam("getStuId") String getStuId){
        Students getStudentById = studentsService.getStudentById(getStuId);
        return getStudentById;

    }
    //删除学生
    @RequestMapping(value ="/deletStudent",method = RequestMethod.GET)
    public String deletStuByid(@RequestParam("deleStuId") String deleStuId) {
        // 先查询一次 如果有 删除 并且返回删除成功
        Students getStudentById = studentsService.getStudentById(deleStuId);
        if (getStudentById != null ) {
            studentsService.deleteStudents(deleStuId);
            return "删除成功";
        }
        // 如果没有那么返回 没有可以被删除的数据
        return "没有可以被删除的用户";
    }

    /**
     * 获取创建表单页面
     */
    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public ModelAndView createForm(Model model) {
        model.addAttribute("student",new StudentsInfo());
        model.addAttribute("title", "创建学生");
        return new ModelAndView("students/studentsInfoInsert","studentModel",model);
    }

    /**
     * 新增学生
     */
    @RequestMapping(value = "/insertStudent", method = RequestMethod.GET)
    public String  insertStudentsInfo(@RequestParam("xname") String xname,@RequestParam("xsex") String xsex,
                                      @RequestParam("xbirthday") String xbirthday,@RequestParam("xclass") String xclass) {
        if (xname.length() > 4) {
            return "名字长度超过了限制，重新输入";
        }
        if(xclass.length() > 5){
            return "班级名字超过限制";
        }
        if(xsex.length() > 2){
            return "性别输入不正确";
        }

        List<Students> allStudents = studentsService.findAll();
        int snoMax=0;                         //遍历所有students的学号
        for(int i=0;i<allStudents.size();i++){
            Students stu = allStudents.get(i);
            String sno = stu.getSno();
            int studentSno = Integer.parseInt(sno);


            if(studentSno > snoMax){
                snoMax=studentSno;
            }
        }
        int sno1=snoMax+1;
        String sn = String.valueOf(sno1);
        Students stu = new Students();//new一个对象用来存储
        stu.setSno(sn);
        stu.setSname(xname);
        stu.setSsex(xsex);
        stu.setSclass(xclass);
        studentsService.insertStudent(stu);//表示插入
        return "插入成功";

    }

}
