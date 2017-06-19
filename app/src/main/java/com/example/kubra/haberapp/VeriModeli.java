package com.example.kubra.haberapp;

/**
 * Created by kubra on 11.06.2017.
 */

public class VeriModeli {
    private String haberSitesiAdi,link;
    private int logo;

    public VeriModeli(String haberSitesiAdi, int logo,String link) {
        this.haberSitesiAdi = haberSitesiAdi;
        this.logo = logo;
       this.link=link;
    }

    public String getHaberSitesiAdi() {
        return haberSitesiAdi;
    }

    public void setHaberSitesiAdi(String haberSitesiAdi) {
        this.haberSitesiAdi = haberSitesiAdi;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getHaberLink() {
        return link;
    }

    public void setHaberLink(String link) {
       this. link = link;
    }
}
