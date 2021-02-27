package com.koiwaLearning.api.domain;
/*
CREATE TABLE scores(
    sno VARCHAR (3) NOT NULL
    , cno VARCHAR (5) NOT NULL
    , degree NUMERIC (10, 1) NOT NULL
);
 */
public class Scores {
    private String sno;
    private String cno;
    private Integer degree;

    public Scores(String sno, String cno, Integer degree) {
        this.sno = sno;
        this.cno = cno;
        this.degree = degree;
    }

    public Scores() {
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public Integer getDegree() {
        return degree;
    }

    public void setDegree(Integer degree) {
        this.degree = degree;
    }
}
