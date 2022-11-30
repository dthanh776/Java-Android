package com.example.kiemtradatabase;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CustomAdapterQLHV extends ArrayAdapter {
    Context context;
    int resource;
    ArrayList<QuanLyHocVien> data;

    public CustomAdapterQLHV(Context context, int resource, ArrayList<QuanLyHocVien> data) {
        super(context, resource, data);
        this.context = context;
        this.resource = resource;
        this.data = data;
    }

    @SuppressLint("ViewHolder")
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(resource,null);
        TextView tvHoTen = convertView.findViewById(R.id.tvHoten);
        TextView tvMonHoc = convertView.findViewById(R.id.tvMonHoc);
        TextView tvSoTinChi = convertView.findViewById(R.id.tvSoTinChi);
        TextView tvThanhTien = convertView.findViewById(R.id.tvThanhTien);

        QuanLyHocVien quanLyHocVien = data.get(position);
        tvHoTen.setText(quanLyHocVien.getTenHocVien());
        tvMonHoc.setText(quanLyHocVien.getMonHoc());
        tvSoTinChi.setText(quanLyHocVien.getSoTinChi());
        tvThanhTien.setText(quanLyHocVien.getThanhTien());


        return convertView;
    }
}
