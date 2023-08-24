package com.example.rebound_v1;

import java.util.ArrayList;

public class ConsumerPersonalDetails extends UserDetails {
private static boolean isDriver;
private ArrayList<UserUploads> consumerUploads;

    public ConsumerPersonalDetails(String fullName, int idNumber, int contactNumber, String password) {
        super(fullName, idNumber, contactNumber, password);
        this.consumerUploads=new ArrayList<>();
    }

    public ConsumerPersonalDetails(String fullName, int idNumber, int contactNumber, String password, ArrayList<UserUploads> consumerUploads) {
        super(fullName, idNumber, contactNumber, password);
        this.consumerUploads = consumerUploads;
    }

    public static void setIsDriver(boolean isDriver) {
        ConsumerPersonalDetails.isDriver = isDriver;
    }

    public static boolean isIsDriver() {
        return isDriver;
    }

    public ArrayList<UserUploads> getConsumerUploads() {
        return consumerUploads;
    }

    public void setConsumerUploads(ArrayList<UserUploads> consumerUploads) {
        this.consumerUploads = consumerUploads;
    }
}
