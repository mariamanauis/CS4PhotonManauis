/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2MockExam;

/**
 *
 * @author HP
 */
public abstract class Venue implements SelfPromoting {
    private String name, location;
    private double value;

    public Venue(String s, String l, double v){
        name = s;
        location = l;
        value = v;
    }
    public String getName(){
        return name;
    }
    public String getLocation(){
        return location;
    }
    public double getValue(){
        return value;
    }
    public abstract boolean checkAvailability();
    public abstract void reserve();
    public abstract void hostEvent();
    public void advertise(){
        value += 2;
    }
        
}
