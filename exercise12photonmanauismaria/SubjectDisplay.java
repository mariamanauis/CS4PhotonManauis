/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise12photonmanauismaria;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author HP
 */
public class SubjectDisplay extends JPanel {
    private JLabel subjectName;
    private JLabel grade;
    private JLabel units;
    
    private JPanel info, outer; 
    
    public SubjectDisplay(Subject s){
        this.subjectName = new JLabel(s.getName());
        this.subjectName.setHorizontalTextPosition(JLabel.CENTER);
        this.subjectName.setVerticalTextPosition(JLabel.BOTTOM);
        ImageIcon img = new ImageIcon(SubjectDisplay.class.getResource(
            s.getImgFileName()));
        subjectName.setIcon(img);
        this.grade = new JLabel("Grade: " + s.getGrade());
        this.units = new JLabel("Units: " + s.getUnits());
        
        this.info = new JPanel();
        info.setLayout(new BoxLayout(info, BoxLayout.Y_AXIS));
        info.add(grade);
        info.add(units);
        
        this.setLayout(new GridBagLayout());
        GridBagConstraints con = new GridBagConstraints();
        con.gridx = 0;
        con.gridy = 0;
        con.insets = new Insets(5,5,5,5);
        this.add(subjectName, con);

        con.gridx = 1;
        this.add(info, con);
        this.setBorder(BorderFactory.createLineBorder(Color.black));
    }
    
}
