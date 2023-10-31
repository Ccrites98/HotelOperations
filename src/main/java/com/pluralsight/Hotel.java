package com.pluralsight;
public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;
    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }
    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedRooms;
    }
    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        if (isSuite) {
            if (numberOfRooms <= (numberOfSuites - bookedSuites)) {
                bookedSuites += numberOfRooms;
                return true;
            }} else {
            if (numberOfRooms <= (numberOfRooms - bookedBasicRooms)) {
                bookedBasicRooms += numberOfRooms;
                return true;
            }}
        return false;
    }
    public int getAvailableSuites() {
        return numberOfSuites - bookedSuites;
    }
    public int getAvailableRooms() {
        return numberOfRooms - bookedBasicRooms;
    }
    public String getName() {
        return name;
    }
    public int getNumberOfSuites() {
        return numberOfSuites;
    }
    public int getNumberOfRooms() {
        return numberOfRooms;
    }
    public int getBookedSuites() {
        return bookedSuites;
    }
    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }
    public boolean bookSuite() {
        if (bookedSuites < numberOfSuites) {
            bookedSuites++;
            return true;
        } else {
            return false;
        }}
    public boolean bookBasicRoom() {
        if (bookedBasicRooms < numberOfRooms) {
            bookedBasicRooms++;
            return true;
        } else {
            return false;
        }}
    public void checkOutSuite() {
        if (bookedSuites > 0) {
            bookedSuites--;
        }}
    public void checkOutBasicRoom() {
        if (bookedBasicRooms > 0) {
            bookedBasicRooms--;
        }}
}