/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise13photonmanauismaria;

import java.awt.*;
import javax.swing.*;
/**
 *
 * @author HP
 */
public class main {
    public static void main(String[] args){
        
       Subject[] subList = new Subject[5];
        subList[0] = new Subject("Math", "math.png", 4, 1.75);
        subList[1] = new Subject("Biology", "biology.png", 3, 2.0);
        subList[2] = new Subject("Chemistry", "chemistry.png", 3, 1.5);
        subList[3] = new Subject("Physics", "physics.png", 3, 1.75);
        subList[4] = new Subject("CS", "computer science.png", 1, 1.5);
        
        
        JFrame frame = new MainDisplay(subList, 0);
        frame.setVisible(true);
        
    }
}
