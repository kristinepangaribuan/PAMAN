package com.example.kristinepangaribuan.kemendag.model;

import com.google.gson.annotations.SerializedName;

public class ModelIMPBTKI {
    @SerializedName("Id")
    private int Id;
    @SerializedName("PODALTCODE")
    private String PODALTCODE;
    @SerializedName("OLDCTRYCOD")
    private String OLDCTRYCOD;
    @SerializedName("HSXCODE")
    private String HSXCODE;
    @SerializedName("N12")
    private Double N12;
    @SerializedName("N13")
    private Double N13;
    @SerializedName("N14")
    private Double N14;
    @SerializedName("N15")
    private Double N15;
    @SerializedName("N16")
    private Double N16;
    @SerializedName("N17")
    private Double N17;
    @SerializedName("NLALU")
    private Double NLALU;
    @SerializedName("NSEKA")
    private Double NSEKA;
    @SerializedName("V12")
    private Double V12;
    @SerializedName("V13")
    private Double V13;
    @SerializedName("V14")
    private Double V14;
    @SerializedName("V15")
    private Double V15;
    @SerializedName("V16")
    private Double V16;
    @SerializedName("V17")
    private Double V17;
    @SerializedName("VLALU")
    private Double VLALU;
    @SerializedName("VSEKA")
    private Double VSEKA;
    @SerializedName("PERIOD")
    private String PERIOD;

    public ModelIMPBTKI() {
    }

    public ModelIMPBTKI(int id, String PODALTCODE, String OLDCTRYCOD, String HSXCODE, Double n12, Double n13, Double n14, Double n15, Double n16, Double n17, Double NLALU, Double NSEKA, Double v12, Double v13, Double v14, Double v15, Double v16, Double v17, Double VLALU, Double VSEKA, String PERIOD) {
        Id = id;
        this.PODALTCODE = PODALTCODE;
        this.OLDCTRYCOD = OLDCTRYCOD;
        this.HSXCODE = HSXCODE;
        N12 = n12;
        N13 = n13;
        N14 = n14;
        N15 = n15;
        N16 = n16;
        N17 = n17;
        this.NLALU = NLALU;
        this.NSEKA = NSEKA;
        V12 = v12;
        V13 = v13;
        V14 = v14;
        V15 = v15;
        V16 = v16;
        V17 = v17;
        this.VLALU = VLALU;
        this.VSEKA = VSEKA;
        this.PERIOD = PERIOD;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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

    public String getHSXCODE() {
        return HSXCODE;
    }

    public void setHSXCODE(String HSXCODE) {
        this.HSXCODE = HSXCODE;
    }

    public Double getN12() {
        return N12;
    }

    public void setN12(Double n12) {
        N12 = n12;
    }

    public Double getN13() {
        return N13;
    }

    public void setN13(Double n13) {
        N13 = n13;
    }

    public Double getN14() {
        return N14;
    }

    public void setN14(Double n14) {
        N14 = n14;
    }

    public Double getN15() {
        return N15;
    }

    public void setN15(Double n15) {
        N15 = n15;
    }

    public Double getN16() {
        return N16;
    }

    public void setN16(Double n16) {
        N16 = n16;
    }

    public Double getN17() {
        return N17;
    }

    public void setN17(Double n17) {
        N17 = n17;
    }

    public Double getNLALU() {
        return NLALU;
    }

    public void setNLALU(Double NLALU) {
        this.NLALU = NLALU;
    }

    public Double getNSEKA() {
        return NSEKA;
    }

    public void setNSEKA(Double NSEKA) {
        this.NSEKA = NSEKA;
    }

    public Double getV12() {
        return V12;
    }

    public void setV12(Double v12) {
        V12 = v12;
    }

    public Double getV13() {
        return V13;
    }

    public void setV13(Double v13) {
        V13 = v13;
    }

    public Double getV14() {
        return V14;
    }

    public void setV14(Double v14) {
        V14 = v14;
    }

    public Double getV15() {
        return V15;
    }

    public void setV15(Double v15) {
        V15 = v15;
    }

    public Double getV16() {
        return V16;
    }

    public void setV16(Double v16) {
        V16 = v16;
    }

    public Double getV17() {
        return V17;
    }

    public void setV17(Double v17) {
        V17 = v17;
    }

    public Double getVLALU() {
        return VLALU;
    }

    public void setVLALU(Double VLALU) {
        this.VLALU = VLALU;
    }

    public Double getVSEKA() {
        return VSEKA;
    }

    public void setVSEKA(Double VSEKA) {
        this.VSEKA = VSEKA;
    }

    public String getPERIOD() {
        return PERIOD;
    }

    public void setPERIOD(String PERIOD) {
        this.PERIOD = PERIOD;
    }
}
