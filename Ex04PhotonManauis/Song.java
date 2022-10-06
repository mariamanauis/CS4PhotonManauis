/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex04PhotonManauis;

/**
 *
 * @author PHOTON
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
