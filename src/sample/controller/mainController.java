package sample.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class mainController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TabPane mainPane;

    @FXML
    private Tab tabCustomerManagement;

    @FXML
    private Tab tabPriceManagement;

    @FXML
    private Tab tabBillMaker;

    @FXML
    Button button;

    @FXML
    void initialize() {
        assert mainPane != null : "fx:id=\"mainPane\" was not injected: check your FXML file 'sample.fxml'.";
        assert tabCustomerManagement != null : "fx:id=\"tabCustomerManagement\" was not injected: check your FXML file 'sample.fxml'.";
        assert tabPriceManagement != null : "fx:id=\"tabPriceManagement\" was not injected: check your FXML file 'sample.fxml'.";
        assert tabBillMaker != null : "fx:id=\"tabBillMaker\" was not injected: check your FXML file 'sample.fxml'.";

    }
}
