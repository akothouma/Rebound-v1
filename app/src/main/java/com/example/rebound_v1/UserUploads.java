package com.example.rebound_v1;

public class UserUploads {
    private String From;
    private String To;
    private int  chosenDay,chosenMonth,chosenYear;
    private int chosenHour,chosenMinute;
    private String TypeOfLuggage;


    public UserUploads(String from, String to, int chosenDay, int chosenMonth, int chosenYear, int chosenHour, int chosenMinute) {
        From = from;
        To = to;
        this.chosenDay = chosenDay;
        this.chosenMonth = chosenMonth;
        this.chosenYear = chosenYear;
        this.chosenHour = chosenHour;
        this.chosenMinute = chosenMinute;
    }

    public UserUploads(String from, String to, int chosenDay, int chosenMonth, int chosenYear, int chosenHour, int chosenMinute, String typeOfLuggage) {
        From = from;
        To = to;
        this.chosenDay = chosenDay;
        this.chosenMonth = chosenMonth;
        this.chosenYear = chosenYear;
        this.chosenHour = chosenHour;
        this.chosenMinute = chosenMinute;
        TypeOfLuggage = typeOfLuggage;
    }

    public String getFrom() {
        return From;
    }

    public void setFrom(String from) {
        From = from;
    }

    public String getTo() {
        return To;
    }

    public void setTo(String to) {
        To = to;
    }

    public int getChosenDay() {
        return chosenDay;
    }

    public void setChosenDay(int chosenDay) {
        this.chosenDay = chosenDay;
    }

    public int getChosenMonth() {
        return chosenMonth;
    }

    public void setChosenMonth(int chosenMonth) {
        this.chosenMonth = chosenMonth;
    }

    public int getChosenYear() {
        return chosenYear;
    }

    public void setChosenYear(int chosenYear) {
        this.chosenYear = chosenYear;
    }

    public int getChosenHour() {
        return chosenHour;
    }

    public void setChosenHour(int chosenHour) {
        this.chosenHour = chosenHour;
    }

    public int getChosenMinute() {
        return chosenMinute;
    }

    public void setChosenMinute(int chosenMinute) {
        this.chosenMinute = chosenMinute;
    }

    public String getTypeOfLuggage() {
        return TypeOfLuggage;
    }

    public void setTypeOfLuggage(String typeOfLuggage) {
        TypeOfLuggage = typeOfLuggage;
    }
}
