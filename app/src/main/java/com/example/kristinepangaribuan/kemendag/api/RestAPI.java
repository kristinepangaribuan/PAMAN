package com.example.kristinepangaribuan.kemendag.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestAPI {
    private static APIPaman REST_CLIENT;

    static {
        //dieksekusi sebelum constructor, tapi hanya sekali untuksemua instans
        setupRestClient();
    }
    private RestAPI() {}
    public static APIPaman get() {
        return REST_CLIENT;
    }
    private static void setupRestClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://127.0.0.1:8080/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        REST_CLIENT = retrofit.create(APIPaman.class);
    }
}
