package com.example.kristinepangaribuan.kemendag.model;

import com.google.gson.annotations.SerializedName;

public class ModelIMP2012_2013 {
    @SerializedName("PODALTCODE")
    private String PODALTCODE;
    @SerializedName("GAB")
    private String GAB;
    @SerializedName("TAHUN")
    private String TAHUN;
    @SerializedName("HSXCODE")
    private String HSXCODE;
    @SerializedName("SITCCODE")
    private String SITCCODE;
    @SerializedName("QTY")
    private Double QTY;
    @SerializedName("GROSSWTHS")
    private Double GROSSWTHS;
    @SerializedName("NETWTHS")
    private Double NETWTHS;
    @SerializedName("CIFHSUSD")
    private Double CIFHSUSD;
    @SerializedName("OLDCTRYCOD")
    private String OLDCTRYCOD;
    @SerializedName("CTRYORIG")
    private String CTRYORIG;

    public ModelIMP2012_2013() {
    }

    public ModelIMP2012_2013(String PODALTCODE, String GAB, String TAHUN, String HSXCODE, String SITCCODE, Double QTY, Double GROSSWTHS, Double NETWTHS, Double CIFHSUSD, String OLDCTRYCOD, String CTRYORIG) {
        this.PODALTCODE = PODALTCODE;
        this.GAB = GAB;
        this.TAHUN = TAHUN;
        this.HSXCODE = HSXCODE;
        this.SITCCODE = SITCCODE;
        this.QTY = QTY;
        this.GROSSWTHS = GROSSWTHS;
        this.NETWTHS = NETWTHS;
        this.CIFHSUSD = CIFHSUSD;
        this.OLDCTRYCOD = OLDCTRYCOD;
        this.CTRYORIG = CTRYORIG;
    }

    public String getPODALTCODE() {
        return PODALTCODE;
    }

    public void setPODALTCODE(String PODALTCODE) {
        this.PODALTCODE = PODALTCODE;
    }

    public String getGAB() {
        return GAB;
    }

    public void setGAB(String GAB) {
        this.GAB = GAB;
    }

    public String getTAHUN() {
        return TAHUN;
    }

    public void setTAHUN(String TAHUN) {
        this.TAHUN = TAHUN;
    }

    public String getHSXCODE() {
        return HSXCODE;
    }

    public void setHSXCODE(String HSXCODE) {
        this.HSXCODE = HSXCODE;
    }

    public String getSITCCODE() {
        return SITCCODE;
    }

    public void setSITCCODE(String SITCCODE) {
        this.SITCCODE = SITCCODE;
    }

    public Double getQTY() {
        return QTY;
    }

    public void setQTY(Double QTY) {
        this.QTY = QTY;
    }

    public Double getGROSSWTHS() {
        return GROSSWTHS;
    }

    public void setGROSSWTHS(Double GROSSWTHS) {
        this.GROSSWTHS = GROSSWTHS;
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

    public String getCTRYORIG() {
        return CTRYORIG;
    }

    public void setCTRYORIG(String CTRYORIG) {
        this.CTRYORIG = CTRYORIG;
    }
}
