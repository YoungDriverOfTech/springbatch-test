package com.koiwaLearning.api.domain;

import java.sql.Timestamp;

public class Teacher {
    private Integer id;
    private String name;
    private String gender;
    private Timestamp birthday;
    private String prof;
    private String depart;

    public Teacher(Integer id, String name, String gender, Timestamp birthday, String prof, String depart) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.prof = prof;
        this.depart = depart;
    }

    public Teacher() {
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

    public String getProf() {
        return prof;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }
}
