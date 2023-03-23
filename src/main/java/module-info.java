module com.example.exa {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exa to javafx.fxml;
    exports com.example.exa;
}