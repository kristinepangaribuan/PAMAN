package com.example.kristinepangaribuan.kemendag;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        Button btnPilihan1 = (Button) view.findViewById(R.id.btnPilihan1);
        btnPilihan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, new FirstFragment());
                fragmentTransaction.addToBackStack(null);
                Toast.makeText(getActivity(), "toast sukses", Toast.LENGTH_SHORT).show();
                fragmentTransaction.commit();
            }
        });

        Button btnPilihan2 = (Button) view.findViewById(R.id.btnPilihan2);
        btnPilihan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, new SecondFragment());
                fragmentTransaction.addToBackStack(null);
                Toast.makeText(getActivity(), "toast sukses", Toast.LENGTH_SHORT).show();
                fragmentTransaction.commit();
            }
        });

        Button btnPilihan3 = (Button) view.findViewById(R.id.btnPilihan3);
        btnPilihan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, new ThirdFragment());
                fragmentTransaction.addToBackStack(null);
                Toast.makeText(getActivity(), "toast sukses", Toast.LENGTH_SHORT).show();
                fragmentTransaction.commit();
            }
        });

        Button btnPilihan4 = (Button) view.findViewById(R.id.btnPilihan4);
        btnPilihan4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, new FourthFragment());
                fragmentTransaction.addToBackStack(null);
                Toast.makeText(getActivity(), "toast sukses", Toast.LENGTH_SHORT).show();
                fragmentTransaction.commit();
            }
        });

        return view;
    }
}

