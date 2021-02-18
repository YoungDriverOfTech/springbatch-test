package com.koiwaLearning.api.mapper;

import com.koiwaLearning.api.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberMapper {

    List<Member> findMember();
}
