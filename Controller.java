package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {


    @FXML
    void exit() {
        System.exit(0);

    }

    @FXML
    private TextField inputField;

    @FXML
    private ListView<String> listView;

    @FXML
    private TextArea textArea;

    private final ObservableList<String> wordList = FXCollections.observableArrayList
            ();

    @FXML
    void initialize() {
        listView.setItems(wordList);
    }

    @FXML
    void sendMassage() {
        String massage = inputField.getText().trim();
        if (massage.length() != 0){
            addMassegeToList(massage);
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Input error");
            alert.setHeaderText("Ошибка ввода сообщения");
            alert.setContentText("Нельзя отправлять пустое сообщение");
            alert.show();

        }
        inputField.clear();
    }

    private void addMassegeToList(String massege){
        listView.getItems().add(massege);

    }

    @FXML
    void showAbout() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("About");
        alert.setHeaderText("Чат");
        alert.setContentText("Новогодний чат");
        alert.show();

    }


}
