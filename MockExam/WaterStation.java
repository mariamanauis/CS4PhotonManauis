/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MockExam;

/**
 *
 * @author PHOTON
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
