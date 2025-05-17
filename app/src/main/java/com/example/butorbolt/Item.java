package com.example.butorbolt;

public class Item {
    private String nev;
    private String ar;
    private String leiras;
    private int kep;

    Item(String nev, String ar, String leiras, int kep){
        this.nev = nev;
        this.ar = ar;
        this.leiras = leiras;
        this.kep = kep;
    }

    public String getNev() {
        return nev;
    }

    public String getAr() {
        return ar;
    }

    public String getLeiras() {
        return leiras;
    }

    public int getKep() {
        return kep;
    }
}
