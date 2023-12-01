package com.example.rebound_v1;

import java.util.ArrayList;

public class ConsumerProfileBuilderModel extends UserPersonalDetails{
    private static boolean isDriver=false;
    private ArrayList<UserUploads> consumerUploads;

    public ConsumerProfileBuilderModel(String fullName, int idNumber, int contactNumber, String password) {
        super(fullName, idNumber, contactNumber, password);
        this.consumerUploads=new ArrayList<>();
    }

    public ConsumerProfileBuilderModel(String fullName, int idNumber, int contactNumber, String password, ArrayList<UserUploads> consumerUploads) {
        super(fullName, idNumber, contactNumber, password);
        this.consumerUploads = consumerUploads;
    }

    public static boolean isIsDriver() {
        return isDriver;
    }

    public static void setIsDriver(boolean isDriver) {
        ConsumerProfileBuilderModel.isDriver = isDriver;
    }

    public ArrayList<UserUploads> getConsumerUploads() {
        return consumerUploads;
    }

    public void setConsumerUploads(ArrayList<UserUploads> consumerUploads) {
        this.consumerUploads = consumerUploads;
    }
}
