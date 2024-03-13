package com.gsy.so78152140;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Set;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {

        Set<UpdateState> states = Set.of(new UpdateState(
                new SimpleStringProperty("state"),
                new SimpleStringProperty("name")
        ));

        TreeTableUpdate view = new TreeTableUpdate(states);
        Scene scene = new Scene(new VBox(view, new Randomize(states)));

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}