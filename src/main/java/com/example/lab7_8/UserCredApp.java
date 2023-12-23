package com.example.lab7_8;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

import java.io.IOException;

public class UserCredApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(UserCredApp.class.getResource("user_cred.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), Region.USE_COMPUTED_SIZE, Region.USE_COMPUTED_SIZE);
        stage.setTitle("Form");
        stage.setScene(scene);
        stage.show();
    }
//todo ne radi kad kliknem na listItem  i editujem ga --- fix! treba da se izmijeni postojeci objekat na koji je kliknuto, i ne treba se kreirati novi
    //todo testove napisati
    public static void main(String[] args) {
        launch();
    }
}