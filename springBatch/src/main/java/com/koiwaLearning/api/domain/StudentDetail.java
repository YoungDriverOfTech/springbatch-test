package com.koiwaLearning.api.domain;

public class StudentDetail {

    private String id;

    private String name;

    private String sex;

    private String birthday;

    private String className;

    public StudentDetail() {
    }

    public StudentDetail(String id, String name, String sex, String birthday, String className) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.className = className;
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

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
