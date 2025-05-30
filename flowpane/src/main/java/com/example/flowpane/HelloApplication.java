package com.example.flowpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        FlowPane flow = new FlowPane();
        flow.setHgap(10);
        flow.setVgap(10);

        for (int i = 1; i <= 8; i++) {
            flow.getChildren().add(new Button("Botón " + i));
        }

        flow.getChildren().add(new Label("Nombre"));
        flow.getChildren().add(new TextField());

        Scene scene = new Scene(flow, 300, 150);
        stage.setTitle("FlowPane");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
