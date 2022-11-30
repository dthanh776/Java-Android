package com.example.kiemtradatabase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText txtHoten, txtMonHoc, txtSoTinChi;
    Button btnThem, btnXoa, btnSua;
    ListView lvItem;
    CustomAdapterQLHV customAdapterQLHV;
    ArrayList<QuanLyHocVien> data = new ArrayList<>();
    QuanLyHocVien quanLyHocVien;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_items,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        DatabaseHocVien db = new DatabaseHocVien(this);
        QuanLyHocVien quanLyHocVien = new QuanLyHocVien();

        switch (item.getItemId()) {
            case R.id.action_add:
                quanLyHocVien.setTenHocVien(txtHoten.getText().toString());
                quanLyHocVien.setMonHoc(txtMonHoc.getText().toString());
                quanLyHocVien.setSoTinChi(Integer.parseInt(txtSoTinChi.getText().toString()));
                db.ThemDuLieu(quanLyHocVien);
                Toast.makeText(this, "Them thanh cong", Toast.LENGTH_SHORT).show();
                customAdapterQLHV.notifyDataSetChanged();
                break;

            case R.id.action_delete:
                quanLyHocVien.setTenHocVien(txtHoten.getText().toString());
                db.XoaDuLieu(quanLyHocVien);
                Toast.makeText(this, "Xoa thanh cong", Toast.LENGTH_SHORT).show();
                customAdapterQLHV.notifyDataSetChanged();
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
        customAdapterQLHV = new CustomAdapterQLHV(this, R.layout.layout_qlhv_item, data);
        lvItem.setAdapter(customAdapterQLHV);
    }

    private void setControl() {
        lvItem = findViewById(R.id.lvItem);
        txtHoten = findViewById(R.id.txtHoTen);
        txtMonHoc = findViewById(R.id.txtMonHoc);
        txtSoTinChi = findViewById(R.id.txtSoTinChi);


        btnThem = findViewById(R.id.btnThem);
        btnXoa = findViewById(R.id.btnXoa);
        btnSua = findViewById(R.id.btnSua);
    }
}