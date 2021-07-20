package com.example.decathlon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class OtpActivity extends AppCompatActivity {

    private EditText metOtp1;
    private EditText metOtp2;
    private EditText metOtp3;
    private EditText metOtp4;
    private Button mbtnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
        initViews();
        mbtnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (metOtp1.getText().toString().length() == 1
                        && metOtp2.getText().toString().length() == 1
                        && metOtp3.getText().toString().length() == 1
                        && metOtp4.getText().toString().length() == 1) {
                    Intent intent = new Intent(OtpActivity.this,HomeActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(OtpActivity.this, "Invalid OTP", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private void initViews() {
        metOtp1 = findViewById(R.id.etOtp1);
        metOtp2 = findViewById(R.id.etOtp2);
        metOtp3 = findViewById(R.id.etOtp3);
        metOtp4 = findViewById(R.id.etOtp4);
        mbtnSubmit = findViewById(R.id.btnSumbit);
    }
}