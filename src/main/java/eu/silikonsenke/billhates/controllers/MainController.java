
package eu.silikonsenke.billhates.controllers;


import javafx.fxml.FXML;
import javafx.scene.control.SplitPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.text.Text;

public class MainController {

    @FXML
    private TabPane MainFrame;

    @FXML
    private Tab tabKundenverwaltung;

    @FXML
    private SplitPane divPaneKunden;

    @FXML
    private Text fensterBreite;

    @FXML
    private Text paneBreite;

    @FXML
    private Text paneDiv;

    public void textausgabe () {

        while (true) {
            paneBreite.setText(String.valueOf(divPaneKunden.getWidth()));
            paneDiv.setText(String.valueOf(divPaneKunden.getDividerPositions()));
            fensterBreite.setText(String.valueOf(MainFrame.getWidth()));
        }

    }
    @FXML
    void initialize() {

        textausgabe();
    }

}

