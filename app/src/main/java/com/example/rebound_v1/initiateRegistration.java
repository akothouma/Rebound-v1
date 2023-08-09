package com.example.rebound_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class initiateRegistration extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Driver.setIsDriver(true);
        Consumers.setIsDriver(false);

        Consumers client = new Consumers("Lorna Akoth", 342977, 254999, "whgdggegy");
        Driver driver = new Driver("robert otieno", 254789, 25433788, "teyueg", "KAZuyw7738", "FAW"
                , "HGSYSUOWUI");

        System.out.println("The boolean is");

    }
}