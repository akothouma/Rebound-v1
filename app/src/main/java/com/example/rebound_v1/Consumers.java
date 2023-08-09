package com.example.rebound_v1;

public class Consumers extends UsersRegistration{
private static boolean isDriver;

    public Consumers(String fullName, int idNumber, int contactNumber, String password) {
        super(fullName, idNumber, contactNumber, password);
    }

    public static void setIsDriver(boolean isDriver) {
        Consumers.isDriver = isDriver;
    }

    public static boolean isIsDriver() {
        return isDriver;
    }
}
