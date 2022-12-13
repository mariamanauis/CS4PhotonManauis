/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2MockExam;

/**
 *
 * @author HP
 */
public class IndieBand extends Band implements SelfPromoting  {
    private String origin;

    public IndieBand(String s, int p, String o){
        super(s, p);
        origin = o;
    }
    public void reserve(Venue v){
        if(v.checkAvailability()){
            v.reserve();
            selectedVenue = v;
        }
    }
    @Override
    public void perform(){
        if(selectedVenue != null){
            selectedVenue.hostEvent();
            selectedVenue = null;
            if(selectedVenue.getLocation().equals(origin)){
                popularity += 10;
            }
            else{
                popularity += 5;
            }
        }
    }
    @Override 
    public void advertise(){
        popularity += performances/10;
    }
}
