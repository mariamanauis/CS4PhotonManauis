/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise09photonmanauismaria;

/**
 *
 * @author HP
 */
public class main {
    public static void main(String[] args) {
        FireType f = new FireType("Charmander", 30, 20);
        Location l = new Location("Back Lobby", "Fruit Shake");
        Trainer t = new Trainer("Jason", l);
        NPC n = new NPC("Bob", l);
        
        System.out.println("Trainer interacts with monster.");
        t.inspect(f);
        System.out.println("Trainer interacts with NPC.");
        t.inspect(n);
        System.out.println("Trainer interacts with location.");
        t.inspect(l);
    }
    
}
