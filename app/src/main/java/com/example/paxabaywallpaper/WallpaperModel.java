package com.example.paxabaywallpaper;

public class WallpaperModel {
    private int id;
    private String portraiturl,mediumurl;

    public WallpaperModel() {
    }

    public WallpaperModel(int id, String portraiturl, String mediumurl) {
        this.id = id;
        this.portraiturl = portraiturl;
        this.mediumurl = mediumurl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPortraiturl() {
        return portraiturl;
    }

    public void setPortraiturl(String portraiturl) {
        this.portraiturl = portraiturl;
    }

    public String getMediumurl() {
        return mediumurl;
    }

    public void setMediumurl(String mediumurl) {
        this.mediumurl = mediumurl;
    }
}
