package com.koiwaLearning.api.mapper;

import com.koiwaLearning.api.domain.Score;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScoreMapper {
    // 查询成绩
    List<Score> findAllScores();

    // 添加成绩
    int addScore(Score score);

    // 删除成绩
    int deleteScore(Score score);

    // 修改课程
    int updateScore(Score score);
}
