package com.example.kristinepangaribuan.kemendag.model;

import com.google.gson.annotations.SerializedName;

public class Modelms_hs12 {
    @SerializedName("HS12_OK")
    private String HS12_OK;
    @SerializedName("NO")
    private Double NO;
    @SerializedName("HS12")
    private String HS12;
    @SerializedName("DESK1")
    private String DESK1;
    @SerializedName("DESK2")
    private String DESK2;
    @SerializedName("SEKTOR")
    private String SEKTOR;

    public Modelms_hs12() {
    }

    public Modelms_hs12(String HS12_OK, Double NO, String HS12, String DESK1, String DESK2, String SEKTOR) {
        this.HS12_OK = HS12_OK;
        this.NO = NO;
        this.HS12 = HS12;
        this.DESK1 = DESK1;
        this.DESK2 = DESK2;
        this.SEKTOR = SEKTOR;
    }

    public String getHS12_OK() {
        return HS12_OK;
    }

    public void setHS12_OK(String HS12_OK) {
        this.HS12_OK = HS12_OK;
    }

    public Double getNO() {
        return NO;
    }

    public void setNO(Double NO) {
        this.NO = NO;
    }

    public String getHS12() {
        return HS12;
    }

    public void setHS12(String HS12) {
        this.HS12 = HS12;
    }

    public String getDESK1() {
        return DESK1;
    }

    public void setDESK1(String DESK1) {
        this.DESK1 = DESK1;
    }

    public String getDESK2() {
        return DESK2;
    }

    public void setDESK2(String DESK2) {
        this.DESK2 = DESK2;
    }

    public String getSEKTOR() {
        return SEKTOR;
    }

    public void setSEKTOR(String SEKTOR) {
        this.SEKTOR = SEKTOR;
    }
}
