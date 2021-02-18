package com.koiwaLearning.api.domain;

public class Course {

    private String courseNumber;
    private String coursesName;
    private Integer teacherNumber;

    public Course(String courseNumber, String coursesName, Integer teacherNumber) {
        this.courseNumber = courseNumber;
        this.coursesName = coursesName;
        this.teacherNumber = teacherNumber;
    }

    public Course() {
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getCoursesName() {
        return coursesName;
    }

    public void setCoursesName(String coursesName) {
        this.coursesName = coursesName;
    }

    public Integer getTeacherNumber() {
        return teacherNumber;
    }

    public void setTeacherNumber(Integer teacherNumber) {
        this.teacherNumber = teacherNumber;
    }
}
