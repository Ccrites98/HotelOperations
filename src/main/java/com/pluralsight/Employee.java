package com.pluralsight;
import java.time.LocalTime;
public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double totalPay;
    private double startTime;
    private double endTime;
    public Employee(int employeeId, String name, String department, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = 0.0;
        this.totalPay = 0.0;
        this.startTime = 0.0;
    }
    public double getTotalPay() {
        double totalPay = hoursWorked * payRate;
        return totalPay;
    }
    public double getRegularHours() {
        if (hoursWorked <= 40) {
            return hoursWorked;
        } else {
            return 40;
        }}
    public double getOvertimeHours() {
        if (hoursWorked > 40) {
            return hoursWorked - 40;
        } else {
            return 0;
        }}
    public void punchTimeCard(double time) {
        if (time >= startTime) {
            double workHoursToday = time - startTime;
            if (workHoursToday <= 8.0) {
                hoursWorked += workHoursToday;
            } else {
                hoursWorked += 8.0;
                double overtimeHours = workHoursToday - 8.0;
                hoursWorked += overtimeHours;
            }
            startTime = time;
        }}
    public void punchIn() {
        LocalTime currentTime = LocalTime.now();
        double currentHour = currentTime.getHour() + (currentTime.getMinute() / 60.0);
        punchTimeCard(currentHour);
        startTime = currentHour;
    }
    public void punchOut() {
        LocalTime currentTime = LocalTime.now();
        double currentHour = currentTime.getHour() + (currentTime.getMinute() / 60.0);
        punchTimeCard(currentHour);
        endTime = currentHour;
    }
    public void punchOut(double time) {
        punchTimeCard(time);
        endTime = time;
    }}