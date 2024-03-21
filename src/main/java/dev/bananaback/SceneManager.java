package dev.bananaback;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ConfigurableApplicationContext;

import dev.bananaback.controllers.BaseController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class SceneManager {
    private final Stage rootStage;
    private ConfigurableApplicationContext springContext;

    public SceneManager(Stage rootStage) {
        if (rootStage == null) {
            throw new IllegalArgumentException();
        }
        this.rootStage = rootStage;
    }

    public void setSpringContext(ConfigurableApplicationContext springContext) {
        this.springContext = springContext;
    }

    private final Map<String, Scene> scenes = new HashMap<>();

    public void switchingScene(String url) {
        Scene scene = scenes.computeIfAbsent(url, u -> {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(u));
            loader.setControllerFactory(springContext::getBean);
            try {
                Pane p = loader.load();
                BaseController controller = loader.getController();
                controller.setSceneManager(this);
                controller.styleSetup();
                return new Scene(p);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        rootStage.setScene(scene);
    }

    public void setStageSize(double x, double y) {
        rootStage.setWidth(x);
        rootStage.setHeight(y);
        rootStage.centerOnScreen();
    }

    public void showRootStage() {
        this.rootStage.show();
    }

    public void closeStage() {
        this.rootStage.close();
    }
}