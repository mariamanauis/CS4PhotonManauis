/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise16photonmanauismaria;

/**
 *Subject class details a subject's name, 
 * image filename, units, and grades along
 * with methods returning said details
 *
 * @author Maria Manauis
 * @version 1.0
 * @since 20/04/2023
 */
import java.util.*;

public class Subject {
    private String name, imgFileName;
    private double units, grade;
	private static ArrayList<Subject> subjectList = new ArrayList();
        
    /** Constructs subject provided with parameters
    * @param n - string user input representing 
    * name of subject
    * @param i - string user input representing 
    * subject's image filename
    * @param u - double user input representing
    * subject's units
    * @param g - double user input representing
    * subject's grade
    */
    public Subject(String n, String i, double u, double g){
        name = n;
        imgFileName = i;
        units = u;
        grade = g;
		subjectList.add(this);
    }
    
    /** Gets the subject’s name.
    * @return A string representing subject’s
    *     name.
    */
    public String getName() {
        return name;
    }
    
    /** Gets the subject’s image filename.
    * @return A string representing the subject’s
    *     image filename.
    */
    public String getImgFileName(){
        return imgFileName;
    }
    
    /** Gets the subject’s units.
    * @return A double representing the subject’s
    *     units.
    */
    public double getUnits() {
        return units;
    }
    
    /** Sets the subject’s units.
    * 
    * @param units double user input
    */
    public void setUnits(double units) {
        units = units;
    }
    
    /** Gets the subject’s grade.
    * @return A double representing the subject’s
    *     grade.
    */
    public double getGrade() {
        return grade;
    }
    
    /** Sets the subject’s grade.
    * 
    * @param grade double user input
    */
    public void setGrade(double grade) {
        grade = grade;
    }
    
    /** Gets the size of array subjectList.
    * @return An int representing the size
    * of array subjectList.
    */
    public static int getListLength() {
        return subjectList.size();
    }
    
    /** Returns the index of a subject in
     * subjectList.
    * @return An int representing the index
    * of the subject being searched.
    * @param s Subject user input
    * @throws NullPointerException if Subject
    * is not in subjectList
    */
    public static int getSubjectIndex(Subject s) throws NullPointerException {
        if(subjectList.contains(s)) return subjectList.indexOf(s);
        else throw new NullPointerException();
    }
    
    /** Returns the index of a subject in
     * subjectList using the subject's name.
    * @return An int representing the index
    * of the subject being searched.
    * @param s String user input
    * @throws NullPointerException if Subject
    * is not in subjectList
    */
    public static int getSubjectIndex(String s) throws NullPointerException {
        if(subjectList.contains(searchSubject(s))) return subjectList.indexOf(searchSubject(s));
        else throw new NullPointerException();
    }
    
    /** Returns the Subject corresponding the
     * subject name inputted by the user
    * @return Subject with name corresponding 
    * to the user's input
    * @param search - String user input
    * @throws NullPointerException if search 
    * does not match any subject name
    */
    public static Subject searchSubject(String search) throws NullPointerException {
        for(Subject s : subjectList){
            if(s.getName().equalsIgnoreCase(search)) return s;
        }
        throw new NullPointerException();
    }
}
