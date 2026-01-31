package main;

import javafx.application.Application;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

public class Main extends Application{
	
	Canvas tela = new Canvas(800,400);
	GraphicsContext gc = tela.getGraphicsContext2D();
	
	public void start(Stage fin) {
		
	}

	public static void main(String[] args) {
		launch(args);
	}

}
