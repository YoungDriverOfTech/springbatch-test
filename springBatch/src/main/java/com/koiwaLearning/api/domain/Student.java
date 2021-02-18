package com.koiwaLearning.api.domain;

import java.sql.Timestamp;

public class Student {
    private Integer id;
    private String name;
    private String gender;
    private Timestamp birthday;
    private Integer studentClass;

    public Student(Integer id, String name, String gender, Timestamp birthday, Integer studentClass) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.studentClass = studentClass;
    }

    public Student() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Timestamp getBirthday() {
        return birthday;
    }

    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
    }

    public Integer getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(Integer studentClass) {
        this.studentClass = studentClass;
    }
}
