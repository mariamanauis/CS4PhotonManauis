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
public class PartyDisplay extends JFrame {
    private JLabel header;
    private JPanel northPanel, main;
    private static int maxCols = 3;
    private static int maxRows = 2;

    public PartyDisplay(Subject[] party) {
        super("Subject Information");
        header = new JLabel("Subjects' Information");
        northPanel = new JPanel();
        main = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(200*maxCols, 200*maxRows);
        this.setLayout(new BorderLayout(10, 10));
        this.add(northPanel, BorderLayout.NORTH);
        this.add(main, BorderLayout.CENTER);

        northPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        northPanel.add(header);

        GridLayout grid = new GridLayout(maxRows, maxCols);
        main.setLayout(grid);

        for(Subject s : party){
            SubjectDisplay display = new SubjectDisplay(s);
            main.add(display);
        }
    }
}
