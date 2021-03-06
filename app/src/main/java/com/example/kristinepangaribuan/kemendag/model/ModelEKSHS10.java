package com.example.kristinepangaribuan.kemendag.model;

import com.google.gson.annotations.SerializedName;

public class ModelEKSHS10 {
    @SerializedName("hsxcode")
    private String HSXCODE;
    @SerializedName("tahun")
    private String TAHUN;
    @SerializedName("podaltcode")
    private String PODALTCODE;
    @SerializedName("oldctrycod")
    private String OLDCTRYCOD;
    @SerializedName("sitccode")
    private String SITCCODE;
    @SerializedName("netwths")
    private Double NETWTHS;
    @SerializedName("fobhsusd")
    private Double FOBHSUSD;
    @SerializedName("destctry")
    private String DESTCTRY;
    @SerializedName("prov")
    private String PROV;

    public ModelEKSHS10() {
    }

    public ModelEKSHS10(String HSXCODE, String TAHUN, String PODALTCODE, String OLDCTRYCOD, String SITCCODE, Double NETWTHS, Double FOBHSUSD, String DESTCTRY, String PROV) {
        this.HSXCODE = HSXCODE;
        this.TAHUN = TAHUN;
        this.PODALTCODE = PODALTCODE;
        this.OLDCTRYCOD = OLDCTRYCOD;
        this.SITCCODE = SITCCODE;
        this.NETWTHS = NETWTHS;
        this.FOBHSUSD = FOBHSUSD;
        this.DESTCTRY = DESTCTRY;
        this.PROV = PROV;
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

    public String getPODALTCODE() {
        return PODALTCODE;
    }

    public void setPODALTCODE(String PODALTCODE) {
        this.PODALTCODE = PODALTCODE;
    }

    public String getOLDCTRYCOD() {
        return OLDCTRYCOD;
    }

    public void setOLDCTRYCOD(String OLDCTRYCOD) {
        this.OLDCTRYCOD = OLDCTRYCOD;
    }

    public String getSITCCODE() {
        return SITCCODE;
    }

    public void setSITCCODE(String SITCCODE) {
        this.SITCCODE = SITCCODE;
    }

    public Double getNETWTHS() {
        return NETWTHS;
    }

    public void setNETWTHS(Double NETWTHS) {
        this.NETWTHS = NETWTHS;
    }

    public Double getFOBHSUSD() {
        return FOBHSUSD;
    }

    public void setFOBHSUSD(Double FOBHSUSD) {
        this.FOBHSUSD = FOBHSUSD;
    }

    public String getDESTCTRY() {
        return DESTCTRY;
    }

    public void setDESTCTRY(String DESTCTRY) {
        this.DESTCTRY = DESTCTRY;
    }

    public String getPROV() {
        return PROV;
    }

    public void setPROV(String PROV) {
        this.PROV = PROV;
    }
}
