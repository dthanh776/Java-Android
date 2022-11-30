package com.example.frarment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;


public class FrgPhepTinh extends Fragment {


    // TODO: Rename and change types of parameters
    EditText txtSo1,txtSo2;
    Button btnCong;
    MainActivity activity;
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        activity=(MainActivity) context;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_frg_phep_tinh,container,false);
        txtSo1=view.findViewById(R.id.txtSo1);
        txtSo2=view.findViewById(R.id.txtSo2);
        btnCong=view.findViewById(R.id.btnCong);
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int so1=Integer.parseInt(txtSo1.getText()+"");
                int so2=Integer.parseInt(txtSo2.getText()+"");
                int Tong=so1+so2;
                String kp=so1+" + "+so2+" = "+Tong;
                ketqua a = new ketqua(so1+"",so2+"",Tong+"");
                activity.setDulieu(a);
            }
        });

        return view;
    }
}