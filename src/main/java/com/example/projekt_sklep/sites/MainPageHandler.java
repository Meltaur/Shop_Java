package com.example.projekt_sklep.sites;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class MainPageHandler {

    private static final String FXML_PATH = "src/main/resources/com/example/projekt_sklep/view/";

    @FXML
    private BorderPane mainBorderPane;

    @FXML
    private void handleShowView(ActionEvent e) throws MalformedURLException {
        String view = (String) ((Node)e.getSource()).getUserData();
        File file = new File(FXML_PATH+view);
        URL url = file.toURI().toURL();;
        loadFXML(url);
    }

    private void loadFXML(URL url) {
        try {
            FXMLLoader loader = new FXMLLoader(url);
            mainBorderPane.setCenter(loader.load());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
