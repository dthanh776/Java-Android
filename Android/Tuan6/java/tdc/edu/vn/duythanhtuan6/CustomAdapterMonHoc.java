package tdc.edu.vn.duythanhtuan6;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapterMonHoc extends ArrayAdapter {
    Context context;
    int resource;
    ArrayList<MonHoc> data;

    public CustomAdapterMonHoc(Context context, int resource, ArrayList<MonHoc> data) {
        super(context, resource, data);
        this.context = context;
        this.data = data;
        this.resource = resource;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(resource, null);
        TextView tvMaMH = convertView.findViewById(R.id.tvMaMH);
        TextView tvTenMH = convertView.findViewById(R.id.tvtenMH);
        TextView tvTinChi = convertView.findViewById(R.id.tvSoTiet);

        ImageView ivXoa = convertView.findViewById(R.id.ivXoa);
        ImageView ivChiTiet = convertView.findViewById(R.id.ivChiTiet);

        final MonHoc monHoc = data.get(position);
        tvMaMH.setText(monHoc.getMaMon());
        tvTenMH.setText(monHoc.getTenMon());
        tvTinChi.setText(monHoc.getSoTinChi());

        ivXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.remove(monHoc);
                notifyDataSetChanged();
            }
        });

        ivChiTiet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MainChiTiet.class);
                intent.putExtra("item", monHoc);
                context.startActivity(intent);
            }
        });
        return convertView;
    }
}
