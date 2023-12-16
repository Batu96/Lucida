module com.lucida.lucida {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires json.simple;


    opens com.lucida to javafx.fxml;
    exports com.lucida;
    exports com.lucida.bodyParts;
    opens com.lucida.bodyParts to javafx.fxml;
}