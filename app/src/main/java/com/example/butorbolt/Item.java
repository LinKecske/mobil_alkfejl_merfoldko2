package com.example.butorbolt;

public class Item {
    private String nev;
    private String ar;
    private String leiras;
    private String kepUrl;

    public Item(){}

    Item(String nev, String ar, String leiras, String kepUrl){
        this.nev = nev;
        this.ar = ar;
        this.leiras = leiras;
        this.kepUrl = kepUrl;
    }

    public String getNev() {return nev;}
    public String getAr() {return ar;}
    public String getLeiras() {return leiras;}
    public String getKepUrl() {return kepUrl;}

    public void setNev(String nev) {this.nev = nev;}
    public void setAr(String ar) {this.ar = ar;}
    public void setKepUrl(String kepUrl) {this.kepUrl = kepUrl;}
    public void setLeiras(String leiras) {this.leiras = leiras;}
}
