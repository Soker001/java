package com.example.trafficsignal;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;


public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create the traffic light circles
        Circle redLight = new Circle(50, Color.RED);
        Circle yellowLight = new Circle(50, Color.GRAY);
        Circle greenLight = new Circle(50, Color.GRAY);

        // Arrange the circles in a vertical layout
        VBox root = new VBox(10);
        root.getChildren().addAll(redLight, yellowLight, greenLight);

        // Create the scene and set the stage
        Scene scene = new Scene(root, 200, 600);
        primaryStage.setTitle("Traffic Signal Animation");
        primaryStage.setScene(scene);
        primaryStage.show();

        // Create a timeline for the animation
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(0), e -> {
                    redLight.setFill(Color.RED);
                    yellowLight.setFill(Color.GRAY);
                    greenLight.setFill(Color.GRAY);
                }),
                new KeyFrame(Duration.seconds(3), e -> {
                    redLight.setFill(Color.GRAY);
                    yellowLight.setFill(Color.YELLOW);
                    greenLight.setFill(Color.GRAY);
                }),
                new KeyFrame(Duration.seconds(6), e -> {
                    redLight.setFill(Color.GRAY);
                    yellowLight.setFill(Color.GRAY);
                    greenLight.setFill(Color.GREEN);
                }),
                new KeyFrame(Duration.seconds(9), e -> {
                    redLight.setFill(Color.RED);
                    yellowLight.setFill(Color.GRAY);
                    greenLight.setFill(Color.GRAY);
                })
        );

        // Set the cycle count to indefinite to keep the animation running
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    public static void main(String[] args) {
        launch(args);
    }
}