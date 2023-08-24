package com.example.rebound_v1;

import java.util.ArrayList;

public class DriverPersonalDetails extends UserDetails {

    private String driversLicence;
    private String vehicleType;
    private String vehicleNumberPlate;
    private static boolean isDriver;
    private ArrayList<UserUploads> driversUploads;

    public DriverPersonalDetails(String fullName, int idNumber, int contactNumber, String password, String driversLicence, String vehicleType, String vehicleNumberPlate) {
        super(fullName, idNumber, contactNumber, password);
        this.driversLicence = driversLicence;
        this.vehicleType = vehicleType;
        this.vehicleNumberPlate = vehicleNumberPlate;
        this.driversUploads=new ArrayList<>();


    }

    public DriverPersonalDetails(String fullName, int idNumber, int contactNumber, String password, String driversLicence, String vehicleType, String vehicleNumberPlate, ArrayList<UserUploads> driversUploads) {
        super(fullName, idNumber, contactNumber, password);
        this.driversLicence = driversLicence;
        this.vehicleType = vehicleType;
        this.vehicleNumberPlate = vehicleNumberPlate;
        this.driversUploads = driversUploads;
    }

    public String getDriversLicence() {
        return driversLicence;
    }

    public void setDriversLicence(String driversLicence) {
        this.driversLicence = driversLicence;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumberPlate() {
        return vehicleNumberPlate;
    }

    public void setVehicleNumberPlate(String vehicleNumberPlate) {
        this.vehicleNumberPlate = vehicleNumberPlate;
    }

    public ArrayList<UserUploads> getDriversUploads() {
        return driversUploads;
    }

    public void setDriversUploads(ArrayList<UserUploads> driversUploads) {
        this.driversUploads = driversUploads;
    }

    public static boolean isIsDriver() {
        return isDriver;
    }

    public static void setIsDriver(boolean isDriver) {
        DriverPersonalDetails.isDriver = isDriver;
    }
}
