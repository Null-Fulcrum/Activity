package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button Enter;
    Button Registrate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    Enter = (Button) findViewById(R.id.BtnEnter);
    Enter.setOnClickListener(this);
    Registrate = (Button) findViewById(R.id.BtnReg);
    Registrate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.BtnEnter:
                Intent intent = new Intent(this, UserActivity.class);
                startActivity(intent);
                break;
            case R.id.BtnReg:
                Intent intentTwo = new Intent(this, Registration.class);
                startActivity(intentTwo);
                break;
            default:
                break;
        }
    }
}