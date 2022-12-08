/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise09photonmanauismaria;

/**
 *
 * @author HP
 */
import java.util.ArrayList;

public class Trainer extends Character {
    private Monster activeMonster;
    private ArrayList<Monster> team;

    public Trainer(String n){
        super(n);
        this.activeMonster = null;
        this.team = new ArrayList<>();
    }
    public Trainer(String n, Location l){
        super(n, l);
        this.activeMonster = null;
        this.team = new ArrayList<>();
    }

    public Monster getActiveMonster(){
        return activeMonster;
    }
    public ArrayList<Monster> getTeam(){
        return team;
    }

    public void capture(Monster m){
        if(m.getHP() < m.getMaxHP()*0.2){
            team.add(m);
            System.out.println(this.getName() + " caught " + m.getName() + ".");
        }
        else{
            System.out.println(this.getName() + " failed to catch " + m.getName() + ".");
        }
    }
    public void battle(Monster m){
        activeMonster.attack(m);
    }
    public void battle(Trainer t){
        activeMonster.attack(t.getActiveMonster());
    }
    
    public void inspect(Interactive i){
        i.interact();
    }
    
    public void sureCapture(Monster m) throws AlreadyCapturedException, FullTeamException{
	team.add(m);
	System.out.printf("%s was successfully captured.%n", m.getName());
        
        if(team.contains(m)){
            throw new AlreadyCapturedException("Monster " + m + " has already been captured!");
        }
        
        if(team.size() == 6){
            throw new FullTeamException("Team is already full.");
        }
    }
    public void release(Monster m) throws NotInTeamException{
            team.remove(m);
            System.out.printf("%s was released from the team.%n", m.getName());
            
            if(!team.contains(m)){
                throw new NotInTeamException("Monster " + m + " not in team.");
            }
    }
}
