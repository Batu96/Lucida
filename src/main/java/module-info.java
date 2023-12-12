module com.lucida.lucida {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.lucida.lucida to javafx.fxml;
    exports com.lucida.lucida;
}