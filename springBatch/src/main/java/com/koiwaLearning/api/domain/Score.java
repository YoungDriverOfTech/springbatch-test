package com.koiwaLearning.api.domain;

public class Score {
    private Integer studentNumber;
    private String courseNumber;
    private Integer degree;

    public Score(Integer studentNumber, String courseNumber, Integer degree) {
        this.studentNumber = studentNumber;
        this.courseNumber = courseNumber;
        this.degree = degree;
    }

    public Score() {
    }

    public Integer getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(Integer studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public Integer getDegree() {
        return degree;
    }

    public void setDegree(Integer degree) {
        this.degree = degree;
    }
}
