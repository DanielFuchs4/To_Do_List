package com.example.aplikace_todolist;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField ukol;

    @FXML
    private TextArea popis;

    @FXML
    private ListView<Ukol> ukoly;

    @FXML
    protected void onulozitButtonClick() {
        ukoly.getItems().add(new Ukol(popis.getText(), ukol.getText()));
        popis.clear();
        ukol.clear();
    }

    @FXML
    protected void onhotovoButtonClick() {
        ukoly.
    }


}

