package com.example.javfxdemo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage){
        Label helloLabel = new Label("Welcome, To kpsy.com");
        helloLabel.setFont(new Font(50));
        StackPane root = new StackPane();
        root.getChildren().add(helloLabel);
        Scene scene = new Scene(root, 300, 300);
        stage.setTitle("Hello with JavaFX");
        stage.show();

    }

    //public void start(Stage stage) throws IOException {
     //   FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
     //   Scene scene = new Scene(fxmlLoader.load(), 320, 240);
     //   stage.setTitle("Hello!");
     //   stage.setScene(scene);
     //   stage.show();
    //}

    public static void main(String[] args) {
        launch();
    }
}