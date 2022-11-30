package tdc.edu.vn.hotendemoradio;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txtHT, txtCMND;
    RadioButton radDH,radCD, radTC;
    CheckBox cbGame, cbDB,cbDS;
    EditText txtTTK;
    Button btnGTT;
    TextView tvThongTin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setControl();
        setEvent();
    }

    private void setEvent() {
        btnGTT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg="";
                msg +="Họ tên :"+ txtHT.getText()+ "\n";
                msg +="CMND :"+ txtCMND.getText()+ "\n";
                if(radDH.isChecked())
                msg +="Bằng cấp :"+ radDH.getText()+ "\n";
                if(radCD.isChecked())
                    msg +="Bằng cấp :"+ radCD.getText()+ "\n";
                if(radTC.isChecked())
                    msg +="Bằng cấp :"+ radTC.getText()+ "\n";
                msg+="Sở thích: \n";
                if(cbGame.isChecked())
                    msg += cbGame.getText()+ "\n";
                if(cbDB.isChecked())
                    msg += cbDB.getText()+ "\n";
                if(cbDS.isChecked())
                    msg += cbDS.getText()+ "\n";
                msg +="TTK :"+ txtTTK.getText()+ "\n";
                tvThongTin.setText(msg);
                tvThongTin.setBackgroundColor(Color.GREEN);
            }
        });
    }

    private void setControl() {
        txtHT = findViewById(R.id.txtHoTen);
        txtCMND = findViewById(R.id.txtCMND);
        radDH = findViewById(R.id.radDH);
        radCD = findViewById(R.id.radCD);
        radTC = findViewById(R.id.radTC);
        cbGame = findViewById(R.id.cbGame);
        cbDB = findViewById(R.id.cbDB);
        cbDS = findViewById(R.id.cbDS);
        txtTTK = findViewById(R.id.txtTTK);
        tvThongTin = findViewById(R.id.tvThongTin);
        btnGTT = findViewById(R.id.btnGTT);


    }
}
