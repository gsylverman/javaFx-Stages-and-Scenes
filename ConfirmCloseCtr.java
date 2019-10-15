package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ConfirmCloseCtr implements Initializable {
    public AnchorPane layout;
    private static boolean daNu = false;

    public void schimbaDa(ActionEvent actionEvent) {
        Stage stage = (Stage) layout.getScene().getWindow();

        stage.close();
        Platform.exit();

    }

    public void schimbaNu(ActionEvent actionEvent) {
        Stage stage = (Stage) layout.getScene().getWindow();

        stage.close();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
