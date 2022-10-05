/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex04PhotonManauis;

/**
 *
 * @author HP
 */
public class Song {
    private String title;
    private String album;
    private int yearRelease;
    
    public Song(String title, String album, int yearRelease) {
        this.title = title;
        this.album = album;
        this.yearRelease = yearRelease;
    }
    
    /*Getter Methods. There are no setter methods since these fields are associated
    with favoriteSong in Singer class*/
    public String returnTitle(){
        return title;
    }
    
    public String returnAlbum(){
        return album;
    }
    
    public int returnYearRelease(){
        return yearRelease;
    }
}
