package com.koiwaLearning.api.mapper;

import com.koiwaLearning.api.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    List<User> findAllUsers();
}
