package com.example.kristinepangaribuan.kemendag.model;

import com.google.gson.annotations.SerializedName;

public class ModelM2012_2017 {
    @SerializedName("Id")
    private int Id;
    @SerializedName("BTKI_2012")
    private String BTKI_2012;
    @SerializedName("BTKI_2017")
    private String BTKI_2017;

    public ModelM2012_2017() {
    }

    public ModelM2012_2017(int id, String BTKI_2012, String BTKI_2017) {
        Id = id;
        this.BTKI_2012 = BTKI_2012;
        this.BTKI_2017 = BTKI_2017;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getBTKI_2012() {
        return BTKI_2012;
    }

    public void setBTKI_2012(String BTKI_2012) {
        this.BTKI_2012 = BTKI_2012;
    }

    public String getBTKI_2017() {
        return BTKI_2017;
    }

    public void setBTKI_2017(String BTKI_2017) {
        this.BTKI_2017 = BTKI_2017;
    }
}
