/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex05PhotonManauis;

/**
 *
 * @author HP
 */
import java.util.ArrayList;

public class Store {
    private String name;
    private double earnings;
    private ArrayList<Item> itemList;
    private static ArrayList<Store> storeList = new ArrayList();

    public Store(String name){
      // Initialize name to parameter and earnings to zero
      // Initialize itemList as a new ArrayList
      // add 'this' store to storeList
      this.name = name;
      earnings = 0;
      itemList = new ArrayList();
      storeList.add(this);
    }

    public String getName(){
      return name;
    }
    public double getEarnings(){
      return earnings;
    }
    public void sellItem(int index){
      // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
      // get Item at index from itemList and add its cost to earnings
      // print statement indicating the sale
      if (index < itemList.size()){
          earnings += itemList.get(index).getCost();
          System.out.println(itemList.get(index).getName() + " has been sold!");
      }
      else {
          System.out.println("There are only " + itemList.size() + " items in the store.");
      }
    }
    public void sellItem(String name){
      // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
      // get Item from itemList and add its cost to earnings
      // print statement indicating the sale
      for(int i = 0; i < itemList.size(); i++){
          if(itemList.get(i).getName().equalsIgnoreCase(name)){
              earnings += itemList.get(i).getCost();
              System.out.println(name + " has been sold!");
          }
          else {
              System.out.println("The store does not sell " + name);
          }
      }  
    }
    public void sellItem(Item i){
      // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
      // get Item i from itemList and add its cost to earnings
      // print statement indicating the sale
      if(storeList.contains(i)){
          earnings += i.getCost();
          System.out.println("This item has been sold!");
      }
      else{
          System.out.println("The store does not sell this item");
      }
    }
    public void addItem(Item i){
      // add Item i to store's itemList
      itemList.add(i);
    }
    public void filterType(String type){
      // loop over itemList and print all items with the specified type
      for(Item i: itemList){
          if(i.getType().equalsIgnoreCase(type)) {
              System.out.println(i.getName());
          }
      }
    }
    public void filterCheap(double maxCost){
      // loop over itemList and print all items with a cost lower than or equal to the specified value
      for(Item i: itemList){
          if(i.getCost() <= maxCost){
              System.out.println(i.getName());
          }
      }
    }
    public void filterExpensive(double minCost){
      // loop over itemList and print all items with a cost higher than or equal to the specified value
      for(Item i: itemList){
          if(i.getCost() <= minCost){
              System.out.println(i.getName());
          }
      }
    }
    public static void printStats(){
      // loop over storeList and print the name and the earnings'Store.java'
      for(Store s : storeList){
          System.out.println(s.getName() + ": ");
          System.out.println(s.getEarnings());
      }
    }
}
