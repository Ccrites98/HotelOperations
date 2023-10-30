package com.pluralsight;
public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double totalPay;
    public Employee(int employeeId, String name, String department, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = 0.0;
        this.totalPay = 0.0;
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
        double overtimeHours = hoursWorked - 40;
        return overtimeHours;
    }}

