package dev.bananaback.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dev.bananaback.AppConfig;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

@Component
public class MainLayoutController extends BaseController implements Initializable {
    private MainContentController mainContentController;
    private NavBarController navBarController;

    @FXML
    private BorderPane mainLayoutBorderPane;

    public MainLayoutController() {
        System.out.println("Main layout controller constructed");

    }

    @Autowired
    public MainLayoutController(MainContentController mainContentController, NavBarController navBarController) {
        this.mainContentController = mainContentController;
        this.navBarController = navBarController;
        System.out.println("Main layout controller constructed");
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        navBarController.sayHello();
        System.out.println("Main layout controller initialized");
    }

    @Override
    public void styleSetup() {

        mainLayoutBorderPane.setMinSize(AppConfig.MAIN_STAGE_WIDTH,
                AppConfig.MAIN_STAGE_HEIGHT - AppConfig.MAIN_STAGE_NAV_BAR_HEIGHT);
        mainLayoutBorderPane.setPrefSize(AppConfig.MAIN_STAGE_WIDTH,
                AppConfig.MAIN_STAGE_HEIGHT - AppConfig.MAIN_STAGE_NAV_BAR_HEIGHT);

        System.out.println(mainLayoutBorderPane.getWidth());
        System.out.println(mainLayoutBorderPane.getHeight());
        System.out.println("Main layout controller style set");

    }
}
