package com.example.frarment;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import org.w3c.dom.Text;

import java.security.cert.LDAPCertStoreParameters;
import java.util.ArrayList;

public class CustomerKetQua extends ArrayAdapter {
    Context context;
    int resourc;
    ArrayList<ketqua> data;
    public CustomerKetQua( Context context, int resource, ArrayList<ketqua> data) {
        super(context, resource, data);
        this.context = context;
        this.resourc = resource;
        this.data = data;
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(resourc,null);
        TextView HoTen = convertView.findViewById(R.id.tvKetQua);
        TextView pt1 = convertView.findViewById(R.id.tvpt2);
        TextView pt2 = convertView.findViewById(R.id.tvpt2);
        final ketqua DapAn = data.get(position);
        String dapan = DapAn.getKq();
        String so1 = DapAn.getPt1();
        String so2 = DapAn.getPt2();
        HoTen.setText(dapan);
        pt1.setText(so1);
        pt2.setText(so2);
        HoTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ketqua a =data.get(position);
                Intent x = new Intent(context, MainChitiet.class);
                x.putExtra("pt1", a.pt1);
                x.putExtra("pt2", a.pt2);
                x.putExtra("kp", a.kq);
                context.startActivity(x);
            }
        });
        return convertView;
    }
}
