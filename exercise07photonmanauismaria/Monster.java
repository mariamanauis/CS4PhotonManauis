/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise06photonmanauismaria;

/**
 *
 * @author PHOTON
 */
import java.util.ArrayList;

public abstract class Monster {
    protected final String name, type, strongAgainst, weakAgainst;
    protected int maxHP, hp, xp, lvl;
    protected double atk, def;
    private boolean guard, charge;
    protected static ArrayList<Monster> monsterList = new ArrayList<>();

    public Monster(String n, String t, String s, String w, int m, int base){
        name = n;
        type = t;
        strongAgainst = s;
        weakAgainst = w;
        maxHP = m;
        hp = m;
        atk = base;
        def = base;
        monsterList.add(this);
    }

    public String getName() {
        return name;
    }
    public int getMaxHP() {
        return maxHP;
    }
    public int getHP() {
        return hp;
    }
    public double getAtk() {
        return atk;
    }
    public double getDef() {
        return def;
    }
    public static ArrayList<Monster> getMonsterList() {
        return monsterList;
    }

    public void attack(Monster m){
        int damage = (int) ((atk*atk)/(double)(atk+m.getDef()));    // damage is calculated as double, then cast as int
        boolean strong = false, weak = false;
        if(strongAgainst.equals(m.type)){
            damage *= 2;
            strong = true;
        }
        if(weakAgainst.equals(m.type)){
            damage *= 0.5;
            weak = true;
        }
        if(m.guard){
            m.guard = false;
            damage *= 0.7;
        }
        if(charge){
            charge = false;
            damage *= 1.3;
        }
        m.hp -= damage;
        if(m.hp < 0) m.hp = 0;
            System.out.println(name  + " attacked " + m.getName() +
            " and dealt " + damage + " damage, reducing it to " + m.getHP() + "HP.");
        if(strong) System.out.println("It was super effective!");
        if(weak) System.out.println("It wasn't very effective...");
        gainXP(2);                                                  // every attack raises XP by 2

        if(m.getHP() <= 0){
            m.hp = 0;
            System.out.println(m.getName() + " fainted.");
            gainXP(10);                                             // defeating a monster raises XP by 10
        }
    }

    public void guard(){
        guard = true;
        System.out.println(name + " put up its guard. It will receive 30% less damage on the next attack.");
    }

    public void charge(){
        charge = true;
        System.out.println(name + " charged. Its next attack will do 30% more damage.");
    }

    public void rest(){
        hp += maxHP * 0.15;
        if(hp > maxHP) hp = maxHP;
        System.out.println(name + " rested. It's health is now " + hp + ".");
    }

    public abstract void special(){
        System.out.println(name + " did a pose.");
    }

    public void resetHealth(){
        hp = maxHP;
    }

    // handles all increases in XP
    private void gainXP(int i){
        xp += i;
        if(xp >= 100){
            xp %= 100;
            lvl++;
            maxHP += 5;
            hp += 5;
            atk += 2;
            def += 2;
            System.out.println(name + " levelled up to " + lvl + "!");
        }
    }

}
