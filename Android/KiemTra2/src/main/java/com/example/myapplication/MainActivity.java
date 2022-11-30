package com.example.myapplication;

import static java.lang.Double.compare;
import static java.lang.Double.parseDouble;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvDanhSach;
    ArrayList<TinhTienDien> data = new ArrayList<>();
    CustomAdapterTinhTienDien customAdapterTinhTienDien;
    EditText txtChiSoDau, txtChiSoCuoi, txtHoTen;
    Button btnThem, btnXoa, btnSua, btnHienThi, btnTang, btnGiam;
    RadioButton rdKinhDoanh, rdGiaDinh;
    ImageView ivLoaiSD;
    TinhTienDien tinhTienDien;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_actionbar, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_add:
                Toast.makeText(this, "them", Toast.LENGTH_SHORT).show();

                if (rdGiaDinh.isChecked()) {
                    tinhTienDien = new TinhTienDien(txtHoTen.getText() + "", "Gia Dinh", Double.parseDouble(txtChiSoDau.getText() + ""), Double.parseDouble(txtChiSoCuoi.getText() + ""));
                } else {
                    tinhTienDien = new TinhTienDien(txtHoTen.getText() + "", "Kinh Doanh", Double.parseDouble(txtChiSoDau.getText() + ""), Double.parseDouble(txtChiSoCuoi.getText() + ""));
                }
                data.add(tinhTienDien);
                break;
            case R.id.action_delete:
                Toast.makeText(this, "xoa", Toast.LENGTH_SHORT).show();
                for (TinhTienDien tinhTienDien : data) {
                    if (tinhTienDien.getHoTen().equals(txtHoTen.getText().toString())) {
                        data.remove(tinhTienDien);
                        customAdapterTinhTienDien.notifyDataSetChanged();
                        break;
                    }
                }
                break;
            case R.id.action_edit:
                for (TinhTienDien tinhTienDien : data) {
                    if (tinhTienDien.getHoTen().equals(txtHoTen.getText().toString())) {
                        tinhTienDien.setChiSoDau(Double.parseDouble(txtChiSoDau.getText().toString()));
                        tinhTienDien.setChiSoCuoi(Double.parseDouble(txtChiSoCuoi.getText().toString()));
                        customAdapterTinhTienDien.notifyDataSetChanged();
                        break;
                    }
                }
                break;
            case R.id.action_exit:
                this.finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setControl();
        setEvent();
    }

    private void setEvent() {
        khoiTao();

        customAdapterTinhTienDien = new CustomAdapterTinhTienDien(this, R.layout.layout_tiendien, data);
        lvDanhSach.setAdapter(customAdapterTinhTienDien);
    }

    private void khoiTao() {
        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TinhTienDien tinhTienDien;

                if (rdGiaDinh.isChecked()) {
                    tinhTienDien = new TinhTienDien(txtHoTen.getText() + "", "Gia Dinh", Double.parseDouble(txtChiSoDau.getText() + ""), Double.parseDouble(txtChiSoCuoi.getText() + ""));
                } else {
                    tinhTienDien = new TinhTienDien(txtHoTen.getText() + "", "Kinh Doanh", Double.parseDouble(txtChiSoDau.getText() + ""), Double.parseDouble(txtChiSoCuoi.getText() + ""));
                }
                data.add(tinhTienDien);
                customAdapterTinhTienDien.notifyDataSetChanged();
            }
        });
        btnXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (TinhTienDien tinhTienDien : data) {
                    if (tinhTienDien.getHoTen().equals(txtHoTen.getText().toString())) {
                        data.remove(tinhTienDien);
                        customAdapterTinhTienDien.notifyDataSetChanged();
                        break;
                    }
                }
            }
        });
        btnSua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (TinhTienDien tinhTienDien : data) {
                    if (tinhTienDien.getHoTen().equals(txtHoTen.getText().toString())) {
                        tinhTienDien.setChiSoDau(Double.parseDouble(txtChiSoDau.getText().toString()));
                        tinhTienDien.setChiSoCuoi(Double.parseDouble(txtChiSoCuoi.getText().toString()));
                        customAdapterTinhTienDien.notifyDataSetChanged();
                        break;
                    }
                }
                customAdapterTinhTienDien.notifyDataSetChanged();
            }
        });
        btnHienThi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customAdapterTinhTienDien.notifyDataSetChanged();
            }
        });
        lvDanhSach.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                TinhTienDien tinhTienDien = data.get(position);
                txtHoTen.setText(tinhTienDien.getHoTen());
                txtChiSoCuoi.setText(tinhTienDien.getChiSoCuoi() + "");
                txtChiSoDau.setText(tinhTienDien.getChiSoDau() + "");

                if (tinhTienDien.getLoaiSuDung().equals("Gia Dinh")) {
                    rdGiaDinh.setChecked(true);
                    ivLoaiSD.setImageResource(R.drawable.hogiadinh);
                } else {
                    rdKinhDoanh.setChecked(true);
                    ivLoaiSD.setImageResource(R.drawable.hokinhdoanh);
                }
            }
        });
        lvDanhSach.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int position, long id) {
                data.remove(position);
                customAdapterTinhTienDien.notifyDataSetChanged();
                return false;
            }
        });
        btnTang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btnGiam.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

            }
        });

    }

    private void setControl() {
        lvDanhSach = findViewById(R.id.lvDanhSach);
        txtHoTen = findViewById(R.id.txtHoTen);
        txtChiSoCuoi = findViewById(R.id.txtChiSoCuoi);
        txtChiSoDau = findViewById(R.id.txtChiSoDau);

        rdGiaDinh = findViewById(R.id.rdHoGiaoDinh);
        rdKinhDoanh = findViewById(R.id.rdKinhDoanh);

        btnThem = findViewById(R.id.btnThem);
        btnXoa = findViewById(R.id.btnXoa);
        btnSua = findViewById(R.id.btnSua);
        btnHienThi = findViewById(R.id.btnHienThi);
        btnTang = findViewById(R.id.btnTang);
        btnGiam = findViewById(R.id.btnGiam);

        ivLoaiSD = findViewById(R.id.ivLoaiSD);
    }

}
