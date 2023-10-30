package com.pluralsight;
public class Reservation {
    private Room room;
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;
    private double reservationTotal;
    public Reservation(Room room, int numberOfNights, boolean isWeekend) {
        this.room = room;
        this.roomType = room.getNumberOfBeds() == 1 ? "King" : "Double";
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
        this.reservationTotal = calculateReservationTotal();
    }
    public String getRoomType() {
        return roomType;
    }
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
    public int getNumberOfNights() {
        return numberOfNights;
    }
    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
        this.reservationTotal = calculateReservationTotal();
    }
    public boolean isWeekend() {
        return isWeekend;
    }
    public void setIsWeekend(boolean isWeekend) {
        this.isWeekend = isWeekend;
        this.reservationTotal = calculateReservationTotal();
    }
    public double getReservationTotal() {
        return reservationTotal;
    }
    private double calculateReservationTotal() {
        double basePrice = room.getPrice() * numberOfNights;
        if (isWeekend) {
            return basePrice * 1.2;
        } else {
            return basePrice;
        }}}
