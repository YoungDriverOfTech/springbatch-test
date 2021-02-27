package com.koiwaLearning.api.service;

import com.koiwaLearning.api.domain.Courses;
import com.koiwaLearning.api.domain.Scores;
import com.koiwaLearning.api.mapper.CoursesMapper;
import com.koiwaLearning.api.mapper.ScoresMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoresService {
    @Autowired
    private ScoresMapper scoresMapper;

    //检索
    public List<Scores> findScores(){
        return scoresMapper.findScores();
    }
    //追加
    public int insertScores(Scores scores){
        return scoresMapper.insertScores(scores);
    }
    //更新
    public int updateScores(Scores scores){
        return scoresMapper.updateScores(scores);
    }
    //删除
    public int deletScores(String string){
        return scoresMapper.deleteScores(string);
    }
}
