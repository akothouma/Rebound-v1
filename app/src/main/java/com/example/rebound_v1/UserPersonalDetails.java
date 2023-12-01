package com.example.rebound_v1;

public class UserPersonalDetails {
    private String fullName;
    private int idNumber;
    private int contactNumber;
    private String password;


    public UserPersonalDetails(String fullName, int idNumber, int contactNumber, String password) {
        this.fullName = fullName;
        this.idNumber = idNumber;
        this.contactNumber = contactNumber;
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
