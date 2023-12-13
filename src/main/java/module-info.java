module com.lucida.lucida {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires json.simple;


    opens com.lucida.lucida to javafx.fxml;
    exports com.lucida.lucida;
}