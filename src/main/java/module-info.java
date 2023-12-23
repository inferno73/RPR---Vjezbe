module com.example.lab7_8 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab7_8 to javafx.fxml;
    exports com.example.lab7_8;
}