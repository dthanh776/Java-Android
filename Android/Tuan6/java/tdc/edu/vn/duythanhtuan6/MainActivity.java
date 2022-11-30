package tdc.edu.vn.duythanhtuan6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvSanhSach;
    ArrayList<MonHoc> data = new ArrayList<>();
    CustomAdapterMonHoc customAdapterMonHoc;
    EditText txtMaMH, txtTenMH, txtSoTinChi;
    Button btnThem, btnXoa, btnSua, btnHienThi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setControl();
        setEvent();
    }

    private void setEvent() {
        khoitao();
        customAdapterMonHoc = new CustomAdapterMonHoc(this, R.layout.layout_item_monhoc, data);
        lvSanhSach.setAdapter(customAdapterMonHoc);
    }

    private void khoitao() {
        data.add(new MonHoc("MH1", "C#", "5"));
        data.add(new MonHoc("MH2", "Java", "3"));

        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MonHoc monHoc = new MonHoc();
                monHoc.setMaMon(txtMaMH.getText().toString());
                monHoc.setTenMon(txtTenMH.getText().toString());
                ;
                monHoc.setSoTinChi(txtSoTinChi.getText().toString());
                ;

                data.add(monHoc);
                customAdapterMonHoc.notifyDataSetChanged();
            }
        });

        lvSanhSach.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MonHoc monHoc = data.get(position);

                txtMaMH.setText(monHoc.getMaMon());
                txtTenMH.setText(monHoc.getTenMon());
                txtSoTinChi.setText(monHoc.getSoTinChi());
            }
        });

        lvSanhSach.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                data.remove(position);
                customAdapterMonHoc.notifyDataSetChanged();
                return false;
            }
        });

        btnXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (MonHoc monhoc : data) {
                    if (monhoc.getMaMon().equals(txtMaMH.getText().toString()))
                    {
                        data.remove(monhoc);
                        customAdapterMonHoc.notifyDataSetChanged();
                        break;
                    }
                }
            }
        });
        btnSua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (MonHoc monhoc : data) {
                    if (monhoc.getMaMon().equals(txtMaMH.getText().toString()))
                    {
                        //monhoc.setMaMon(txtMaMH.getText().toString());
                        monhoc.setTenMon(txtTenMH.getText().toString());
                        monhoc.setSoTinChi(txtSoTinChi.getText().toString());
                        customAdapterMonHoc.notifyDataSetChanged();
                        break;
                    }
                }
            }
        });
    }

    private void setControl() {
        lvSanhSach = findViewById(R.id.lvDanhSach);
        txtMaMH = findViewById(R.id.txtMaMonHoc);
        txtTenMH = findViewById(R.id.txtTenMonHoc);
        txtSoTinChi = findViewById(R.id.txtSoTinChi);

        btnThem = findViewById(R.id.btnThem);
        btnXoa = findViewById(R.id.btnXoa);
        btnSua = findViewById(R.id.btnSua);
        btnHienThi = findViewById(R.id.btnHienThi);
    }
}
