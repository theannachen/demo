package com.theannachen.demo;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HelloApplication extends Application{
    private Pane root = new Pane();

    private Parent createContent(){
        root.setPrefSize(600, 800);

        return root;
    }

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setScene(new Scene(createContent()));
        stage.show();

    }

}