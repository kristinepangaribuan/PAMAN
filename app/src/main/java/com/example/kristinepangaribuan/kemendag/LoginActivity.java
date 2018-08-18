package com.example.kristinepangaribuan.kemendag;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.kristinepangaribuan.kemendag.api.APIPaman;
import com.example.kristinepangaribuan.kemendag.api.RestAPI;
import com.example.kristinepangaribuan.kemendag.model.ModelPegawai;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class LoginActivity extends AppCompatActivity {

    RelativeLayout rellay1;
    private APIPaman apiPaman;
    Handler handler = new Handler();
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            rellay1.setVisibility(View.VISIBLE);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        rellay1 = (RelativeLayout) findViewById(R.id.rellay1);

        handler.postDelayed(runnable, 2000);

        final EditText etNip = (EditText) findViewById(R.id.etNip);

        Button btnLogin = (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                apiPaman = RestAPI.get();
                Call<ModelPegawai> pegawaiCall = apiPaman.getPegawaiByNip(etNip.getText().toString());
                //Call<List<ModelPegawai>> pegawaiCall = apiPaman.getAllPegawai();
                pegawaiCall.enqueue(new Callback<ModelPegawai>() {
                    @Override
                    public void onResponse(Call<ModelPegawai> call, Response<ModelPegawai> response) {
                        if(response.isSuccessful()){
                            final ModelPegawai modelPegawai = response.body();
                            System.out.println(modelPegawai.getNAMA());
                            if(modelPegawai.getNAMA()!=null){
                                Toast.makeText(getApplicationContext(),"You have sign as "+modelPegawai.getNAMA(),Toast.LENGTH_LONG);
                                //System.out.println(modelPegawai.getNAMA());
                                Intent loginIntent = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(loginIntent);
                            }else {
                                Toast.makeText(getApplicationContext(),"User Not Found", Toast.LENGTH_LONG);
                            }
                        }
                    }
                    @Override
                    public void onFailure(Call<ModelPegawai> call, Throwable t) {
                        System.out.println(t.getMessage());
                    }
                });
            }
        });
    }
}
