package org.htlanich.schach;

import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SpielfeldGUIfx extends Application implements EventHandler <MouseEvent>{
	boolean pressed = false;
	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane Spielfeld = new GridPane();
		Spielfeld.getStylesheets().add(getClass().getResource("feldstyle.css").toExternalForm());
        SpielFeld sf = Spielfeldio.einlesen("start.txt");
		
		for(int x = 0; x < 8;x++)
        {
        	for(int y = 0; y < 8; y++)
        	{
        		String datName = sf.getFeld(x, y) + ".png.png";
        		Image fig = new Image(getClass().getResourceAsStream("Bilder/"+ datName));
        		Button feld = new Button();
        		feld.setGraphic(new ImageView(fig));
        		feld.setPrefSize(60,60);
        		feld.setMaxSize(60,60);
        		feld.getStyleClass().add("standartFeld");
        		        		
        		
        		
        		
        		
        		feld.setOnAction( event -> {
        		if(pressed == true)
        		{
        			feld.getStyleClass().removeAll("standaerFeld");
               		feld.getStyleClass().add("ausgeweahltesFeld");
        			pressed = false;
        		}else
        		{
        			feld.getStyleClass().removeAll("ausgeweahltesFeld");
               		feld.getStyleClass().add("standartFeld");
               		pressed = true;
        		}
        		});
        		
        		Spielfeld.add(feld, x, y);
        	}
        }
        

        
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
