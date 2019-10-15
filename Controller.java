package sample;

import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    public BorderPane borderPaine;
    @FXML
    public TreeView<String> treeView;



    public void next(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("somethingNew1.fxml"));
            Parent layout = fxmlLoader.load();
            Scene scene = (Scene) borderPaine.getScene();
            scene.setRoot(layout);
        } catch (IOException e) {
            System.out.println("err");
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        TreeItem<String> treeItem = new TreeItem<>("main");
        treeView.setRoot(treeItem);
        treeItem.setExpanded(true);
        TreeItem<String> ramura1 = creazaRamura("Ramura1", treeItem);
        creazaRamura("SubRamura 1", ramura1);
        creazaRamura("SubRamura 2", ramura1);
        creazaRamura("SubRamura 3", ramura1);
        creazaRamura("SubRamura 4", ramura1);

        TreeItem<String> ramura2 = creazaRamura("Ramura2", treeItem);
        creazaRamura("SubRamura 1", ramura2);
        creazaRamura("SubRamura 2", ramura2);
        creazaRamura("SubRamura 3", ramura2);
        creazaRamura("SubRamura 4", ramura2);
        TreeItem<String> ramura3 = creazaRamura("Ramura3", treeItem);

        treeView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println(treeView.getSelectionModel().getSelectedItem().getValue());
        });
    }



    private TreeItem<String> creazaRamura(String name, TreeItem<String> treeItem) {
        TreeItem<String> treeItem1 = new TreeItem<>(name);
        treeItem.getChildren().add(treeItem1);
        return treeItem1;
    }

    public void close(ActionEvent actionEvent) {
        new ConfirmClose();
    }

    @FXML
    public void info(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader=new FXMLLoader(Info.class.getResource("info.fxml"));
            Parent layout=fxmlLoader.load();
            Stage stage=new Stage();
            Scene scene=new Scene(layout);
            stage.setTitle("Help");
            stage.setScene(scene);
            stage.show();

        }catch (IOException e){

        }


    }
}
