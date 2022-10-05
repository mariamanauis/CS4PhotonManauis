/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex04PhotonManauis;

/**
 *
 * @author HP
 */
public class main {
     public static void main(String[] args){
        Book tpw = new Book("The Poppy War", "R.F. Kuang", 544, 2019);
        Book tdr = new Book("The Dragon Republic", "R.F. Kuang", 672, 2020);
        Book tbg = new Book("The Burning God", "R.F. Kuang", 656, 2021);
        
        tpw.introduceBook();
        tdr.introduceBook();
        tbg.introduceBook();
        
        Singer rina = new Singer("Rina Sawayama", 0, 0.0, new Song("Tokyo Love Hotel", "SAWAYAMA", 2020));
        rina.checkInfo();
        rina.performForAudience(12);
        rina.changeFavSong("Imagining", "Hold the Girl", 2022);
        rina.checkInfo();
        
        Singer taylor = new Singer("Taylor Swift", 0, 0.0, new Song("my tears ricochet", "folklore", 2020));
        taylor.checkInfo();
        taylor.performForAudience(rina, 16);
    }
}
