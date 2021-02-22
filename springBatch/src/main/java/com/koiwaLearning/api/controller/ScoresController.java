package com.koiwaLearning.api.controller;

import com.koiwaLearning.api.domain.Scores;
import com.koiwaLearning.api.service.ScoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/scores")
public class ScoresController {
    @Autowired
    private ScoresService scoresService;

    //检索
    @RequestMapping(value = {"/select"},method = RequestMethod.GET)
    public List<Scores> selectScores(){
        return scoresService.findScores();
    }
    //追加
    @RequestMapping(value = {"/insert"},method = RequestMethod.GET)
    public int insertScores(){
        Scores scores = new Scores();
        scores.setSno("123");
        scores.setCno("6-707");
        scores.setDegree(100);
        return scoresService.insertScores(scores);
    }
    //更新
    @RequestMapping(value = {"/update"},method = RequestMethod.GET)
    public int updateScores(){
        Scores scores = new Scores();
        scores.setSno("123");
        scores.setCno("6-767");
        scores.setDegree(12);
        return scoresService.updateScores(scores);
    }
    //删除
    @RequestMapping(value = {"/delete"},method = RequestMethod.GET)
    public int deleteScore(){
        String sno = "123";
        return scoresService.deletScores(sno);
    }
}
