package com.example.frarment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    FrgPhepTinh frgPhepTinh = null;
    FrgKetQua frgKetQua = null;
    Button btnpheptinh,btnKetQua;
    ArrayList<ketqua> dulieu=new ArrayList<>();
    public ArrayList<ketqua> getDulieu() {
        return dulieu;
    }

    public void setDulieu(ketqua a) {
        dulieu.add(a);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnpheptinh=findViewById(R.id.btnPhepTinh);
        btnKetQua=findViewById(R.id.btnKetQua);
        btnpheptinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frgKetQua = null;
                gotoPhepTinh(view);
            }
        });
        btnKetQua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frgPhepTinh = null;
                gotoKetQua(view);
            }
        });
    }
    public void gotoPhepTinh(View view){
        if(frgPhepTinh==null) {
            frgPhepTinh = new FrgPhepTinh();
            FragmentManager manager = getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.replace(R.id.frContent, frgPhepTinh).commit();
        }
    }
    public void gotoKetQua(View view){
        if(frgKetQua==null) {
            frgKetQua = new FrgKetQua();
            FragmentManager manager = getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.replace(R.id.frContent, frgKetQua).commit();
        }
    }
}