package com.example.rebound_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Splashscreen extends AppCompatActivity {

    private Button signup,signin;
    private Intent intent;
    private TextView getUsergroup;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
         signup=findViewById(R.id.signup);
         signin=findViewById(R.id.signin);
         getUsergroup=findViewById(R.id.askUserGroupTextView);
         radioGroup=findViewById(R.id.askUserGroup);

        signup.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                getUsergroup.setVisibility(View.VISIBLE);
                radioGroup.setVisibility(View.VISIBLE);
               GetUserGroup();

            }
        });
    }
      public void GetUserGroup(){
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = findViewById(checkedId);

                if (checkedId == (R.id.DriverYes)) {
                    intent = new Intent(Splashscreen.this,DriversSignUp.class);
                    startActivity(intent);
                } else {
                    intent = new Intent(Splashscreen.this, ConsumerSignUp.class);
                    startActivity(intent);
                }

            }
        });
      }
}