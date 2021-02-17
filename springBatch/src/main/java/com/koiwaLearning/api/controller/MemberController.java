package com.koiwaLearning.api.controller;

import com.koiwaLearning.api.domain.Students;
import com.koiwaLearning.api.service.MemberService;
import com.koiwaLearning.api.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @RequestMapping(value = {"/select"}, method = RequestMethod.GET)
    public List<Map> selectMember() {
        return memberService.findMember();
    }
}
