package com.koiwaLearning.api.domain;

public class Students {

    private String sno;

    private String sname;

    private String ssex;

    private String sbirthday;

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

    public String getSbirthday() {
        return sbirthday;
    }

    public void setSbirthday(String sbirthday) {
        this.sbirthday = sbirthday;
    }

    public String getSclass() {
        return sclass;
    }

    public void setSclass(String sclass) {
        this.sclass = sclass;
    }
}
