package com.example.rebound_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class initiateRegistration extends AppCompatActivity {
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        radioGroup = findViewById(R.id.askUserGroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton= findViewById(checkedId);

                if(checkedId==(R.id.DriverYes)){
                    Intent movetoConsumersRegistationActivity=new Intent(initiateRegistration.this,DriversSignUp.class);
                    startActivity(movetoConsumersRegistationActivity);
                }else{
                    Intent movetoDriversRegitrationActivity=new Intent(initiateRegistration.this,CustomerSignUp.class);
                    startActivity(movetoDriversRegitrationActivity);
                }

            }
        });


    }
    }
