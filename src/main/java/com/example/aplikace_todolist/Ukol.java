package com.example.aplikace_todolist;

public class Ukol {

    private String popis;
    private String ukol;

    public Ukol(String popis, String ukol) {
        this.popis = popis;
        this.ukol = ukol;
    }

    public void setPopis(String popis) {
        this.popis = popis;
    }

    public void setUkol(String ukol) {
        this.ukol = ukol;
    }

    public String getPopis() {
        return popis;
    }

    public String getUkol() {
        return ukol;
    }
    public String toString() {
        return ukol;
    }
}
