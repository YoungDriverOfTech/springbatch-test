package com.koiwaLearning.api.service;

import com.koiwaLearning.api.domain.Score;
import com.koiwaLearning.api.domain.User;
import com.koiwaLearning.api.mapper.ScoreMapper;
import com.koiwaLearning.api.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreService {

    @Autowired
    private ScoreMapper scoreMapper;

    //查询所有分数
    public List<Score> findAllScores() {
        return scoreMapper.findAllScores();
    }

    //添加分数
    public int addScore(Score score){
        return scoreMapper.addScore(score);
    }

    // 删除分数
    public int deleteScore(Score score){
        return scoreMapper.deleteScore(score);
    }

    // 修改分数
    public int updateScore(Score score){
        return scoreMapper.updateScore(score);
    }
}
