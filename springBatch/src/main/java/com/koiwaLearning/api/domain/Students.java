package com.koiwaLearning.api.domain;

import java.sql.Timestamp;

public class Students {

    private String sno;

    private String sname;

    private String ssex;

    private Timestamp sbirthday;

    private String sclass;

    @Override
    public String toString() {
        return "Students{" +
                "sno='" + sno + '\'' +
                ", sname='" + sname + '\'' +
                ", ssex='" + ssex + '\'' +
                ", sbirthday='" + sbirthday + '\'' +
                ", sclass='" + sclass + '\'' +
                '}';
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public Timestamp getSbirthday() {
        return sbirthday;
    }

    public void setSbirthday(Timestamp sbirthday) {
        this.sbirthday = sbirthday;
    }

    public String getSclass() {
        return sclass;
    }

    public void setSclass(String sclass) {
        this.sclass = sclass;
    }
}
