module com.example.proyectoud1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires com.almasb.fxgl.all;

    opens com.example.proyectoud1 to javafx.fxml;
    exports com.example.proyectoud1;
    exports com.example.proyectoud1.controller;
    opens com.example.proyectoud1.controller to javafx.fxml;
}