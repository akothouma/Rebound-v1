package com.example.rebound_v1;

import static android.content.Intent.EXTRA_PHONE_NUMBER;
import static android.content.Intent.getIntent;
import static android.content.Intent.getIntentOld;

import static com.example.rebound_v1.DriversSignUp.PHONE_NUMBER;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;


import java.util.Objects;


public class DriverProfileBuilder extends Fragment {

    private static final int PICK_IMAGE_RESULT =1 ;
    EditText firstName,lastName,idNumber,phoneNumber,numberPlate,vehicleType;
    ImageView imgView;
    Uri uri;
    Button saveDriverProfile;
    FirebaseAuth firebaseAuth;
    StorageReference firebaseStorage;
    DatabaseReference driversprofiles;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_driver_profile_builder, container, false);
        firstName=view.findViewById(R.id.firstname);
        lastName=view.findViewById(R.id.lastName);
        idNumber=view.findViewById(R.id.idNumber);
        phoneNumber=view.findViewById(R.id.phoneNumber);
        numberPlate=view.findViewById(R.id.numberPlate);
        vehicleType=view.findViewById(R.id.vehicletype);
        imgView=view.findViewById(R.id.profileimage);
        saveDriverProfile=view.findViewById(R.id.saveDriverProfile);
        driversprofiles=FirebaseDatabase.getInstance().getReference("DriversProfileImages");

        Intent intent= requireActivity().getIntent();


        final String FirstName=firstName.getText().toString();
        final String LastName=lastName.getText().toString();
        final String IdNumber=idNumber.getText().toString();
        final String phoneNumber=intent.getStringExtra(PHONE_NUMBER);
        final String NumberPlate=numberPlate.getText().toString();
        final String VehicleType=vehicleType.getText().toString();

        saveDriverProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                       saveDetailsToStorageAndDatabase();
            }
        });


        imgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pickImageFromGallery();
            }
        });
        return view;
    }

    private void saveDetailsToStorageAndDatabase() {

    }

    private void pickImageFromGallery() {

        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        intent.setAction(Intent.EXTRA_LOCAL_ONLY);
        ActivityResultLauncher<Intent> startActivityForPhotoPicker=registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
            @Override
            public void onActivityResult(ActivityResult o) {

                if(o.getResultCode()== Activity.RESULT_OK ){
                    assert o.getData() != null;
                    uri= o.getData().getData();

                    Glide.with(DriverProfileBuilder.this).load(uri).fitCenter().centerCrop().into(imgView);
                     }
            }
        });

        startActivityForPhotoPicker.launch(intent);
    }
    private String getFileExtension(Uri uri){
        ContentResolver contentResolver=requireActivity().getContentResolver();
        MimeTypeMap mimeTypeMap= MimeTypeMap.getSingleton();
        return mimeTypeMap.getExtensionFromMimeType(contentResolver.getType(uri));
    }


}