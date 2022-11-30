package tdc.edu.vn.buiduythanh_3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainThongTin extends AppCompatActivity {
    EditText txtUser, txtPassword, txtAddress, txtBirthday;
    Button btnSend, btnExit;
    TextView textViewOutPut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_thong_tin);
        setControl();
        setEvent();
    }

    private void setEvent() {
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String msg = "";
            msg += txtUser.getText() + "\n";
            msg += txtPassword.getText() + "\n";
            msg += txtAddress.getText() + "\n";
            msg += txtBirthday.getText() + "\n";
            textViewOutPut.setText(msg);
            textViewOutPut.setBackgroundColor(Color.YELLOW);
            }
        });
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void setControl() {
        txtUser = findViewById(R.id.username);
        txtPassword = findViewById(R.id.password);
        txtAddress = findViewById(R.id.address);
        txtBirthday = findViewById(R.id.birthday);
        btnSend = findViewById(R.id.btnSend);
        btnExit = findViewById(R.id.btnExit);
        textViewOutPut = findViewById(R.id.textViewOutPut);
    }
}
