/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex03PhotonManauis;

/**
 *
 * @author HP
 */
public class Singer {
    String name;
    int noOfPerformances;
    double earnings;
    Song favoriteSong;
    
    public Singer(String name, int noOfPerformances, double earnings, Song favoriteSong) {
        this.name = name;
        this.noOfPerformances = noOfPerformances;
        this.earnings = earnings;
        this.favoriteSong = favoriteSong;
    }
    
    public void checkInfo() {
        System.out.println(name + " is a singer who performed " + noOfPerformances 
            + " times and earned a total of " + earnings + " pesos. Her favorite song is "
            + favoriteSong.title + " from the album " + favoriteSong.album + " released in "
            + favoriteSong.yearRelease + ".");
    }
    
    public void performForAudience(int numberOfPeople) {
        //each performance pays 100 pesos
        noOfPerformances += numberOfPeople;
        earnings += numberOfPeople * 100;
    }
    
    public void changeFavSong(String title, String album, int yearRelease) {
        //gets info from main.java and creates a new instance of a song which gets stored in favoriteSong
        favoriteSong = new Song(title, album, yearRelease);
    }
   
}
