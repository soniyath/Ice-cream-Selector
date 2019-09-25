import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *Author : Yatharth Alpeshkumar Soni
 *Sheridan ID : 991503772
 *Submission Date : 2018/07/25 
 *Instructor : Haya Ghalayini
 *Project : Assignment4
 *Icecream Selection Application
 * 
 */
public class Assignment4 extends Application {
    

    Double total = 0.0;
    Double wholeTotal = 0.0;
	RadioButton sizeRadio1, sizeRadio2, sizeRadio3;
	RadioButton syrupRadio1, syrupRadio2, syrupRadio3;
	RadioButton cakeRadio1, cakeRadio2, cakeRadio3;
	RadioButton fruitRadio1, fruitRadio2, fruitRadio3;
	
	Script_Assignment4 script = new Script_Assignment4();
	Spinner spinner;
	TextArea screen;
	
	Label sizeLabel, syrupLabel, fruitLabel, cakeLabel;
	
	Button addButton, totalButton;
	
    @Override
    public void start(Stage primaryStage) {
    	
    	VBox leftVBox = new VBox();
    	leftVBox.setAlignment(Pos.CENTER_LEFT);

        Script_Assignment4 script = new Script_Assignment4();
        
        HBox sizeHBox = new HBox();
        sizeHBox.setStyle("-fx-padding: 10 20 10 20;");
        sizeHBox.setSpacing(10);

        
        
        //Size Area
        ToggleGroup size = new ToggleGroup();
        sizeLabel = new Label("Size :");
        sizeRadio1 = new RadioButton("Large");
        sizeRadio1.setToggleGroup(size);
        sizeRadio1.setStyle("-fx-padding: 10 20 10 20;");
        sizeRadio2 = new RadioButton("Medium");
        sizeRadio2.setToggleGroup(size);
        sizeRadio2.setStyle("-fx-padding: 10 20 10 20;");
        sizeRadio3 = new RadioButton("Small");
        sizeRadio3.setToggleGroup(size);
        sizeRadio3.setStyle("-fx-padding: 10 20 10 20;");
        sizeHBox.getChildren().addAll(sizeLabel, sizeRadio1, sizeRadio2, sizeRadio3);
        
        
        //Syrup Area
        HBox syrupHBox = new HBox();
        syrupHBox.setStyle("-fx-padding: 10 20 10 20;");
        syrupHBox.setSpacing(10);

        syrupLabel = new Label("Syrups :");
        ToggleGroup syrup = new ToggleGroup();
        
        syrupRadio1 = new RadioButton("Double");
        syrupRadio1.setToggleGroup(syrup);
        //syrupRadio1.setOnAction(e -> );
        
        syrupRadio2 = new RadioButton("Single");
        syrupRadio2.setToggleGroup(syrup);
        RadioButton syrupRadio3 = new RadioButton("None");
        syrupRadio3.setToggleGroup(syrup);
        
        syrupHBox.getChildren().addAll(syrupLabel, syrupRadio1, syrupRadio2, syrupRadio3);
        
        
        
        //Fruits Area
        HBox fruitHBox = new HBox();
        fruitHBox.setStyle("-fx-background-color: #F0291E;");
        fruitHBox.setStyle("-fx-padding: 10 20 10 20;");
        fruitHBox.setSpacing(10);

        fruitLabel = new Label("Fruits :");
        ToggleGroup fruit = new ToggleGroup();
        
        fruitRadio1  = new RadioButton("Double");
        fruitRadio1.setToggleGroup(fruit);
        fruitRadio2 = new RadioButton("Single");
        fruitRadio2.setToggleGroup(fruit);
        fruitRadio3 = new RadioButton("None");
        fruitRadio3.setToggleGroup(fruit);
        
        fruitHBox.getChildren().addAll(fruitLabel, fruitRadio1, fruitRadio2, fruitRadio3);
        
        
        
        //Cake Crumble Area
        HBox cakeHBox = new HBox();
        ToggleGroup cake = new ToggleGroup();
        
        cakeLabel = new Label("Cake Crumble :");
        cakeRadio1 = new RadioButton("Triple");
        cakeRadio1.setToggleGroup(cake);
        cakeRadio1.setStyle("-fx-padding: 10 20 10 20;");
        cakeRadio2 = new RadioButton("Double");
        cakeRadio2.setToggleGroup(cake);
        cakeRadio2.setStyle("-fx-padding: 10 20 10 20;");
        cakeRadio3 = new RadioButton("Single");
        cakeRadio3.setToggleGroup(cake);
        cakeRadio3.setStyle("-fx-padding: 10 20 10 20;");
        cakeHBox.setStyle("-fx-padding: 10 20 10 20;");
        cakeHBox.setSpacing(10);
        cakeHBox.getChildren().addAll(cakeLabel, cakeRadio1, cakeRadio2, cakeRadio3);
        
        
        //Ice-cream quantity
        HBox customHBox = new HBox();
        customHBox.setStyle("-fx-padding: 10 20 10 20;");
        customHBox.setSpacing(10);

        Label icecreamQuanDes = new Label("Quantity of the selected Ice-Cream :");

        spinner = new Spinner(0, 10, 1);
        
        customHBox.getChildren().addAll(icecreamQuanDes, spinner);
        
        
        HBox comboDes2HBox = new HBox();
        Label comboTitle = new Label("Combos");
        Label comboLabel1 = new Label("Large ice-cream, single crumble, no syrup, no fruit - $8.00");
        
        HBox comboTitleHBox = new HBox();
        comboTitleHBox.setStyle("-fx-padding: 10 20 10 20;");
        comboTitleHBox.setSpacing(10);
        HBox comboDes1HBox = new HBox();
        comboDes1HBox.setStyle("-fx-padding: 10 20 10 20;");
        comboDes1HBox.setSpacing(10);
       
        
        
        comboTitleHBox.getChildren().addAll(comboTitle);
        comboDes1HBox.getChildren().addAll(comboLabel1);
        Label comboLabel2 = new Label("Medium ice-cream, double crumble, double syrup, double fruit - $12.00");

        comboDes2HBox.getChildren().addAll(comboLabel2);
        comboDes2HBox.setStyle("-fx-padding: 10 20 10 20;");
        comboDes2HBox.setSpacing(10);
        
        //OuterMost HBox --- Boundary
        VBox outerArea = new VBox();
        outerArea.setStyle("-fx-background-color: #F0591E;");
        outerArea.setPadding(new Insets(10));
        outerArea.setSpacing(5);
        
        //The Title HBox......
        HBox mainTitleHBox = new HBox();
        mainTitleHBox.setStyle("-fx-background-color: #F0891E;");
        Label title = new Label("ICE-CREAM SELECTOR");;
        title.setFont(Font.font("Courier New", 50));
    
        mainTitleHBox.setAlignment(Pos.CENTER);
        mainTitleHBox.getChildren().addAll(title);

        
        
           

        //Text Area VBox
        VBox rightVBox = new VBox();
        rightVBox.setStyle("-fx-background-color: #F0291E;");
        leftVBox.setStyle("-fx-background-color: #F0291E;");
        
        rightVBox.setAlignment(Pos.CENTER_RIGHT);
 

        screen = new TextArea();
        rightVBox.getChildren().addAll(screen); 
        screen.setEditable(false);
        screen.setStyle("-fx-padding: 10 20 10 20;");
        screen.setStyle("-fx-highlight-fill: lightgray; -fx-highlight-text-fill: firebrick; -fx-font-size: 12px;");
        screen.setPrefHeight(420);
		screen.setPrefWidth(300);
        
        //Button HBox below Text Area VBox...
        HBox buttonSectionHBox = new HBox();
        totalButton = new Button("Total");
        buttonSectionHBox.getChildren().addAll(totalButton);
        totalButton.setStyle("-fx-padding: 10 20 10 20;");
        totalButton.setOnAction(e -> HandleEvent(e));
        
        //Adding button section in RightVBox
        rightVBox.getChildren().addAll(buttonSectionHBox);
        
        //Adding Add Button in LeftVbox
        HBox addButtonHBox = new HBox(); 
        addButton = new Button("ADD..");
        addButtonHBox.getChildren().addAll(addButton); 
        addButton.setStyle("-fx-padding: 10 20 10 20;");     
        addButtonHBox.setStyle("-fx-padding: 10 20 10 20;");
        addButtonHBox.setSpacing(10);
        addButton.setOnAction(e -> HandleEvent(e));
        
        //Combination of both the VBoxes
        HBox combinationHBox = new HBox();

        leftVBox.getChildren().addAll(sizeHBox, syrupHBox, fruitHBox, cakeHBox, customHBox, comboTitleHBox, comboDes1HBox, comboDes2HBox, addButtonHBox);
        leftVBox.setStyle("-fx-padding: 10 20 10 20;");
        leftVBox.setSpacing(10);
        

        combinationHBox.getChildren().addAll(leftVBox, rightVBox);       
        outerArea.getChildren().addAll(mainTitleHBox, combinationHBox);
        
        Scene scene = new Scene(outerArea, 800, 600);
        primaryStage.setTitle("<--Ice-cream Selection-->");
        primaryStage.setScene(scene);
        primaryStage.show();   
    }
	String sizeRadio = " ";
	String syrupRadio = " ";
	String fruitRadio = " ";
	String cakeRadio = " ";
	
    
        public void HandleEvent(ActionEvent e){
        	ArrayList<String> arr = new ArrayList<String>();
        	
        	if(e.getSource() == addButton) {
        		
        		//Size Radio
        		if(sizeRadio1.isSelected()) {
        			sizeRadio = "Large";
        		}
        		else if (sizeRadio2.isSelected()) {
        			sizeRadio = "Medium";
        		}
        		else {
        			sizeRadio = "Small";
        		}
        		
        		//Syrup radio
        		if(syrupRadio1.isSelected()) {
        			syrupRadio = "Double";
        		}
        		else if (syrupRadio2.isSelected()) {
        			syrupRadio = "Single";
        		}
        		else{
        			syrupRadio = "None";
        		}
        		
        		//fruit radio
        		if(fruitRadio1.isSelected()) {
        			fruitRadio = "Double";
        		}
        		else if (fruitRadio2.isSelected()) {
        			fruitRadio = "Single";
        		}
        		else{
        			fruitRadio = "None";
        		}
        		
        		//Cake radio
        		if(cakeRadio1.isSelected()) {
        			cakeRadio = "Triple";
        		}
        		else if (cakeRadio2.isSelected()) {
        			cakeRadio = "Double";
        		}
        		else{
        			cakeRadio = "Single";
        		}
        	
            int quantity = (int) spinner.getValue();
    		
        	double cost = script.getIcecreamCost(sizeRadio, syrupRadio, fruitRadio, cakeRadio);
        	quantity = (int) spinner.getValue();
          	double total = cost * quantity;
            String s = quantity +" - Your " +sizeRadio+ " ice-cream with " +syrupRadio+ " syrup " +fruitRadio+ " fruit and "+cakeRadio+" is : " +cost + " \n";
            screen.appendText(s);
          	wholeTotal += total;
        	
        		}
        	if(e.getSource() == totalButton) {
     		
        		String lastAmount = "The Total Amount is : " +wholeTotal+ " ";
    			screen.appendText(lastAmount+"\n ");
        		
        	}
        	
        	}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
