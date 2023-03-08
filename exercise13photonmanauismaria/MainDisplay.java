/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise13photonmanauismaria;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author HP
 */
public class MainDisplay extends JFrame implements ActionListener{
    private JLabel header, subjectName, subjectImg, subjectGrades, subjectUnits;
    private JTextField subjectField;
    private JButton next, previous, search;
    private JPanel northPanel, southPanel, main;
    private JLabel name, grade, unit, image;
    private Subject[] subjectList;
    private int index;
    
    public MainDisplay(Subject[] subjList, int i){
        super("Exercise 13");
        this.setSize(450,200);
        subjectList = subjList.clone(); //copies content from the array to access for next and prev
    
        header = new JLabel("Enter a subject");
        subjectField = new JTextField(10);
        search = new JButton("Search");
        search.addActionListener(this);
        northPanel = new JPanel();
        northPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        northPanel.add(header);
        northPanel.add(subjectField);
        northPanel.add(search);
        
        name = new JLabel("Subject: ");
        subjectName = new JLabel(subjList[i].getName());
        unit = new JLabel("Units: ");
        subjectUnits = new JLabel(String.valueOf(subjList[i].getUnits()));
        grade = new JLabel("Grade: ");
        subjectGrades = new JLabel(String.valueOf(subjList[i].getGrade()));
        subjectImg = new JLabel();
        ImageIcon img = new ImageIcon(main.class.getResource(subjList[i].getImgFileName()));
        subjectImg.setIcon(img);
        main = new JPanel();
        main.setLayout(new FlowLayout(FlowLayout.CENTER));
        main.add(subjectImg);
        main.add(name);
        main.add(subjectName);
        main.add(unit);
        main.add(subjectUnits);
        main.add(grade);
        main.add(subjectGrades);
        
        
        next = new JButton("Next");
        next.addActionListener(this);
        previous = new JButton("Previous");
        previous.addActionListener(this);
        southPanel = new JPanel();
        southPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        southPanel.add(previous);
        southPanel.add(next);
        this.setLayout(new BorderLayout());
        this.add(northPanel, BorderLayout.NORTH);
        this.add(main, BorderLayout.CENTER);
        this.add(southPanel, BorderLayout.SOUTH);
        
        checkIndex(); //checks beforehand to display that prev is disabled since no subject before math
        
    }
    public void changeTheSubject(int p){
        //decided to put the changing of subjects into one method for easier compiling
        Subject previousSubject = subjectList[p];
        subjectImg.setIcon(new ImageIcon(main.class.getResource(previousSubject.getImgFileName())));
        subjectName.setText(previousSubject.getName());
        subjectUnits.setText(String.valueOf(previousSubject.getUnits()));
        subjectGrades.setText(String.valueOf(previousSubject.getGrade()));
    }
    
    public void checkIndex(){
        //put this in one method to lessen amount of code in the listeners
        if(index == 0){
            previous.setEnabled(false);
            next.setEnabled(true);
            header.setText("No more subject before this");
            header.setForeground(Color.RED);
        }
        else if(index == subjectList.length-1){
            previous.setEnabled(true);
            next.setEnabled(false);
            header.setText("No more subject after this");
            header.setForeground(Color.RED);
        }
        else{ //sets header and buttons back to regular display
            previous.setEnabled(true);
            next.setEnabled(true);
            header.setText("Enter a subject");
            header.setForeground(Color.BLACK);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == search){
       
            try{
                String text = subjectField.getText();
                Subject found = Subject.searchSubject(text);
                index = Subject.getSubjectIndex(found);
                checkIndex(); 
                //ensures next button stays disabled when user searches cs (last in array)
                ImageIcon newImg = new ImageIcon(MainDisplay.class.getResource(found.getImgFileName()));
                subjectImg.setIcon(newImg);
                subjectName.setText(found.getName());
                subjectGrades.setText(String.valueOf(found.getGrade()));
                subjectUnits.setText(String.valueOf(found.getUnits()));
            }
            catch(NullPointerException n){
                header.setText("No subject was found");
                header.setForeground(Color.RED);
            }
           
         
        }
        if(e.getSource() == previous){
           try{
               String displayedName = subjectName.getText();
               Subject displayedSubject = Subject.searchSubject(displayedName);
               index = Subject.getSubjectIndex(displayedSubject);
               checkIndex();
               index--;
               changeTheSubject(index);
               checkIndex();
             
           }
           catch(NullPointerException n){
               header.setText("No subject was found");
               header.setForeground(Color.RED);
           }
        }
        if(e.getSource() == next){
            try{
                String displayedName = subjectName.getText();
               Subject displayedSubject = Subject.searchSubject(displayedName);
               index = Subject.getSubjectIndex(displayedSubject);
               checkIndex();
               index++;
               changeTheSubject(index);
               checkIndex();
               
           }
           catch(NullPointerException n){
               header.setText("No subject was found");
               header.setForeground(Color.RED);
           }
        }
    }
}
