package com.pluralsight;
public class Room {
    private int roomNumber;
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;
    public Room(int roomNumber, int numberOfBeds, double price) {
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = false;
        this.dirty = false;
    }
    public int getNumberOfBeds() {
        return numberOfBeds;
    }
    public double getPrice() {
        return price;
    }
    public boolean isOccupied() {
        return occupied;
    }
    public boolean isDirty() {
        return dirty;
    }
    public boolean isAvailable() {
        return !occupied && !dirty;
    }
    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }}
