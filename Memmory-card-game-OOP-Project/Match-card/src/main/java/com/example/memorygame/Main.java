package com.example.memorygame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private static Scene mainMenuScene;

    @Override
    public void start(Stage stage) throws IOException {
        // Load the FXML File
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("MainMenu.fxml"));
        Parent root = fxmlLoader.load();

        // Create Scene Main Menu
        mainMenuScene = new Scene(root, 1280, 720);

        // Set the value for Stage
        stage.setTitle("Match Card!");
        stage.setScene(mainMenuScene);
        stage.show();
    }

    public static Scene getMainMenuScene() {
        return mainMenuScene;
    }

    public static void main(String[] args) {
        launch(args);
    }

}