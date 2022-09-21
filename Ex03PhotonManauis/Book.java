/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex03PhotonManauis;

/**
 *
 * @author HP
 */
public class Book {
    String bookTitle;
    String author;
    int noPages;
    int yearRelease;
    
    public Book(String bookTitle, String author, int noPages, int yearRelease) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.noPages = noPages;
        this.yearRelease = yearRelease;
    }
    
    public void introduceBook() {
        System.out.println(bookTitle + " by " + author + " is " + noPages + 
                " pages long and was released in " + yearRelease + ".");
    }
}
