package com.javafx.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class ExampleApplication extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("registration_form.fxml"));
		primaryStage.setTitle("Deployment Import");
		
		Image cognosIcon = new Image(ExampleApplication.class.getResourceAsStream("logo.png"));
		primaryStage.getIcons().add(cognosIcon);
		
		primaryStage.setScene(new Scene(root, 800, 500));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
