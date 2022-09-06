/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Marie Manauis
 */
public class Ex01PhotonManauis {
    public static void main(String[] args) {
    // title, number of pages, and year of release of book
        String title1 = "The Jasmine Throne";
        int noPages1 = 576;
        int yearRelease1 = 2021;
        
        String title2 = "Babel, or The Necessity of Violence: An Arcane History "
                + "of the Oxford Translators";
        int noPages2 = 560;
        int yearRelease2 = 2022;
        
        String title3 = "The Burning God";
        int noPages3 = 656;
        int yearRelease3 = 2020;
        
        //operators
        int totalPages = noPages1 + noPages2 + noPages3;
        boolean comparePages = noPages1 < noPages2;
        boolean compareYear = yearRelease1 > yearRelease3;
        
        //print outputs
        System.out.println("Book 1");
        System.out.println("Book Title: " + title1);
        System.out.println("Number of Pages: " + noPages1);
        System.out.println("Year of Release: " + yearRelease1 + '\n');
        
        System.out.println("Book 2");
        System.out.println("Book Title: " + title2);
        System.out.println("Number of Pages: " + noPages2);
        System.out.println("Year of Release: " + yearRelease2 + '\n');
        
        System.out.println("Book 3");
        System.out.println("Book Title: " + title3);
        System.out.println("Number of Pages: " + noPages3);
        System.out.println("Year of Release: " + yearRelease2 + '\n');
        
        System.out.println("Total number of pages of the three books: " 
                + totalPages);
        System.out.println("Babel, or The Necessity of Violence: An Arcane History "
                + "of the Oxford Translators has more pages than The Jasmine Throne: " 
                + comparePages);
        System.out.println("The Jasmine Throne was released later than The Burning God: " 
                + compareYear);
  }
}
