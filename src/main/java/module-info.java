module com.example.projekt_sklep {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projekt_sklep to javafx.fxml;
    exports com.example.projekt_sklep;
}