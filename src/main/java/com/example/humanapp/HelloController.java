package com.example.humanapp;

import Human.Person;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField txtID;
    @FXML
    private TextField txtName;
    @FXML
    private TextField txtLastname;
    @FXML
    private TextArea tarShow;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onbtnSubmitButtonClick() {
        Person p = new Person();

        p.setId(txtID.getText());
        p.setName(txtName.getText());
        p.setLastname(txtLastname.getText());

        tarShow.setText(p.getId() + " " + p.getName() + " " + p.getLastname());
    }
}
