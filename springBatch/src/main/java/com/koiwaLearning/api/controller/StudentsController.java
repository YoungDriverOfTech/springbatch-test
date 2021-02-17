package com.koiwaLearning.api.controller;

import com.koiwaLearning.api.domain.StudentsInfo;
import com.koiwaLearning.api.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentsController {

    @Autowired
    private StudentsService studentsService;

    @RequestMapping(value = "/getStudentsInfo", method = RequestMethod.GET)
    public List<StudentsInfo> getStudentsInfo() {
        return studentsService.getStudentsInfo();
    }
}
