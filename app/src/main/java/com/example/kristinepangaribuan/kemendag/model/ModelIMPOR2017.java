package com.example.kristinepangaribuan.kemendag.model;

import com.google.gson.annotations.SerializedName;

public class ModelIMPOR2017 {
    @SerializedName("HSXCODE")
    private String HSXCODE;
    @SerializedName("TAHUN")
    private String TAHUN;
    @SerializedName("JENIS")
    private String JENIS;
    @SerializedName("NETWTHS")
    private Double NETWTHS;
    @SerializedName("CIFHSUSD")
    private Double CIFHSUSD;
    @SerializedName("OLDCTRYCOD")
    private String OLDCTRYCOD;
    @SerializedName("PODALTCODE")
    private String PODALTCODE;

    public ModelIMPOR2017() {
    }

    public ModelIMPOR2017(String HSXCODE, String TAHUN, String JENIS, Double NETWTHS, Double CIFHSUSD, String OLDCTRYCOD, String PODALTCODE) {
        this.HSXCODE = HSXCODE;
        this.TAHUN = TAHUN;
        this.JENIS = JENIS;
        this.NETWTHS = NETWTHS;
        this.CIFHSUSD = CIFHSUSD;
        this.OLDCTRYCOD = OLDCTRYCOD;
        this.PODALTCODE = PODALTCODE;
    }

    public String getHSXCODE() {
        return HSXCODE;
    }

    public void setHSXCODE(String HSXCODE) {
        this.HSXCODE = HSXCODE;
    }

    public String getTAHUN() {
        return TAHUN;
    }

    public void setTAHUN(String TAHUN) {
        this.TAHUN = TAHUN;
    }

    public String getJENIS() {
        return JENIS;
    }

    public void setJENIS(String JENIS) {
        this.JENIS = JENIS;
    }

    public Double getNETWTHS() {
        return NETWTHS;
    }

    public void setNETWTHS(Double NETWTHS) {
        this.NETWTHS = NETWTHS;
    }

    public Double getCIFHSUSD() {
        return CIFHSUSD;
    }

    public void setCIFHSUSD(Double CIFHSUSD) {
        this.CIFHSUSD = CIFHSUSD;
    }

    public String getOLDCTRYCOD() {
        return OLDCTRYCOD;
    }

    public void setOLDCTRYCOD(String OLDCTRYCOD) {
        this.OLDCTRYCOD = OLDCTRYCOD;
    }

    public String getPODALTCODE() {
        return PODALTCODE;
    }

    public void setPODALTCODE(String PODALTCODE) {
        this.PODALTCODE = PODALTCODE;
    }
}
