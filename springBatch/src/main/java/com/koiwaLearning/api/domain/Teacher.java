package com.koiwaLearning.api.domain;

import java.sql.Timestamp;

public class Teacher {
    private String tno;
    private String tname;
    private String tsex;
    private Timestamp tbirthday;
    private String prof;
    private String depart;

    public Teacher() {
    }

    public Teacher(String tno, String tname, String tsex, Timestamp tbirthday, String prof, String depart) {
        this.tno = tno;
        this.tname = tname;
        this.tsex = tsex;
        this.tbirthday = tbirthday;
        this.prof = prof;
        this.depart = depart;
    }

    public String getTno() {
        return tno;
    }

    public void setTno(String tno) {
        this.tno = tno;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTsex() {
        return tsex;
    }

    public void setTsex(String tsex) {
        this.tsex = tsex;
    }

    public Timestamp getTbirthday() {
        return tbirthday;
    }

    public void setTbirthday(Timestamp tbirthday) {
        this.tbirthday = tbirthday;
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
