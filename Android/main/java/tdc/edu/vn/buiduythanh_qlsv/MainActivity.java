package tdc.edu.vn.buiduythanh_qlsv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.zip.DataFormatException;

public class MainActivity extends AppCompatActivity {
    EditText txtHoTen, txtMonHoc, txtSoTinChi;
    Button btnThem, btnXoa, btnSua;
    ListView lvItem;
    CustomadapterQLHV customadapterQLHV;
    ArrayList<QuanLyHocVien> data = new ArrayList<>();
    QuanLyHocVien quanLyHocVien;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        DatabaseHocVien db = new DatabaseHocVien(this);
        QuanLyHocVien quanLyHocVien = new QuanLyHocVien();


        switch (item.getItemId()) {
            case R.id.action_add:

                quanLyHocVien.setTenHocVien(txtHoTen.getText().toString());
                quanLyHocVien.setMonHoc(txtMonHoc.getText().toString());
                quanLyHocVien.setSoTinChi(Integer.parseInt(txtSoTinChi.getText().toString()));
                db.ThemDuLieu(quanLyHocVien);
                Toast.makeText(this, "Them thanh cong", Toast.LENGTH_SHORT).show();
                customadapterQLHV.notifyDataSetChanged();
                break;

            case R.id.action_delete:
                quanLyHocVien.setTenHocVien(txtHoTen.getText().toString());
                db.XoaDuLieu(quanLyHocVien);
                Toast.makeText(this, "Xoa thanh cong", Toast.LENGTH_SHORT).show();
                customadapterQLHV.notifyDataSetChanged();
                break;

            case R.id.action_edit:
                quanLyHocVien.setTenHocVien(txtHoTen.getText().toString());
                quanLyHocVien.setMonHoc(txtHoTen.getText().toString());
                quanLyHocVien.setSoTinChi(Integer.parseInt(txtSoTinChi.getText().toString()));
                db.SuaDuLieu(quanLyHocVien);
                Toast.makeText(this, "Sua thanh cong", Toast.LENGTH_SHORT).show();
                customadapterQLHV.notifyDataSetChanged();
                break;
            case R.id.action_exit:
                data.clear();
                data.addAll(db.DocDL());
                customadapterQLHV.notifyDataSetChanged();
                Toast.makeText(this, "Hien thi", Toast.LENGTH_SHORT).show();
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
        customadapterQLHV = new CustomadapterQLHV(this, R.layout.layout_qlhv_item, data);
        lvItem.setAdapter(customadapterQLHV);
    }

    private void khoiTao() {
        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                QuanLyHocVien quanLyHocVien;
                quanLyHocVien = new QuanLyHocVien(txtHoTen.getText() + "", txtMonHoc.getText() + "", Integer.parseInt(txtSoTinChi.getText() + ""));
                data.add(quanLyHocVien);
                customadapterQLHV.notifyDataSetChanged();
            }
        });
        btnXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (QuanLyHocVien quanLyHocVien : data) {
                    if (quanLyHocVien.getTenHocVien().equals(txtHoTen.getText().toString())) {
                        data.remove(quanLyHocVien);
                        customadapterQLHV.notifyDataSetChanged();
                        break;
                    }
                }
            }
        });
        btnSua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (QuanLyHocVien quanLyHocVien : data) {
                    if (quanLyHocVien.getTenHocVien().equals(txtHoTen.getText().toString())) {
                        quanLyHocVien.setMonHoc(txtMonHoc.getText().toString());
                        quanLyHocVien.setSoTinChi(Integer.parseInt(txtSoTinChi.getText().toString()));
                        customadapterQLHV.notifyDataSetChanged();
                        break;
                    }
                }
            }
        });
        lvItem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                QuanLyHocVien quanLyHocVien = data.get(position);

                txtHoTen.setText(quanLyHocVien.getTenHocVien());
                txtMonHoc.setText(quanLyHocVien.getMonHoc());
                txtSoTinChi.setText(String.valueOf(quanLyHocVien.getSoTinChi()));

            }
        });
        lvItem.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                data.remove(position);
                customadapterQLHV.notifyDataSetChanged();
                return false;
            }
        });
    }

    private void setControl() {
        lvItem = findViewById(R.id.lvItem);
        txtHoTen = findViewById(R.id.txtHoVaTen);
        txtMonHoc = findViewById(R.id.txtMonHoc);
        txtSoTinChi = findViewById(R.id.txtSoTinChi);

        btnThem = findViewById(R.id.btnThem);
        btnXoa = findViewById(R.id.btnXoa);
        btnSua = findViewById(R.id.btnSua);
    }

}
