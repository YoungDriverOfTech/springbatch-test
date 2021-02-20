package com.koiwaLearning.api.domain;

import java.sql.Timestamp;

public class Students {

    private String sno;

    private String sname;

    private String ssex;

    private Timestamp sbirthday;

    private String sclass;

    public Students() {
    }

    public Students(String sno, String sname, String ssex, Timestamp sbirthday, String sclass) {
        this.sno = sno;
        this.sname = sname;
        this.ssex = ssex;
        this.sbirthday = sbirthday;
        this.sclass = sclass;
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
