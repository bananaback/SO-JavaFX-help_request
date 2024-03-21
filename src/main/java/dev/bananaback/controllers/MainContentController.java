package dev.bananaback.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.stereotype.Component;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;

@Component
public class MainContentController implements Initializable {
    @FXML
    private StackPane mainContentStackPane;

    @FXML
    private BorderPane containerBorderPane;

    public MainContentController() {

    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        mainContentStackPane.setMinWidth(500); // Set the minimum width
        mainContentStackPane.setMinHeight(350); // Set the minimum height

        containerBorderPane.setMinWidth(500);
        containerBorderPane.setMinHeight(350);
        containerBorderPane.setLayoutX(100);
    }
}
