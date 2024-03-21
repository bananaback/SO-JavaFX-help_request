package dev.bananaback;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * JavaFX App
 */
@SpringBootApplication
public class App extends Application {
    private ConfigurableApplicationContext springContext;

    @Override
    public void init() throws Exception {
        springContext = SpringApplication.run(App.class);
    }

    @Override
    public void start(Stage stage) throws IOException {
        stage.setWidth(AppConfig.LOGIN_STAGE_WIDTH);
        stage.setHeight(AppConfig.LOGIN_STAGE_HEIGHT);
        stage.initStyle(StageStyle.UNDECORATED);
        SceneManager sceneManager = new SceneManager(stage);
        sceneManager.setSpringContext(springContext);
        sceneManager.switchingScene("/dev/bananaback/fxml/admin_login_page.fxml");
        sceneManager.showRootStage();
    }

    @Override
    public void stop() throws Exception {
        springContext.stop();
    }

    public static void main(String[] args) {
        launch(App.class, args);
    }

}