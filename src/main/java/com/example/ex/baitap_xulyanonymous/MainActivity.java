package com.example.ex.baitap_xulyanonymous;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.ex.baitap_xulyanonymous.R.id.txtKetQua;

public class
MainActivity extends AppCompatActivity {
    EditText txtA, txtB;
    TextView txtKetQua;
    Button btnCong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
        addEvent();
    }

    private void addEvent() {
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xuLyPhepCong();
            }
        });
    }

    private void xuLyPhepCong() {
        int a = Integer.parseInt(txtA.getText().toString());
        int b = Integer.parseInt(txtB.getText().toString());
        int c = a+b;
        txtKetQua.setText(String.valueOf(c));
    }

    private void addControls() {
        txtA = (EditText) findViewById(R.id.txtA);
        txtB = (EditText) findViewById(R.id.txtB);
        btnCong = (Button) findViewById(R.id.btnCong);
        txtKetQua = (TextView) findViewById(R.id.txtKetQua);
    }
}
