package com.example.rebound_v1;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class DriversProfileUploadsDatabase {
    private static final DatabaseReference driversProfileUploadReference = FirebaseDatabase.getInstance().getReference();

    public DatabaseReference getDriversProfileUploadReference() {
        return driversProfileUploadReference;
    }

    public DriversProfileUploadsDatabase() {
    }
    ArrayList<DriverProfileBuilder> driversprofiles=new ArrayList<>();

    public boolean addDriverProfile(DriverProfileBuilder dp){
       return driversprofiles.add(dp);
    }
}
