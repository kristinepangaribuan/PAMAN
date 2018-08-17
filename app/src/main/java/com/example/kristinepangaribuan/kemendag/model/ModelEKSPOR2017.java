package com.example.kristinepangaribuan.kemendag.model;

import com.google.gson.annotations.SerializedName;

public class ModelEKSPOR2017 {
    @SerializedName("HS2017")
    private String HS2017;
    @SerializedName("TAHUN")
    private String TAHUN;
    @SerializedName("BLN_PROSES")
    private String BLN_PROSES;
    @SerializedName("THN_PROSES")
    private String THN_PROSES;
    @SerializedName("NGR_TUJUAN")
    private String NGR_TUJUAN;
    @SerializedName("NETWTHS")
    private Double NETWTHS;
    @SerializedName("FOBSUSD")
    private Double FOBHSUSD;
    @SerializedName("OLDCTRYCOD")
    private String OLDCTRYCOD;
    @SerializedName("PODALTCODE")
    private String PODALTCODE;

    public ModelEKSPOR2017() {
    }

    public ModelEKSPOR2017(String HS2017, String TAHUN, String BLN_PROSES, String THN_PROSES, String NGR_TUJUAN, Double NETWTHS, Double FOBHSUSD, String OLDCTRYCOD, String PODALTCODE) {
        this.HS2017 = HS2017;
        this.TAHUN = TAHUN;
        this.BLN_PROSES = BLN_PROSES;
        this.THN_PROSES = THN_PROSES;
        this.NGR_TUJUAN = NGR_TUJUAN;
        this.NETWTHS = NETWTHS;
        this.FOBHSUSD = FOBHSUSD;
        this.OLDCTRYCOD = OLDCTRYCOD;
        this.PODALTCODE = PODALTCODE;
    }

    public String getHS2017() {
        return HS2017;
    }

    public void setHS2017(String HS2017) {
        this.HS2017 = HS2017;
    }

    public String getTAHUN() {
        return TAHUN;
    }

    public void setTAHUN(String TAHUN) {
        this.TAHUN = TAHUN;
    }

    public String getBLN_PROSES() {
        return BLN_PROSES;
    }

    public void setBLN_PROSES(String BLN_PROSES) {
        this.BLN_PROSES = BLN_PROSES;
    }

    public String getTHN_PROSES() {
        return THN_PROSES;
    }

    public void setTHN_PROSES(String THN_PROSES) {
        this.THN_PROSES = THN_PROSES;
    }

    public String getNGR_TUJUAN() {
        return NGR_TUJUAN;
    }

    public void setNGR_TUJUAN(String NGR_TUJUAN) {
        this.NGR_TUJUAN = NGR_TUJUAN;
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
