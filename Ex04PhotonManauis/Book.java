/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex04PhotonManauis;

/**
 *
 * @author HP
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
