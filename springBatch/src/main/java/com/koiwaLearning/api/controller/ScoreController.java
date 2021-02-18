package com.koiwaLearning.api.controller;

import com.koiwaLearning.api.domain.Score;
import com.koiwaLearning.api.domain.User;
import com.koiwaLearning.api.service.ScoreService;
import com.koiwaLearning.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    // 查询所有分数
    @RequestMapping(value = "/findAllScores", method = RequestMethod.GET)
    public List<Score> findAllScores() {
        return scoreService.findAllScores();
    }

    // 添加分数
    @RequestMapping(value = "/addScore", method = RequestMethod.GET)
    public int addScore() {
        Score score = new Score();
        score.setStudentNumber(109);
        score.setCourseNumber("6-666");
        score.setDegree(99);
        return scoreService.addScore(score);
    }

    // 删除分数
    @RequestMapping(value = "/deleteScore", method = RequestMethod.GET)
    public int deleteScore(){
        Score score = new Score();
        score.setStudentNumber(109);
        score.setCourseNumber("6-666");
        return scoreService.deleteScore(score);
    }
    // 修改分数
    @RequestMapping(value = "/updateScore", method = RequestMethod.GET)
    public int update(){
        Score score = new Score();
        score.setDegree(50);
        score.setCourseNumber("6-666");
        score.setStudentNumber(109);
        return scoreService.updateScore(score);
    }
}
