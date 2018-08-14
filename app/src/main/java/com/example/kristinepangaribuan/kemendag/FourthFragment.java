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

public class FourthFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fourth, container, false);

        Button btnInputHS = (Button) view.findViewById(R.id.btnInputHS);
        btnInputHS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, new InputHSFragment());
                fragmentTransaction.addToBackStack(null);
                Toast.makeText(getActivity(), "toast sukses", Toast.LENGTH_SHORT).show();
                fragmentTransaction.commit();
            }
        });

        return view;
    }
}
