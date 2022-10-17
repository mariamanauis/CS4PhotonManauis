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
public class WaterTank {
    private String owner;
    private double funds, amountFilled;
    
    public WaterTank(String o, double f){
        owner = o;
        funds = f;
        amountFilled = 0;
    }
   
    public String getOwner(){
        return owner;
    }
    public double getFunds(){
        return funds;
    }
    public void getAmountFilled(){
        System.out.println(amountFilled);
    }
    public void addAmountFilled(double d) {
        amountFilled += d;
    }
    public void fill(WaterStation s, double volume){
        double cost = s.getRate()*volume;
        if(funds <= cost){
            funds -= cost;
            amountFilled += volume;
            s.getEarnings() += cost;
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


//     -fill(WaterStation s, double volume): given a WaterStation s, compute the cost by multiplying its rate to the volume. Subtract the cost from the funds and add it to the earnings of WaterStation s. Add value to amountFilled. (5pts)
//             *Print "<owner> spent <x> pesos and filled tank by <x> L from <WaterStation name>." (2pts)
//             *Print "<owner> didn't have enough money to fill tank from <WaterStation name>." in case not have enough money. (3pts)
//     -displayStats(): prints fields and values of WaterTank (1pt)

// Create a WaterTank homeTank with the owner "John", 1000 funds, and 0 amountFilled. (2pts)
// Create a WaterStation tap with the name "Tap", rate of 1.5/L, and 0 earnings. (2pts)
// Create a WaterStation mw with the name "Manila Water", rate of 8/L, and 0 earnings. (2pts)
// Create a WaterStation maynilad with the name "Maynilad", rate of 6.5/L and 0 earnings. (2pts)
// Add all the WaterStations to an ArrayList called stationList. (2pts)
// Write a loop that ends when the homeTank has been filled to more than 100L or when the user types "exit". (2pts)
// Inside the loop:
// 	*Ask the user for input regarding which water station the homeTank will be filled at (or "exit"). (2pts)
// 		>Prints "No such water station called <input>." if user input does not match. (1pt)
// 	*Ask the user for input regarding how much the homeTank will be filled using the given water station. (2pts)
// 	*Have the homeTank filled using the information given (2pts)
// When the loop ends, display the stats of homeTank and the water stations. (1pt)
}
