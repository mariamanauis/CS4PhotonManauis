/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex04PhotonManauis;

/**
 *
 * @author HP
 */
public class Singer {
    private String name;
    private int noOfPerformances;
    private double earnings;
    private Song favoriteSong;
    private static int totalPerformances = 0;
    
    public Singer(String name, int noOfPerformances, double earnings, Song favoriteSong) {
        this.name = name;
        this.noOfPerformances = 0;
        this.earnings = 0;
        this.favoriteSong = favoriteSong;
    }
    
    /*Setter methods. I decided to only have setted methods for favoriteSong as I decided a setter
    for the name would be unecessary and the totalPerformances and earnings depends on the parameter*/ 
    public void changeFavSong(String title, String album, int yearRelease) {
        //gets info from main.java and creates a new instance of a song which gets stored in favoriteSong
        favoriteSong = new Song(title, album, yearRelease);
    }
    
    //Getter Methods.
    public void checkInfo(){
        System.out.println(name + " is a singer who performed " + noOfPerformances 
            + " time(s) and earned a total of " + earnings + " pesos. Her favorite song is "
            + favoriteSong.returnTitle() + " from the album " + favoriteSong.returnAlbum() + " released in "
            + favoriteSong.returnYearRelease() + ".");
    }
    
    public String returnName(){
        return name;
    }
    
    public int returnNoOfPerformances(){
        return noOfPerformances;
    }
    
    public double returnEarnings(){
        return earnings;
    }
    
    public Song returnFavoriteSong(){
        return favoriteSong;
    }
    
    //methods for totalPerformances and overloading
    public void performForAudience(int numberOfPeople) {
        noOfPerformances += 1;
        totalPerformances += 1;
        earnings += numberOfPeople * 100;
        
        System.out.println(name + " has performed " + noOfPerformances + " times and earned " +
            earnings + " pesos. They have performed " + totalPerformances + " time throughout their career.");
    }
    
    public void performForAudience(Singer anotherSinger, int numberOfPeople){
        noOfPerformances += 1;
        anotherSinger.noOfPerformances += 1;
        earnings = (numberOfPeople*100)/2;
        anotherSinger.earnings = (numberOfPeople*100)/2;
        
        System.out.println(name + " and " + anotherSinger.name + " performed together for "
            + numberOfPeople + " people and earned " + earnings + " pesos each.");
    }
}
