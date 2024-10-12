package com.example.demo1;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.IOException;
import java.util.Objects;

public class HelloController {
    @FXML
    private Button managerButton;

    @FXML
    private Button customerButton;

    public void customerButton(ActionEvent event) {
        try {
            Parent customerView = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("orderdetails.fxml")));
            Scene customerScene = new Scene(customerView);
            Stage stage = (Stage) customerButton.getScene().getWindow();
            stage.setScene(customerScene);
            stage.setTitle("Customer Window");
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void managerButton(ActionEvent event) {
        Stage stage = (Stage) managerButton.getScene().getWindow();
    }

}
