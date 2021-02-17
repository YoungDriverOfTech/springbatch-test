package com.koiwaLearning.api.service;

import com.koiwaLearning.api.domain.Students;
import com.koiwaLearning.api.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MemberService {

    @Autowired
    private MemberMapper memberMapper;

    public List<Map> findMember() {
        return memberMapper.findMember();
    }

}
