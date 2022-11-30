package tdc.edu.vn.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;



import java.util.ArrayList;

class CustomAdapterTinhTienDien extends ArrayAdapter {
    Context context;
    int resource;
    ArrayList<TinhTienDien> data;


    public CustomAdapterTinhTienDien(Context context, int resource, ArrayList<TinhTienDien> data) {
        super(context, resource, data);
        this.context = context;
        this.resource = resource;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(resource, null);
        TinhTienDien tinhTienDien = data.get(position);

        TextView tvChiSoDau = convertView.findViewById(R.id.tvChiSoDau);
        TextView tvChiSoCuoi = convertView.findViewById(R.id.tvChiSoCuoi);
        TextView tvHeSo = convertView.findViewById(R.id.tvHeSo);
        TextView tvThanhTien = convertView.findViewById(R.id.tvThanhTien);
        TextView tvPhuTroi = convertView.findViewById(R.id.tvPhuTroi);
        TextView tvTongCong = convertView.findViewById(R.id.tvTongCong);
        TextView tvLoaiSD = convertView.findViewById(R.id.tvLoaiSD);
        ImageView ivAnh = convertView.findViewById(R.id.ivAnh);

        tvChiSoDau.setText(tinhTienDien.getChiSoDau() + "");
        tvChiSoCuoi.setText(tinhTienDien.getChiSoCuoi() + "");
        tvHeSo.setText(tinhTienDien.getHeSo() + "");
        tvThanhTien.setText(tinhTienDien.getThanhTien() + "");
        tvPhuTroi.setText(tinhTienDien.getPhuTroi() + "");
        tvTongCong.setText(tinhTienDien.getTongCong() + "");
        tvLoaiSD.setText(tinhTienDien.getLoaiSuDung() + "");

        if (tinhTienDien.getLoaiSuDung().equals("Gia Dinh")) {
            ivAnh.setImageResource(R.drawable.hogiadinh);
        } else {
            ivAnh.setImageResource(R.drawable.hokinhdoanh);
        }

        return convertView;
    }
}
