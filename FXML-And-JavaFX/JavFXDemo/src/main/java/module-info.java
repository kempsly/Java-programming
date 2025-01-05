module com.example.javfxdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javfxdemo to javafx.fxml;
    exports com.example.javfxdemo;
}