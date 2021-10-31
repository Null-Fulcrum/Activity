package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Registration extends AppCompatActivity implements View.OnClickListener {
    Button BtnBack;
    Button BtnEnter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        BtnBack = findViewById(R.id.BtnBack);
        BtnEnter = findViewById(R.id.BtnEnterReg);
        BtnEnter.setOnClickListener(this);
        BtnBack.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.BtnBack:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.BtnEnterReg:
                Intent intentTwo = new Intent(this, UserActivity.class);
                startActivity(intentTwo);
                break;
            default:
                break;
        }
    }
}