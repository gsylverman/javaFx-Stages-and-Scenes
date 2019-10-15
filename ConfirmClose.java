package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class ConfirmClose extends Stage {
    public boolean daNu = false;

    public ConfirmClose() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ConfirmClose.fxml"));
            Parent layout = (Parent) fxmlLoader.load();
            initModality(Modality.APPLICATION_MODAL);
            Scene scene = new Scene(layout, 300, 200);
            setScene(scene);
            setTitle("Are tou sure?");
            showAndWait();

        } catch (IOException e) {
            System.out.println("er");
        }
    }
}
