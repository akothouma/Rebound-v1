package com.example.rebound_v1;

import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.FirebaseAuthUIActivityResultContract;
import com.google.firebase.auth.FirebaseAuth;

import java.util.Collections;
import java.util.Objects;

public class DriversSignUp extends AppCompatActivity {
    public static final String PHONE_NUMBER = "phoneNumber";
    private ActivityResultLauncher<Intent> signInLauncher;
    private FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drivers_sign_up);
        firebaseAuth = FirebaseAuth.getInstance();

        signInLauncher = registerForActivityResult(
                new FirebaseAuthUIActivityResultContract(),
                (result) -> {
                   if(result.getResultCode()== RESULT_OK){
                    Intent intent=new Intent(DriversSignUp.this,DriverProfileBuilder.class);
                    intent.putExtra(PHONE_NUMBER, Objects.requireNonNull(firebaseAuth.getCurrentUser()).getPhoneNumber());
                    startActivity(intent);
                   }
                });
        startSignIn();
    }
    private void startSignIn() {
        Intent signInIntent = AuthUI.getInstance()
                .createSignInIntentBuilder()
                .setAvailableProviders(Collections.singletonList(new AuthUI.IdpConfig.PhoneBuilder().build()))
                .build();

        signInLauncher.launch(signInIntent);
    }
}