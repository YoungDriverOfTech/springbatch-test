package com.koiwaLearning.api.mapper;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface MemberMapper {

    List<Map> findMember();
}
