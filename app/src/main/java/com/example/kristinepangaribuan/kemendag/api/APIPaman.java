package com.example.kristinepangaribuan.kemendag.api;

import com.example.kristinepangaribuan.kemendag.model.ModelPegawai;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface APIPaman {
    @GET("pegawai/all")
    Call<List<ModelPegawai>> getAllPegawai();
    @GET("pegawai/find/{Nip}")
    Call<ModelPegawai> getPegawaiByNip(@Path("Nip") String Nip);
    @GET("BTKI2017/find/{BTKI_2017}")
    Call<ModelPegawai> getBTKI2017ByNip(@Path("BTKI_2017") String BTKI_2017);
}
