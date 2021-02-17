package com.itemReaderDB;

import java.util.Date;

public class Teacher {
    public Integer gettNo() {
        return tNo;
    }

    public String gettName() {
        return tName;
    }

    public String gettSex() {
        return tSex;
    }

    public Date gettBirthday() {
        return tBirthday;
    }

    public String getProf() {
        return prof;
    }

    public String getDepart() {
        return depart;
    }

    public void settNo(Integer tNo) {
        this.tNo = tNo;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public void settSex(String tSex) {
        this.tSex = tSex;
    }

    public void settBirthday(Date tBirthday) {
        this.tBirthday = tBirthday;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    private Integer tNo;
    private String tName;
    private String tSex;
    private Date tBirthday;
    private String prof;
    private String depart;

    @Override
    public String toString() {
        return "Teacher{" +
                "tNo=" + tNo +
                ", tName='" + tName + '\'' +
                ", tSex='" + tSex + '\'' +
                ", tBirthday=" + tBirthday +
                ", prof='" + prof + '\'' +
                ", depart='" + depart + '\'' +
                '}';
    }
}
