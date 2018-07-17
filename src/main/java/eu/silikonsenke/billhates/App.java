package eu.silikonsenke.billhates;

import eu.silikonsenke.billhates.controllers.MainController;
import eu.silikonsenke.billhates.model.State;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.time.*;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * The main entry point of the application. Initializes the JavaFX UI as well as other required resources and services.
 *
 * The application logic should be delegated to the controllers and other components.
 */
public class App extends javafx.application.Application {
    double startPunktLatitude = 49.01235;
    double startPunktLongitude = 8.38557;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void init() throws Exception {
        super.init();
    }

    /**
     * Initialize JavaFX application and main window
     *
     * @param primaryStage
     * @throws Exception
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        //Setzen der Startwerte
      /*  State.getInstance().setStartpunkt(startPunkt);
        State.getInstance().setKategorien(leereListe);*/
        State.getInstance().setSystemzeit(ZonedDateTime.now()); // Für die genaue Uhrzeit muss diese Zeile noch umgeformt werden
        //Müssen noch weitere Startwerte festgelegt werden?

        //Laden der Views
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("MainView.fxml"));
//        loader.setLocation(getClass().getResource("MapView.fxml"));
//        loader.setLocation(getClass().getResource("RouteChooser.fxml"));
//        loader.setLocation(getClass().getResource("PoisInfo.fxml"));
        Parent root = loader.load();



        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();




    }
}
