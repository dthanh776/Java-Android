package com.example.frarment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainChitiet extends AppCompatActivity {
    TextView dapan,pt1,pt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_chitiet);
        setConTrol();
        setEvent();
    }

    private void setEvent() {
        pt1.setText("PT1:"+getIntent().getSerializableExtra("pt1").toString());
        pt2.setText("PT2:"+getIntent().getSerializableExtra("pt2").toString());
        dapan.setText("DapAn:"+getIntent().getSerializableExtra("kp").toString());
    }

    private void setConTrol() {
       pt1=findViewById(R.id.tvPT1);
        pt2=findViewById(R.id.tvPT2);
        dapan=findViewById(R.id.tvKP);
    }
}