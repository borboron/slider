/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sldemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author 8753
 */
public class SliderDemo extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Slider sl = new Slider();
        // set the value of property min, 
        // max and value 
        sl.setMin(0); 
        sl.setMax(100); 
        sl.setValue(80); 
  
        // enable TickLabels and Tick Marks 
        sl.setShowTickLabels(true); 
        sl.setShowTickMarks(true); 
  
        sl.setBlockIncrement(10); 
         Label l = new Label();
        Button btn = new Button();
        btn.setText("Get value");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                double mass = sl.getValue();
                l.setText("Mass: " + mass);
            }
        });
        
       
        
        VBox root = new VBox();
        root.getChildren().add(btn);
        root.getChildren().add(sl);
        root.getChildren().add(l);
        
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
