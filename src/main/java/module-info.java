module com.example.javalaba {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javalaba to javafx.fxml;
    exports com.example.javalaba;
}