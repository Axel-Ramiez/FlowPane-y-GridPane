package com.example.gridpane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        GridPane grid = new GridPane();

        Label l1 = new Label("Nombre:");
        TextField tf1 = new TextField();
        Button b1 = new Button("Enviar");;


        grid.add(l1, 0, 0);
        grid.add(tf1, 1, 0);
        grid.add(b1, 1, 1);

        grid.setHgap(10);
        grid.setVgap(10);

        Scene scene = new Scene(grid, 300, 150);
        stage.setTitle("Gridpane");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
