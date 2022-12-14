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
public class Book {
    private String bookTitle;
    private String author;
    private int noPages;
    private int yearRelease;
    
    public Book(String bookTitle, String author, int noPages, int yearRelease) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.noPages = noPages;
        this.yearRelease = yearRelease;
    }
    
    //Setter Methods
    public void changeBookTitle(String bookTitle){
        this.bookTitle = bookTitle;
    }
    
    public void changeAuthor(String author){
        this.author = author;
    }
    
    public void changeNoPages(int noPages){
        this.noPages = noPages;
    }
    
    public void changeYearRelease(int yearRelease){
        this.yearRelease = yearRelease;
    }
    
    //Getter Methods
    public String returnBookTitle(){
        return bookTitle;
    }
    
    public String returnAuthor(){
        return author;
    }
    
    public int returnNoPages(){
        return noPages;
    }
    
    public int returnYearRelease(){
        return yearRelease;
    }
    
    public void introduceBook(){
        System.out.println(bookTitle + " by " + author + " is " + noPages + 
                " pages long and was released in " + yearRelease + ".");
    }
}
