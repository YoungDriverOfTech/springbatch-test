package com.koiwaLearning.api.controller;

import com.koiwaLearning.api.domain.Member;
import com.koiwaLearning.api.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    //連結検索
    @RequestMapping(value = {"/select"}, method = RequestMethod.GET)
    public List<Member> selectMember() {
        return memberService.findMember();
    }
}
