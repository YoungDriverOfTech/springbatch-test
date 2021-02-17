package com.koiwaLearning.api.service;

import com.koiwaLearning.api.domain.Member;
import com.koiwaLearning.api.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    @Autowired
    private MemberMapper memberMapper;

    public List<Member> findMember() {
        return memberMapper.findMember();
    }

}
