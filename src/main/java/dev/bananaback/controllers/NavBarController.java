package dev.bananaback.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.stereotype.Component;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

@Component
public class NavBarController implements Initializable {

    @FXML
    private Button homeButton;
    @FXML
    private Button settingsButton;

    public NavBarController() {
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        homeButton.setMinWidth(200);
    }

    public void sayHello() {
        System.out.println("Hello world!");
    }
}
