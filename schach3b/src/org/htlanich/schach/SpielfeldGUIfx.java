package org.htlanich.schach;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SpielfeldGUIfx extends Application implements EventHandler <MouseEvent>{
	Button feld;
	@Override
	public void start(Stage primaryStage) {
        GridPane Spielfeld = new GridPane();
        
        for(int x = 0; x < 9;x++)
        {
        	for(int y = 0; y < 9; y++)
        	{
        		Button feld = new Button();
        		feld.setPrefSize(60,60);
        		feld.setMaxSize(60,60);
        		Spielfeld.add(feld, x, y);
        	}
        }
        
        feld.setOnAction( event -> {
        	feld.setBackground(Color.RED);
        });
        
        Scene scene = new Scene(Spielfeld);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Spielfeld Schach");
		primaryStage.show();

	}
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void handle(MouseEvent event) {
		// TODO Auto-generated method stub
		
	}
	
	
}
