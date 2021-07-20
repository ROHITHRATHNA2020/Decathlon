package com.example.decathlon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText metEnter;
    private Button mbtnGet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();


    }

    private void initViews() {
        metEnter = findViewById(R.id.etEnter);
        mbtnGet = findViewById(R.id.btnGet);
        mbtnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(metEnter.getText().toString().length()==10) {
                    Intent intent = new Intent(MainActivity.this, OtpActivity.class);
                    startActivity(intent);
                }else{
                    metEnter.setError("Invalid Number");
                }
            }
        });
    }
}