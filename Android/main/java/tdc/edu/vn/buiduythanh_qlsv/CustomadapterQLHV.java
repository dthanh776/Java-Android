package tdc.edu.vn.buiduythanh_qlsv;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CustomadapterQLHV extends ArrayAdapter {
    Context context;
    int resource;
    ArrayList<QuanLyHocVien> data;


    public CustomadapterQLHV(Context context, int resource, ArrayList<QuanLyHocVien> data) {
        super(context, resource, data);
        this.context = context;
        this.resource = resource;
        this.data = data;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(resource, null);

        TextView tvHoTen = convertView.findViewById(R.id.tvHoten);
        TextView tvMonHoc = convertView.findViewById(R.id.tvMonHoc);
        TextView tvSoTinChi = convertView.findViewById(R.id.tvSoTinChi);
        TextView tvThanhTien = convertView.findViewById(R.id.tvThanhTien);

        QuanLyHocVien quanLyHocVien = data.get(position);
        tvHoTen.setText(quanLyHocVien.getTenHocVien());
        tvMonHoc.setText(quanLyHocVien.getMonHoc());
        tvSoTinChi.setText(String.valueOf(quanLyHocVien.getSoTinChi()));
        tvThanhTien.setText(String.valueOf(quanLyHocVien.getThanhTien()));

        return convertView;
    }
}
