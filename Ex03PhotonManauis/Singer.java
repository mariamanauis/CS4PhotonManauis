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
        this.noOfPerformances = 0;
        this.earnings = 0.0;
        this.favoriteSong = favoriteSong;
    }
    
    public void checkInfo() {
        System.out.println(name + " has performed " + noOfPerformances + " times and earned " 
            + earnings + " pesos. Her favorite song is " + favoriteSong.title + " from the album " 
                + favoriteSong.album + " released in " + favoriteSong.yearRelease + ".");

    }
    
    public void performForAudience(int people) {
       // for each performance, singer earns 100 pesos
       noOfPerformances += people;
       earnings += people * 100;
    }
    
    public void changeFavSong (String title, String album, int yearRelease) {
        favoriteSong = new Song(title, album, yearRelease);
    }
    
}
