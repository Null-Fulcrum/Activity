package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
public class UserActivity extends AppCompatActivity implements View.OnClickListener {
    Button BtnAthorization;
    Button BtnRegistration;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        BtnAthorization = findViewById(R.id.BtnAthor);
        BtnAthorization.setOnClickListener(this);
        BtnRegistration = findViewById(R.id.BtnRegistate);
        BtnRegistration.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.BtnAthor:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.BtnRegistate:
                Intent intentTwo = new Intent(this, Registration.class);
                startActivity(intentTwo);
                break;
        }
    }
}