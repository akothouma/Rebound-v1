package com.example.rebound_v1;

public class UserUploads {
    private String From;
    private String To;
    private int firstChosenDay, firstChosenMonth, firstChosenYear;
    private int lastChosenDay, lastChosenMont, lastChosenYear;
    private int firstChosenHour, FirstChosenMinute;
    private int lastChosenHour, LastChosenMinute;
    private String TypeOfLuggage;

// constructor for driver uploads


    public UserUploads(String from, String to, int firstChosenDay, int firstChosenMonth, int firstChosenYear, int lastChosenDay, int lastChosenMont, int lastChosenYear, int firstChosenHour, int firstChosenMinute, int lastChosenHour, int lastChosenMinute) {
        From = from;
        To = to;
        this.firstChosenDay = firstChosenDay;
        this.firstChosenMonth = firstChosenMonth;
        this.firstChosenYear = firstChosenYear;
        this.lastChosenDay = lastChosenDay;
        this.lastChosenMont = lastChosenMont;
        this.lastChosenYear = lastChosenYear;
        this.firstChosenHour = firstChosenHour;
        FirstChosenMinute = firstChosenMinute;
        this.lastChosenHour = lastChosenHour;
        LastChosenMinute = lastChosenMinute;
    }

    // constructor for consumer uploads


    public UserUploads(String from, String to, int firstChosenDay, int firstChosenMonth, int firstChosenYear, int lastChosenDay, int lastChosenMont, int lastChosenYear, int firstChosenHour, int firstChosenMinute, int lastChosenHour, int lastChosenMinute, String typeOfLuggage) {
        From = from;
        To = to;
        this.firstChosenDay = firstChosenDay;
        this.firstChosenMonth = firstChosenMonth;
        this.firstChosenYear = firstChosenYear;
        this.lastChosenDay = lastChosenDay;
        this.lastChosenMont = lastChosenMont;
        this.lastChosenYear = lastChosenYear;
        this.firstChosenHour = firstChosenHour;
        FirstChosenMinute = firstChosenMinute;
        this.lastChosenHour = lastChosenHour;
        LastChosenMinute = lastChosenMinute;
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

    public int getFirstChosenDay() {
        return firstChosenDay;
    }

    public void setFirstChosenDay(int firstChosenDay) {
        this.firstChosenDay = firstChosenDay;
    }

    public int getFirstChosenMonth() {
        return firstChosenMonth;
    }

    public void setFirstChosenMonth(int firstChosenMonth) {
        this.firstChosenMonth = firstChosenMonth;
    }

    public int getFirstChosenYear() {
        return firstChosenYear;
    }

    public void setFirstChosenYear(int firstChosenYear) {
        this.firstChosenYear = firstChosenYear;
    }

    public int getLastChosenDay() {
        return lastChosenDay;
    }

    public void setLastChosenDay(int lastChosenDay) {
        this.lastChosenDay = lastChosenDay;
    }

    public int getLastChosenMont() {
        return lastChosenMont;
    }

    public void setLastChosenMont(int lastChosenMont) {
        this.lastChosenMont = lastChosenMont;
    }

    public int getLastChosenYear() {
        return lastChosenYear;
    }

    public void setLastChosenYear(int lastChosenYear) {
        this.lastChosenYear = lastChosenYear;
    }

    public int getFirstChosenHour() {
        return firstChosenHour;
    }

    public void setFirstChosenHour(int firstChosenHour) {
        this.firstChosenHour = firstChosenHour;
    }

    public int getFirstChosenMinute() {
        return FirstChosenMinute;
    }

    public void setFirstChosenMinute(int firstChosenMinute) {
        FirstChosenMinute = firstChosenMinute;
    }

    public int getLastChosenHour() {
        return lastChosenHour;
    }

    public void setLastChosenHour(int lastChosenHour) {
        this.lastChosenHour = lastChosenHour;
    }

    public int getLastChosenMinute() {
        return LastChosenMinute;
    }

    public void setLastChosenMinute(int lastChosenMinute) {
        LastChosenMinute = lastChosenMinute;
    }

    public String getTypeOfLuggage() {
        return TypeOfLuggage;
    }

    public void setTypeOfLuggage(String typeOfLuggage) {
        TypeOfLuggage = typeOfLuggage;
    }
}

