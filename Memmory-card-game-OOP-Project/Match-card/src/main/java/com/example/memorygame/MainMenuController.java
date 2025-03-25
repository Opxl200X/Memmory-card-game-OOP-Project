package com.example.memorygame;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.Desktop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainMenuController {

    @FXML
    private void handleStartGame(ActionEvent event) throws IOException {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("memory-game.fxml"));
            Parent root = fxmlLoader.load();

            // Create new Scene
            Scene scene = new Scene(root, 1280, 720);

            // Stage (current scene) from ActionEvent
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            // Go to Scene Memory Game
            stage.setTitle("Match Card!");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void handleHowtoplay() {
        String videoUrl = "https://youtu.be/1soQaJEh0hU";
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new URI(videoUrl));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    private void handleExit(ActionEvent event) {
        System.out.println("Exiting Game...");
        Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        stage.close();
    }
}
