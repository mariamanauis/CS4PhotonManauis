/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex03PhotonManauis;

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
    }
}
