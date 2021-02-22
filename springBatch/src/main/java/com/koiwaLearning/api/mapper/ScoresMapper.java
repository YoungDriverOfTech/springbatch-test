package com.koiwaLearning.api.mapper;

import com.koiwaLearning.api.domain.Scores;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScoresMapper {

    //检索
    List<Scores> findScores();
    //追加
    int insertScores(Scores scores);
    //更新
    int updateScores(Scores scores);
    //删除
    int deleteScores(String string);

}
