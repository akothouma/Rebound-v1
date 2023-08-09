package com.example.rebound_v1;

public class Driver extends UsersRegistration {

    private String driversLicence;
    private String vehicleType;
    private String vehicleNumberPlate;
    private static boolean isDriver;

    public Driver(String fullName, int idNumber, int contactNumber, String password, String driversLicence, String vehicleType, String vehicleNumberPlate) {
        super(fullName, idNumber, contactNumber, password);
        this.driversLicence = driversLicence;
        this.vehicleType = vehicleType;
        this.vehicleNumberPlate = vehicleNumberPlate;

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

    public static boolean isIsDriver() {
        return isDriver;
    }

    public static void setIsDriver(boolean isDriver) {
        Driver.isDriver = isDriver;
    }
}
