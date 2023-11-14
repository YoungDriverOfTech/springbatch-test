package com.koiwaLearning.api.domain;

public class StudentsInfo {

    private String id;

    private String name;

    private String sex;

    private String courseName;

    private String score;

    public StudentsInfo() {
    }

    public StudentsInfo(String id, String name, String sex, String courseName, String score) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.courseName = courseName;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
