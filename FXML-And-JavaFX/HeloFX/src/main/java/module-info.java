module com.example.helofx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.helofx to javafx.fxml;
    exports com.example.helofx;
}