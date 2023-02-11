/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise12photonmanauismaria;

/**
 *
 * @author HP
 */
public class main {
    public static void main(String[] args){
        Subject[] party = new Subject[5];
        party[0] = new Subject("Math", "math.png", 4, 1.75);
        party[1] = new Subject("Biology", "biology.png", 3, 2.0);
        party[2] = new Subject("Chemistry", "chemistry.png", 3, 1.5);
        party[3] = new Subject("Physics", "physics.png", 3, 1.75);
        party[4] = new Subject("CS", "computer science.png", 1, 1.5);
        
        PartyDisplay frame = new PartyDisplay(party);
        
        frame.setVisible(true);
    }
}
