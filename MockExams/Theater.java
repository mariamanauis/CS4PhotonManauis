/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2MockExam;

/**
 *
 * @author HP
 */
public class Theater extends Venue {
    private int numStages;

    public Theater(String n, String l, double v, int num){
        super(n, l, v);
        numStages = num;
    }
    public int getNumStages(){
        return numStages;
    }
    @Override
    public boolean checkAvailability(){
        if(numStages > 0){
            return true;
        }
        else return false;
    } 
    @Override 
    public void reserve(){
        numStages -= 1;
    }
    @Override public void hostEvent(){
        numStages += 1;
    }
}
