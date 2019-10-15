package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class SomethingNew1 {
    @FXML
    public AnchorPane anchorPane;


    public void goTomain(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader=new FXMLLoader(getClass().getResource("sample.fxml"));
            Parent layout=(Parent) fxmlLoader.load();
            Scene scene=(Scene) anchorPane.getScene();
            scene.setRoot(layout);
        }catch (IOException e){

        }


    }
}
