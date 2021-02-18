package com.koiwaLearning.api.domain;

public class Teachers {

    private String tno;

    private String tname;

    private String tsex;

    private String tbirthday;

    private String prof;

    private String depart;

    @Override
    public String toString() {
        return "Teachers{" +
                "tno='" + tno + '\'' +
                ", tname='" + tname + '\'' +
                ", tsex='" + tsex + '\'' +
                ", tbirthday='" + tbirthday + '\'' +
                ", prof='" + prof + '\'' +
                ", depart='" + depart + '\'' +
                '}';
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

    public String getTbirthday() {
        return tbirthday;
    }

    public void setTbirthday(String tbirthday) {
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
