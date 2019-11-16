/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbhboxjfxw2019;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Irina
 */
public class NBHBoxJFxW2019 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        TextField tfcels = new TextField();
        TextField tffahr = new TextField(); 
        
        Label celsius = new Label("Celsius");
        Label fahrenheit = new Label("Fahrenheit");
        
        Button bcalc = new Button();
        bcalc.setText("Calculeaza");
        bcalc.setStyle("-fx-background-color: yellow; -fx-text-fill: red;" );
        bcalc.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //throw new UnsupportedOperationException("Not supported yet."); 
                //To change body of generated methods, choose Tools | Templates.
                double cels = Double.parseDouble(tfcels.getText());
                System.out.println(cels);
                double fahr = cels * 9/5 + 32;
                tffahr.setText(String.valueOf(fahr));
            }
        });
        
        //TextField tffahr = new TextField(); 
        
        Button btn = new Button();
        btn.setText("Inchide");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                //System.out.println("Hello World!");
                System.exit(0);
            }
        });
        
        HBox hbox = new HBox();
        hbox.setMargin(btn, new Insets(20,20,20,20));
        hbox.setMargin(tfcels, new Insets(20,20,20,20));
        hbox.setMargin(bcalc, new Insets(20,20,20,20));
        hbox.setMargin(tffahr, new Insets(20,20,20,20));
        hbox.setMargin(celsius, new Insets(20,20,20,20));
        hbox.setMargin(fahrenheit, new Insets(20,20,20,20));
        
        ObservableList list = hbox.getChildren();
        list.addAll(celsius, tfcels, bcalc, fahrenheit, tffahr, btn);
        
        StackPane root = new StackPane();
        root.getChildren().add(hbox);
        
        Scene scene = new Scene(root, 800, 100);
        
        primaryStage.setTitle("Convertor Celsius in Fahrenheit!");
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
