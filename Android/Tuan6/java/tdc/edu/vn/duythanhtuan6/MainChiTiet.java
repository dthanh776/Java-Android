package tdc.edu.vn.duythanhtuan6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainChiTiet extends AppCompatActivity {
    TextView tvMaMH, tvTenMH, tvSoTiet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_chi_tiet);
        setControl();
        setEvent();

    }

    private void setEvent() {
        MonHoc monHoc = (MonHoc) getIntent().getSerializableExtra("item");
        tvMaMH.setText(monHoc.getMaMon());
        tvTenMH.setText(monHoc.getTenMon());
        tvSoTiet.setText(monHoc.getSoTinChi());
    }


    private void setControl() {
        tvMaMH = findViewById(R.id.tvMaMH);
        tvTenMH = findViewById(R.id.tvTenMH);
        tvSoTiet = findViewById(R.id.tvSoTiet);
    }
}
