package com.example.demo1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

public class HelloController {
    @FXML
    private Button managerButton;

    @FXML
    private Button customerButton;

    public void customerButton(ActionEvent event) {
        Stage stage = (Stage) customerButton.getScene().getWindow();
    }

    public void managerButton(ActionEvent event) {
        Stage stage = (Stage) managerButton.getScene().getWindow();
    }
}