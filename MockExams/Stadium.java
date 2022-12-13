/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2MockExam;

/**
 *
 * @author HP
 */
public class Stadium extends Venue {
    private boolean reserved;

    public Stadium(String n, String l, double v){
        super(n,l,v);
        reserved = false;
    }
    
    @Override
    public boolean checkAvailability(){
        return reserved;
    }
    @Override 
    public void reserve(){
        reserved = true;
    }
    @Override 
    public void hostEvent(){
        reserved = false;
    }
    
}
