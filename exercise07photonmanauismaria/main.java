/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise07photonmanauismaria;

/**
 *
 * @author HP
 */
public class main {
    public static void main(String[] args) {
        FireType f = new FireType("Charmander", 30, 20);
        GrassType g = new GrassType("Bulbasaur", 25, 25);
        WaterType w = new WaterType("Mudkip", 20, 10);
        
        do{
            g.attack(f);
            f.attack(w);
            w.attack(g);
        }while(f.getHP() > 0 && g.getHP() > 0 && w.getHP() > 0);
    }
    
}
