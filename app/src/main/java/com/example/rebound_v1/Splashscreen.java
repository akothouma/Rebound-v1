package com.example.rebound_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Splashscreen extends AppCompatActivity {

    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        radioGroup = findViewById(R.id.UserGroupRadioGroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton= findViewById(checkedId);

                if(checkedId==(R.id.NoforDriver)){
                    Intent movetoConsumersRegistationActivity=new Intent(Splashscreen.this,initiateRegistration.class);
                    startActivity(movetoConsumersRegistationActivity);
                }else{
                    Intent movetoDriversRegitrationActivity=new Intent(Splashscreen.this,initiateRegistration.class);
                    startActivity(movetoDriversRegitrationActivity);
                }

            }
        });


    }
}