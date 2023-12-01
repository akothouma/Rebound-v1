package com.example.rebound_v1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class SignUp extends AppCompatActivity {
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        if (savedInstanceState == null) {
            fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.fragmentlayout, PotentialBusiness.class, null)
                    .setReorderingAllowed(true)
                    .addToBackStack(null)
                    .commit();
        }
    }
}