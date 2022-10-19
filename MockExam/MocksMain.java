/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MockExam;

/**
 *
 * @author HP
 */
import java.util.ArrayList;
import java.util.Scanner;

public class MocksMain {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        WaterTank homeTank = new WaterTank("John", 1000);
        WaterStation tap = new WaterStation("Tap", 1.5);
        WaterStation mw = new WaterStation("Manila Water", 8);
        WaterStation maynilad = new WaterStation("Maynilad", 6.5);
        
        ArrayList<WaterStation> stationList = new ArrayList();
        stationList.add(tap);
        stationList.add(mw);
        stationList.add(maynilad);

// Write a loop that ends when the homeTank has been filled to more than 100L or when the user types "exit". (2pts)
        while(homeTank.getAmountFilled() < 100){
            System.out.println("Which water station will you choose?");
            String input = reader.nextLine();
            
            if(input.equalsIgnoreCase("exit")){
                System.out.println("You have exited the app.");
                break;
            }
            else{
                boolean isHere = false;
                WaterStation tracker = null;
                for(int i = 0; i < stationList.size(); i++){
                    if(stationList.get(i).getName().equalsIgnoreCase(input)){
                        isHere = true;
                        System.out.println("How much water in L will you will the tank with?");
                        tracker = stationList.get(i);
                        double volume = Double.parseDouble(reader.nextLine());
                        homeTank.fill(tracker, volume);
                    }
                }
                if(!isHere){
                    System.out.println("There is no such water station called " + input);
                }
            }
            
        }
        homeTank.displayStats();
        tap.displayStats();
        mw.displayStats();
        maynilad.displayStats();
// Inside the loop:
// 	*Ask the user for input regarding which water station the homeTank will be filled at (or "exit"). (2pts)
// 		>Prints "No such water station called <input>." if user input does not match. (1pt)
// 	*Ask the user for input regarding how much the homeTank will be filled using the given water station. (2pts)
// 	*Have the homeTank filled using the information given (2pts)
// When the loop ends, display the stats of homeTank and the water stations. (1pt)
    }
}
