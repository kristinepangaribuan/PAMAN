package com.example.kristinepangaribuan.kemendag.model;

import com.google.gson.annotations.SerializedName;

public class ModelMstHS2007 {
    @SerializedName("hs07")
    private String hs07;
    @SerializedName("desk")
    private String desk;
    @SerializedName("bec")
    private String bec;
    @SerializedName("sitc")
    private String sitc;
    @SerializedName("oilgrpcode")
    private String oilgrpcode;
    @SerializedName("soilgrpcod")
    private String soilgrpcod;
    @SerializedName("sector_cod")
    private String sector_cod;
    @SerializedName("sector_desk")
    private String sector_desk;
    @SerializedName("ket")
    private String ket;

    public ModelMstHS2007() {
    }

    public ModelMstHS2007(String hs07, String desk, String bec, String sitc, String oilgrpcode, String soilgrpcod, String sector_cod, String sector_desk, String ket) {
        this.hs07 = hs07;
        this.desk = desk;
        this.bec = bec;
        this.sitc = sitc;
        this.oilgrpcode = oilgrpcode;
        this.soilgrpcod = soilgrpcod;
        this.sector_cod = sector_cod;
        this.sector_desk = sector_desk;
        this.ket = ket;
    }

    public String getHs07() {
        return hs07;
    }

    public void setHs07(String hs07) {
        this.hs07 = hs07;
    }

    public String getDesk() {
        return desk;
    }

    public void setDesk(String desk) {
        this.desk = desk;
    }

    public String getBec() {
        return bec;
    }

    public void setBec(String bec) {
        this.bec = bec;
    }

    public String getSitc() {
        return sitc;
    }

    public void setSitc(String sitc) {
        this.sitc = sitc;
    }

    public String getOilgrpcode() {
        return oilgrpcode;
    }

    public void setOilgrpcode(String oilgrpcode) {
        this.oilgrpcode = oilgrpcode;
    }

    public String getSoilgrpcod() {
        return soilgrpcod;
    }

    public void setSoilgrpcod(String soilgrpcod) {
        this.soilgrpcod = soilgrpcod;
    }

    public String getSector_cod() {
        return sector_cod;
    }

    public void setSector_cod(String sector_cod) {
        this.sector_cod = sector_cod;
    }

    public String getSector_desk() {
        return sector_desk;
    }

    public void setSector_desk(String sector_desk) {
        this.sector_desk = sector_desk;
    }

    public String getKet() {
        return ket;
    }

    public void setKet(String ket) {
        this.ket = ket;
    }
}
