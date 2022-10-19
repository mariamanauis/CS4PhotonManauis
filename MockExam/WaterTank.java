/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MockExam;

/**
 *
 * @author HP
 */
public class WaterTank {
    private String owner;
    private double funds, amountFilled;
    
    public WaterTank(String o, double f){
        owner = o;
        funds = f;
    }
    
    public String getOwner(){
        return owner;
    }
    public double getFunds(){
        return funds;
    }
    public double getAmountFilled(){
        return amountFilled;
    }
    public void fill(WaterStation s, double volume){
        double cost = s.getRate()*volume;
        if(funds >= cost){
            funds -= cost;
            amountFilled += volume;
            s.addEarnings(cost);
            System.out.println(owner + " spent " + cost + " and filled tank by " + volume + "L from " + s.getName() + ".");
        }
        else{
            System.out.println(owner + " didn't have enough money to fill the tank from " + s.getName() + ".");
        }
    }
    public void displayStats(){
        System.out.println("Owner: " + owner);
        System.out.println("Funds: " + funds);
        System.out.println("Amount filled: " + amountFilled);
    }
}
