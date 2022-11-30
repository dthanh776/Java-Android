package tdc.edu.vn.buiduythanh_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtUser,txtPassword;
    Button btnSend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_linear);
        setControl();
        setEvent();
    }

    private void setEvent() {
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "";
                msg += "Ten dang nhap: " + txtUser.getText() + "\n";
                msg += "Mat khau: " + txtPassword.getText() + "\n";
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void setControl() {
        txtUser = findViewById(R.id.username);
        txtPassword = findViewById(R.id.password);
        btnSend = findViewById(R.id.buttonsend);
    }
}
