/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise11photonmanauismaria;

/**
 *
 * @author HP
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Subject math = new Subject("Math", "math.png", 4, 1.75);
        Subject bio = new Subject("Biology", "biology.png", 3, 2.0);
        Subject chem = new Subject("Chemistry", "chemistry.png", 3, 1.5);
        Subject physics = new Subject("Physics", "physics.png", 3, 1.75);
        Subject cs = new Subject("CS", "computer science.png", 1, 1.5);
        
        Subject displayedSubject = math;
        
        primaryStage.setTitle("Exercise 11");
        
        FlowPane root = new FlowPane();
        Scene scene = new Scene(root, 450, 450);
        primaryStage.setScene(scene);
        
        //Add subject image
        ImageView subjectImage = new ImageView();
        Image img = new Image(main.class.getResourceAsStream(displayedSubject.getImgFileName()));
        subjectImage.setImage(img);
        root.getChildren().add(subjectImage);
        
        //Add subject text
        Text subjectName = new Text(" Subject: " + displayedSubject.getName() + " ");
        subjectName.setFill(Color.BLACK);
        subjectName.setFont(new Font("Arial", 16));
        root.getChildren().add(subjectName);
        
        //Add subject units
        Text subjectUnits = new Text(" Units: " + String.valueOf(displayedSubject.getUnits()) + " ");
        subjectUnits.setFill(Color.BLACK);
        subjectUnits.setFont(new Font("Arial", 16));
        root.getChildren().add(subjectUnits);
        
        //Add subject grade
        Text subjectGrade = new Text(" Grade: " + String.valueOf(displayedSubject.getGrade()) + " ");
        subjectGrade.setFill(Color.BLACK);
        subjectGrade.setFont(new Font("Arial", 16));
        root.getChildren().add(subjectGrade);
        
       /* Adding a button */
        Button button = new Button("Next!");
        root.getChildren().add(button);
        
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
   
}
