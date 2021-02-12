package com.koiwaLearning.group.mapper;

import com.koiwaLearning.group.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    List<User> findAllUsers();
}
