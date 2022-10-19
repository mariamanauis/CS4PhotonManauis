package MockExam;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class WaterStation {
    private String name;
    private double rate, earnings;
   
    public WaterStation(String n, double r) {
        this.name = n;
        this.rate = r;
        this.earnings = 0;
    }
    
    public String getName() {
        return name;
    }
    public double getRate() {
        return rate;
    }
    public double getEarnings() {
        return earnings;
    }
    public void addEarnings(double e) {
        earnings += e;
    }
    public void displayStats() {
        System.out.println("Name: " + name);
        System.out.println("Rate per liter: " + rate);
        System.out.println("Earnings: " + earnings);
    }
}
