package tdc.edu.vn.hotendemoradio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class DemoSpinner extends AppCompatActivity {
    ArrayList <String> dataLoaiSP = new ArrayList<>();
    ArrayList <String> dataSP = new ArrayList<>();
    Spinner spLoaiSP;
    ListView lvSanPham;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_spinner);
        setControl();
        setEvent();
    }

    private void setEvent() {
        khoiTao();
        ArrayAdapter adapterLoaiSP= new ArrayAdapter(this,android.R.layout.simple_list_item_1,dataLoaiSP);
        spLoaiSP.setAdapter(adapterLoaiSP);

        final ArrayAdapter adapterSP= new ArrayAdapter(this,android.R.layout.simple_list_item_1,dataSP);
        lvSanPham.setAdapter(adapterSP);

        spLoaiSP.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(dataLoaiSP.get(position).equals("Áo"))
                {
                    loadDLAo();
                }
                else
                {
                    loadDLQuan();
                }

                adapterSP.notifyDataSetChanged();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        lvSanPham.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(DemoSpinner.this, "Chọn "+ dataSP.get(position), Toast.LENGTH_SHORT).show();
            }
        });

        lvSanPham.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                dataSP.remove(position);
                adapterSP.notifyDataSetChanged();
                return false;
            }
        });
    }

    private void loadDLQuan() {
        dataSP.clear();
        dataSP.add("Quần 1");
        dataSP.add("Quần 2");
        dataSP.add("Quần 3");
    }

    private void loadDLAo() {
        dataSP.clear();
        dataSP.add("Áo 1");
        dataSP.add("Áo 2");
        dataSP.add("Áo 3");
    }

    private void khoiTao() {
        dataLoaiSP.add("Áo");
        dataLoaiSP.add("Quần");
    }

    private void setControl() {
        spLoaiSP= findViewById(R.id.spLoaiSP);
        lvSanPham= findViewById(R.id.lvDanhSach);
    }
}
