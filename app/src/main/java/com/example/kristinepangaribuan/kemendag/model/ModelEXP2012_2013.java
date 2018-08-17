package com.example.kristinepangaribuan.kemendag.model;

import com.google.gson.annotations.SerializedName;

public class ModelEXP2012_2013 {
    @SerializedName("HSXCODE")
    private String HSXCODE;
    @SerializedName("TAHUN")
    private String TAHUN;
    @SerializedName("PROCMTH")
    private String PROCMTH;
    @SerializedName("PODALTCODE")
    private String PODALTCODE;
    @SerializedName("OLDCTRYCOD")
    private String OLDCTRYCOD;
    @SerializedName("DESTCTRY")
    private String DESTCTRY;
    @SerializedName("SITCCODE")
    private String SITCCODE;
    @SerializedName("NETWTHS")
    private Double NETWTHS;
    @SerializedName("FOBHSUSD")
    private Double FOBHSUSD;

    public ModelEXP2012_2013() {
    }

    public ModelEXP2012_2013(String HSXCODE, String TAHUN, String PROCMTH, String PODALTCODE, String OLDCTRYCOD, String DESTCTRY, String SITCCODE, Double NETWTHS, Double FOBHSUSD) {
        this.HSXCODE = HSXCODE;
        this.TAHUN = TAHUN;
        this.PROCMTH = PROCMTH;
        this.PODALTCODE = PODALTCODE;
        this.OLDCTRYCOD = OLDCTRYCOD;
        this.DESTCTRY = DESTCTRY;
        this.SITCCODE = SITCCODE;
        this.NETWTHS = NETWTHS;
        this.FOBHSUSD = FOBHSUSD;
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

    public String getPROCMTH() {
        return PROCMTH;
    }

    public void setPROCMTH(String PROCMTH) {
        this.PROCMTH = PROCMTH;
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

    public String getDESTCTRY() {
        return DESTCTRY;
    }

    public void setDESTCTRY(String DESTCTRY) {
        this.DESTCTRY = DESTCTRY;
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
}
