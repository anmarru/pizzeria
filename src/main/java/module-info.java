module andrea {
    requires javafx.controls;
    requires javafx.fxml;

    opens modelo to javafx.fxml;
    exports modelo;
}
