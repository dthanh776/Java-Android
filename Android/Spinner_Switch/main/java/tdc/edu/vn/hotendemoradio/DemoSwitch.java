package tdc.edu.vn.hotendemoradio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.ToggleButton;

public class DemoSwitch extends AppCompatActivity {
    ToggleButton tgDen;
    Switch swQuat;
    ImageView ivDen, ivQuat;
    Button btnChucNang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_switch);
        setControl();
        setEvent();
    }

    private void setEvent() {
        btnChucNang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tgDen.isChecked())
                    ivDen.setImageResource(R.drawable.hinh3);
                else
                    ivDen.setImageResource(R.drawable.hinh1);

                if(swQuat.isChecked())
                    ivQuat.setImageResource(R.drawable.hinh4);
                else
                    ivQuat.setImageResource(R.drawable.hinh2);
            }
        });
    }

    private void setControl() {
        tgDen = findViewById(R.id.tgDen);
        swQuat = findViewById(R.id.swQuat);
        ivDen = findViewById(R.id.ivDen);
        ivQuat = findViewById(R.id.ivQuat);
        btnChucNang= findViewById(R.id.btnChucNang);
    }
}
