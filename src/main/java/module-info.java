module andrea {
    /*requires javafx.controls;
    requires javafx.fxml;
    requires java.xml.bind;

    opens modelo to javafx.fxml;
    exports modelo;*/
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml.bind;
    requires com.opencsv;

    // Exportaciones y aperturas
    opens modelo.cliente to java.xml.bind;
    exports modelo.cliente;
    opens modelo to javafx.fxml;
    exports modelo;

    // Exporta y abre el paquete modelo.pedido para permitir acceso reflexivo
    exports modelo.pedido;
    opens modelo.pedido to java.xml.bind;
}
