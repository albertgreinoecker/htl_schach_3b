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
	Button[][] mat = new Button[8][8];
	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane Spielfeld = new GridPane();
		Spielfeld.getStylesheets().add(getClass().getResource("feldstyle.css").toExternalForm());
        SpielFeld sf = Spielfeldio.einlesen("start.txt");
		
		for(int x = 0; x < 8;x++)
        {
        	for(int y = 0; y < 8; y++)
        	{
        		String datName = sf.getFeld(y, x) + ".png";
        		System.out.println(datName);
        		
        		Image fig = new Image("file:src/Bilder/"+datName);	//TODO subject to change
        		
        		Button feld = new Button();
        		feld.setGraphic(new ImageView(fig));
        		feld.setPrefSize(10,10);
        		feld.setMaxSize(10,10);
        		feld.getStyleClass().add("standartFeld");
        		
        		        		
        		
        		
        		
        		
        		feld.setOnAction( event -> {
        			Position act = getPos(feld);
        			if(sf.getFeld(act.x,act.y) instanceof Figur)
        			{
        				Figur f = (Figur)sf.getFeld(act.x,act.y);
        				System.out.println(f.getClass().getSimpleName());
	        		
        			for(int a = 0; a < 8;a++)
        	        {
        	        	for(int b = 0; b < 8; b++)
        	        	{			
        	        			if(f.spielzugMoeglich(sf, act , new Position (a, b)))
        	        			{
        	        				System.out.printf("moeglich: %d %d\n", a, b);
        	        				feld.getStyleClass().removeAll("standartFeld");
        	        				feld.getStyleClass().add("ausgeweahltesFeld");
        	        			}
        	        		}
        	        		
             	        }
        	        }
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
        		mat[y][x] = feld;
        		Spielfeld.add(feld, x, y);
        	}
        }
        

        
        Scene scene = new Scene(Spielfeld);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Spielfeld Schach");
		primaryStage.show();

	}
	private Position getPos(Button button)
	{
		for(int b = 0; b < 8;b++)
        {
        	for(int a = 0; a < 8; a++)
        	{ 
        		if (mat[a][b] == button)
        		{
        			Position p = new Position(a,b);
        			System.out.println(p.x + " " + p.y);
        			return p;
        		}
        	}
        	
        }
		return null;
	}
	private void scale(Image fig, int i) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void handle(MouseEvent event) {
		// TODO Auto-generated method stub
		
	}
	
	
}
