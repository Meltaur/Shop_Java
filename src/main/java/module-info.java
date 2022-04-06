module com.example.projekt_sklep {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projekt_sklep.sites to javafx.fxml;
    exports com.example.projekt_sklep;
}